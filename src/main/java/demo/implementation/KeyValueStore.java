package demo.implementation;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rchappa1 on 12/14/18.
 */
@Component
public interface KeyValueStore {

    /**
     * Process operation readItem.
     *
     * @param tsqName
     * @param itemNum
     * @return
     */
    Object readItem ( String tsqName, int itemNum ) throws StoreException;

    /**
     * Process operation readItems.
     *
     * @param itemNum
     * @param tsqName
     * @return
     */
    List<Object> readItems ( int itemNum, String tsqName ) throws StoreException;

    /**
     * Process operation readItems.
     *
     * @param tsqName
     * @return
     */
    List<Object> readItems ( String tsqName ) throws StoreException;

    /**
     * Process operation appendItem.
     *
     * @param tsqName
     * @param item
     * @return
     */
    Integer appendItem ( String tsqName, Object item )throws StoreException;

    /**
     * Process operation rewriteItem.
     *
     * @param tsqName
     * @param itemNum
     * @param item
     * @return
     */
   Integer rewriteItem ( String tsqName, int itemNum, Object item ) throws StoreException;

    /**
     * Process operation deleteQueue.
     *
     * @param tsqName
     */

    void deleteQueue ( String tsqName ) throws StoreException;

    /**
     * Process operation storeCommArea.
     *
     * @param commArea
     */
    //void storeCommArea(Object commArea);

    /**
     * Process operation readCommArea.
     *
     * @return
     */
    //Object readCommArea();

    /**
     * Process operation listTSQNames.
     *
     * @return
     */
    List<String> listTSQNames ( );

    /**
     * Process operation listTSQNamesStartingAt.
     *
     * @return
     */
    List<String> listTSQNamesStartingAt ( String prefix );

    public String logTsqDetails ( );
}
