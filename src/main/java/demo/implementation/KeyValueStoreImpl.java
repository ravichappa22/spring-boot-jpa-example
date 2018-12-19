package demo.implementation;

import demo.model.TemporaryStorageQEntity;
import demo.repository.TSQRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.SerializationUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rchappa1 on 12/14/18.
 */
@Service
public class KeyValueStoreImpl implements KeyValueStore {

    private static final Logger LOGGER = LoggerFactory.getLogger (KeyValueStoreImpl.class);

    @Autowired
    private TSQRepository tsqRepository;

    /**
     * Reads one item from the Queue
     *
     * @param tsqName
     *            Name of the queue
     * @param itemNum
     *            Position of the item to read in the queue
     * @return Item at the specified position, null if the item does not exist
     * @throws StoreException
     *             with the following response code:
     *             16 - tsqName is null
     *             54 - Unexpected exception
     *             44 - tsqName doesn't exist
     */
    public Object readItem(String tsqName, int itemNum) throws StoreException {
        LOGGER.debug("***************At Tsq readItem(String tsqName, int itemNum)***************\n" + logTsqDetails() );
        LOGGER.debug("                                   ");
        if (tsqName == null){
            throw new StoreException(StoreException.INVREQ);
        }

        try{
            List<TemporaryStorageQEntity> tsq = tsqRepository.getAllByQueueName(tsqName);
            //List<Object> tsq = kvsMap.get(tsqName);

            if (tsq == null){
                throw new StoreException(StoreException.QIDERR);
            }
            TemporaryStorageQEntity item = null;
            Object savedObject = null;
            if (itemNum < tsq.size()){
                item = tsq.get(itemNum);
                savedObject = SerializationUtils.deserialize (item.getObjectCLob ());
            }
            return savedObject;
        }catch(Exception e){
            throw new StoreException(StoreException.ISCINVREQ);
        }

    }

    /**
     * Reads the queue from the specified position and return all items after
     * that.
     *
     * @param tsqName
     *            Name of the queue
     * @param itemNum
     *            Position of the first item to read in the queue
     * @return A list of non null items starting at the specified position. Empty list
     * 		   if there is no non null item from that position to the end.
     * @throws StoreException
     *            with the following response code:
     *            16 - tsqName is null
     *            54 - Unexpected exception
     *            44- tsqName doesn't exist
     */
    public List<Object> readItems(int itemNum, String tsqName) throws StoreException {
        LOGGER.debug("***************At Tsq readItems(int itemNum, String tsqName)***************\n"+ logTsqDetails()  );
        LOGGER.debug("                                   ");
        if (tsqName == null) {
            throw new StoreException(StoreException.INVREQ);
        }

        try{
            List<TemporaryStorageQEntity> tsq = tsqRepository.getAllByQueueName(tsqName);
            //List<Object> tsq = kvsMap.get(tsqName);
            if (tsq == null){
                throw new StoreException(StoreException.QIDERR);
            }
            List<Object> result = new ArrayList<> ();
            if (itemNum < tsq.size()){
                for (int i=itemNum; i < tsq.size(); i++){

                    TemporaryStorageQEntity item = tsq.get(i);
                    // only add non null items in the results
                    if (item !=null){
                        Object savedObject = SerializationUtils.deserialize (item.getObjectCLob ());
                        result.add(savedObject);
                    }
                }
            }
            return result;
        } catch (Exception e) {
            throw new StoreException(StoreException.ISCINVREQ);
        }
    }

    /**
     * Reads the queue and return all items.
     *
     * @param tsqName
     *            Name of the queue
     * @return A list of all the non null items in the queue
     * @throws StoreException
     *             with the following response code:
     *             16 - tsqName is null
     *             54 - Unexpected exception
     *             44- tsqName doesn't exist
     */
    public List<Object> readItems(String tsqName) throws StoreException {
        LOGGER.info("***************At Tsq readItems BEFORE APPEND(String tsqName) ***************\n" + logTsqDetails() );
        LOGGER.debug("                                   ");
        if (tsqName == null) {
            throw new StoreException(StoreException.INVREQ);
        }

        try{
            List<TemporaryStorageQEntity> tsq = tsqRepository.getAllByQueueName(tsqName);
            //List<Object> tsq = kvsMap.get(tsqName);
            if (tsq == null){
                throw new StoreException(StoreException.QIDERR);
            }
            List<Object> result = new ArrayList<>();
            for (int i=0; i < tsq.size(); i++){

                TemporaryStorageQEntity item = tsq.get(i);
                // only add non null items in the results
                if (item !=null){
                    Object savedObject = SerializationUtils.deserialize (item.getObjectCLob ());
                    result.add(savedObject);
                }
            }
            LOGGER.debug("***************At Tsq readItems BEFORE AFTER(String tsqName) ***************\n" + logTsqDetails() );

            return result;
        } catch (Exception e) {
            LOGGER.error ("error", e);
            throw new StoreException(StoreException.ISCINVREQ);
        }
    }

    public String logTsqDetails() {
        String debug ="";
        List<String> tsqNames = tsqRepository.retrieveAllQNames();
        Iterator<String> tsqIterator = tsqNames.iterator();
        while (tsqIterator.hasNext()){
            String  tsqName = tsqIterator.next();
            List<TemporaryStorageQEntity> tsqObjects = tsqRepository.getAllByQueueName(tsqName);
            debug = debug+ " ***** TSQ NAME "+tsqName +" SIZE -->" +tsqObjects.size() +"***** ;";
        }
        return debug;
    }

    /**
     * Write an item at the end of the queue at the specified position. Returns
     * the number of items in the queue.
     *
     * @param tsqName
     *            Name of the queue
     * @param item
     *            The item to read
     * @param itemNum
     *            Position of the first item to read in the queue
     * @return The number of items in the queue.
     * @throws StoreException
     *             with the following response code.
     *             16 - tsqName is null
     *             54 - Unexpected exception
     */
    @Transactional
    public Integer appendItem(String tsqName, Object item) throws StoreException {
        LOGGER.debug("***************At Tsq appendItem(String tsqName, Object item) ***************\n" + logTsqDetails());
        LOGGER.debug("                                   ");
        if (tsqName == null){
            throw new StoreException(StoreException.INVREQ);
        }
        try{
            List<Object> tsq = null;
            Integer maxItemNumbber = tsqRepository.getMaxItemNumberOnQueue(tsqName);
            Integer nextNumber = maxItemNumbber == null ? 0 : maxItemNumbber+1;
            //tsq.add(item);
            tsqRepository.save(new TemporaryStorageQEntity (tsqName, nextNumber, SerializationUtils.serialize(item)));
            return nextNumber;
        }catch(Exception e){
            LOGGER.error ("Error" , e);
            throw new StoreException(StoreException.ISCINVREQ);
        }

    }

    /**
     * Write an item in the queue at the specified position. Returns the number
     * of items in the queue.
     *
     * @param tsqName
     *            Name of the queue
     * @param item
     *            The item to read
     * @param itemNum
     *            Position of the first item to read in the queue
     * @return The number of items in the queue.
     * @throws StoreException
     *             with the following response code:
     *             16 - tsqName is null
     *             54 - Unexpected exception
     *             26 - itemNum does not correspond to an
     *             existing item in the queue
     *             44 - tsqName doesn't exist
     */
    @Transactional
    public Integer rewriteItem(String tsqName, int itemNum, Object item) throws StoreException {
        LOGGER.debug("***************At Tsq rewriteItem(String tsqName, int itemNum, Object item) ***************\n"+ logTsqDetails()  );
        LOGGER.debug("                                   ");
        if (tsqName == null){
            throw new StoreException(StoreException.INVREQ);
        }
        try{
            //List<Object> tsq = kvsMap.get(tsqName);
            List<TemporaryStorageQEntity> tsq = tsqRepository.getAllByQueueName(tsqName);
            TemporaryStorageQEntity temporaryStorageQEntity = tsqRepository.readByQueueNameAndItemNumber(tsqName, itemNum);
            if (temporaryStorageQEntity == null){
                throw new StoreException(StoreException.QIDERR);
            }
            if (itemNum >= tsq.size ())
            {
                throw new StoreException(StoreException.ITEMERR);
            }
            //tsq.set(itemNum, item);
            temporaryStorageQEntity.setObjectCLob(SerializationUtils.serialize (item));
            tsqRepository.save(temporaryStorageQEntity);
            return tsq.size();
        }catch(Exception e){
            LOGGER.error ("read error=" + e);
            throw new StoreException(54);
        }
    }

    /**
     * Delete the queue from the Key-Value Store.
     * @param tsqName
     *            Name of the queue
     * @throws StoreException
     *             with the following response code:
     *             16 - tsqName is null
     *             54 - Unexpected exception
     * */
    @Transactional
    public void deleteQueue(String tsqName) throws StoreException{
        LOGGER.debug("***************At Tsq deleteQueue(String tsqName) ***************\n"+ logTsqDetails()  );
        LOGGER.debug("                                   ");
        if (tsqName == null){
            throw new StoreException(StoreException.INVREQ);
        }
        try{
            //kvsMap.remove(tsqName);
            tsqRepository.deleteAllByQueueName(tsqName);
        }catch(Exception e){
            throw new StoreException(StoreException.ISCINVREQ);
        }
    }

    /**
     * Stores the CommArea object in the KeyValueStore
     * */
    /*public void storeCommArea(Object commArea){
        threadLocalCommArea.set(commArea);
    }*/

    /**
     * Returns the stored CommArea object or null if non has
     * been saved.
     * */
    /*public Object readCommArea(){
        return threadLocalCommArea.get();
    }*/

    /**
     * Returns a list of all registered TSQ names, alphabetically ordered
     * and starting at the first queue that starts with the specified prefix.
     * If no queue name starts with the prefix, the list will be empty.
     * @param	prefix		Prefix thta will be used to locate the first queue name
     * 						to include in the list.
     * @return				List of the registered queue names, ordered alphabetically
     * */
    public List<String> listTSQNamesStartingAt(String prefix){
        LOGGER.debug("***************At Tsq listTSQNamesStartingAt(String prefix) ***************\n"+ logTsqDetails()  );
        List<String> result =new ArrayList<>();
        //Iterator<String> tsqNames = kvsMap.keySet().iterator();
        List<String> queueNames = tsqRepository.retrieveAllQNames ();
        Iterator<String> tsqNames = queueNames.iterator ();
        if (prefix == null){
            while (tsqNames.hasNext()){
                result.add(tsqNames.next());
            }
        }
        else{
            boolean addNames = false;
            while (tsqNames.hasNext()){
                String name = tsqNames.next();
                if (name.startsWith(prefix)){
                    addNames = true;
                }
                if (addNames){
                    result.add(name);
                }
            }
        }
        return result;
    }

    /**
     * Returns a list of all registered TSQ names, alphabetically ordered.
     * @return				List of the registered queue names, alphabetically ordered
     * */
    public List<String> listTSQNames(){
        return listTSQNamesStartingAt(null);
    }

}
