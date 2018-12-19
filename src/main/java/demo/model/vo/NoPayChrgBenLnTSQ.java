package demo.model.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class NoPayChrgBenLnTSQ.
 * 
 * Legacy Mapping: NP-CHARGE-LN
 * 
 * Entities layer bean
 * @see Serializable
 */

public class NoPayChrgBenLnTSQ implements Serializable {

	// Serial UID
	private static final long serialVersionUID = 1L;
	
/**
	 * Property npScreenNum.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-SCREEN-NUM<=>NpChargeLn.npScreenNum
	 * Legacy Type: PIC S9(002)
	 */
	private Integer npScreenNum = 0;

/**
	 * Property npRendProvName.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-REND-PROV-NAME<=>NpChargeLn.npRendProvName
	 * Legacy Type: PIC  X(035)
	 */
	private String npRendProvName = "";

/**
	 * Property npRendProvNpi.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-REND-PROV-NPI<=>NpChargeLn.npRendProvNpi
	 * Legacy Type: PIC S9(010)
	 */
	private Long npRendProvNpi = Long.valueOf(0);

/**
	 * Property npServiceFromDate.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-SERVICE-FROM-DATE<=>NpChargeLn.npServiceFromDate
	 * Legacy Type: PIC S9(007)
	 */
	private Integer npServiceFromDate = 0;

/**
	 * Property npServiceToDate.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-SERVICE-TO-DATE<=>NpChargeLn.npServiceToDate
	 * Legacy Type: PIC S9(007)
	 */
	private Integer npServiceToDate = 0;

/**
	 * Property npChargeAmt.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CHARGE-AMT<=>NpChargeLn.npChargeAmt
	 * Legacy Type: PIC S9(007)V99
	 */
	private BigDecimal npChargeAmt = BigDecimal.ZERO;

/**
	 * Property npCptCode.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CPT-CODE<=>NpChargeLn.npCptCode
	 * Legacy Type: PIC  X(005)
	 */
	private String npCptCode = "";

/**
	 * Property npMod1.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-MOD1<=>NpChargeLn.npMod1
	 * Legacy Type: PIC  X(002)
	 */
	private String npMod1 = "";

/**
	 * Property npMod2.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-MOD2<=>NpChargeLn.npMod2
	 * Legacy Type: PIC  X(002)
	 */
	private String npMod2 = "";

/**
	 * Property npMod3.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-MOD3<=>NpChargeLn.npMod3
	 * Legacy Type: PIC  X(002)
	 */
	private String npMod3 = "";

/**
	 * Property npMod4.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-MOD4<=>NpChargeLn.npMod4
	 * Legacy Type: PIC  X(002)
	 */
	private String npMod4 = "";

/**
	 * Property npIcdPtr1.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-ICD-PTR-1<=>NpChargeLn.npIcdPtr1
	 * Legacy Type: PIC S9(005)
	 */
	private Integer npIcdPtr1 = 0;

/**
	 * Property npIcdPtr2.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-ICD-PTR-2<=>NpChargeLn.npIcdPtr2
	 * Legacy Type: PIC S9(005)
	 */
	private Integer npIcdPtr2 = 0;

/**
	 * Property npIcdPtr3.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-ICD-PTR-3<=>NpChargeLn.npIcdPtr3
	 * Legacy Type: PIC S9(005)
	 */
	private Integer npIcdPtr3 = 0;

/**
	 * Property npIcdPtr4.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-ICD-PTR-4<=>NpChargeLn.npIcdPtr4
	 * Legacy Type: PIC S9(005)
	 */
	private Integer npIcdPtr4 = 0;

/**
	 * Property npBillProvKey.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-BILL-PROV-KEY<=>NpChargeLn.npBillProvKey
	 * Legacy Type: PIC S9(005)
	 */
	private Integer npBillProvKey = 0;

/**
	 * Property npNoPayInd.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-NO-PAY-IND<=>NpChargeLn.npNoPayInd
	 * Legacy Type: PIC  9(001)
	 */
	private Integer npNoPayInd = 0;

/**
	 * Property npHaInd.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-HA-IND<=>NpChargeLn.npHaInd
	 * Legacy Type: PIC  X(001)
	 */
	private String npHaInd = "";

/**
	 * Property npPpCnt.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-PP-CNT<=>NpChargeLn.npPpCnt
	 * Legacy Type: PIC S9(003)
	 */
	private Integer npPpCnt = 0;

/**
	 * Property npChPpEntrys.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CH-PP-ENTRY<=>NpChargeLn.npChPpEntrys
	 * Legacy Type: NpChPpEntry
	 * Legacy Occurs: 12
	 */
	private List<NoPayChrgBenPpEntry> npChPpEntrys = new ArrayList<NoPayChrgBenPpEntry>();

/**
	 * Property npPlanCode.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-PLAN-DATA.NP-PLAN-CODE<=>NpChargeLn.npPlanCode
	 * Legacy Type: PIC  X(002)
	 */
	private String npPlanCode = "";

/**
	 * Property npPlanInd.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-PLAN-DATA.NP-PLAN-IND<=>NpChargeLn.npPlanInd
	 * Legacy Type: PIC  X(001)
	 */
	private String npPlanInd = "";

/**
	 * Property npServiceCode.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-TYPE-OF-SERVICE.NP-SERVICE-CODE<=>NpChargeLn.npServiceCode
	 * Legacy Type: PIC  X(001)
	 */
	private String npServiceCode = "";

/**
	 * Property npTypeCode.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-TYPE-OF-SERVICE.NP-TYPE-CODE<=>NpChargeLn.npTypeCode
	 * Legacy Type: PIC  X(001)
	 */
	private String npTypeCode = "";


	/**
	 * Getter method for npScreenNum.
	 * @return {@link Integer} the  npScreenNum
	 */
	public Integer getNpScreenNum() {
		return this.npScreenNum;
	}

	/**
	 * Setter method for npScreenNum
	 * @param npScreenNum {@link Integer} the npScreenNum
	 */
	public void setNpScreenNum(Integer npScreenNum) {
		this.npScreenNum = npScreenNum;
	}
	/**
	 * Getter method for npRendProvName.
	 * @return {@link String} the  npRendProvName
	 */
	public String getNpRendProvName() {
		return this.npRendProvName;
	}

	/**
	 * Setter method for npRendProvName
	 * @param npRendProvName {@link String} the npRendProvName
	 */
	public void setNpRendProvName(String npRendProvName) {
		this.npRendProvName = npRendProvName;
	}
	/**
	 * Getter method for npRendProvNpi.
	 * @return {@link Long} the  npRendProvNpi
	 */
	public Long getNpRendProvNpi() {
		return this.npRendProvNpi;
	}

	/**
	 * Setter method for npRendProvNpi
	 * @param npRendProvNpi {@link Long} the npRendProvNpi
	 */
	public void setNpRendProvNpi(Long npRendProvNpi) {
		this.npRendProvNpi = npRendProvNpi;
	}
	/**
	 * Getter method for npServiceFromDate.
	 * @return {@link Integer} the  npServiceFromDate
	 */
	public Integer getNpServiceFromDate() {
		return this.npServiceFromDate;
	}

	/**
	 * Setter method for npServiceFromDate
	 * @param npServiceFromDate {@link Integer} the npServiceFromDate
	 */
	public void setNpServiceFromDate(Integer npServiceFromDate) {
		this.npServiceFromDate = npServiceFromDate;
	}
	/**
	 * Getter method for npServiceToDate.
	 * @return {@link Integer} the  npServiceToDate
	 */
	public Integer getNpServiceToDate() {
		return this.npServiceToDate;
	}

	/**
	 * Setter method for npServiceToDate
	 * @param npServiceToDate {@link Integer} the npServiceToDate
	 */
	public void setNpServiceToDate(Integer npServiceToDate) {
		this.npServiceToDate = npServiceToDate;
	}
	/**
	 * Getter method for npChargeAmt.
	 * @return {@link BigDecimal} the  npChargeAmt
	 */
	public BigDecimal getNpChargeAmt() {
		return this.npChargeAmt;
	}

	/**
	 * Setter method for npChargeAmt
	 * @param npChargeAmt {@link BigDecimal} the npChargeAmt
	 */
	public void setNpChargeAmt(BigDecimal npChargeAmt) {
		this.npChargeAmt = npChargeAmt;
	}
	/**
	 * Getter method for npCptCode.
	 * @return {@link String} the  npCptCode
	 */
	public String getNpCptCode() {
		return this.npCptCode;
	}

	/**
	 * Setter method for npCptCode
	 * @param npCptCode {@link String} the npCptCode
	 */
	public void setNpCptCode(String npCptCode) {
		this.npCptCode = npCptCode;
	}
	/**
	 * Getter method for npMod1.
	 * @return {@link String} the  npMod1
	 */
	public String getNpMod1() {
		return this.npMod1;
	}

	/**
	 * Setter method for npMod1
	 * @param npMod1 {@link String} the npMod1
	 */
	public void setNpMod1(String npMod1) {
		this.npMod1 = npMod1;
	}
	/**
	 * Getter method for npMod2.
	 * @return {@link String} the  npMod2
	 */
	public String getNpMod2() {
		return this.npMod2;
	}

	/**
	 * Setter method for npMod2
	 * @param npMod2 {@link String} the npMod2
	 */
	public void setNpMod2(String npMod2) {
		this.npMod2 = npMod2;
	}
	/**
	 * Getter method for npMod3.
	 * @return {@link String} the  npMod3
	 */
	public String getNpMod3() {
		return this.npMod3;
	}

	/**
	 * Setter method for npMod3
	 * @param npMod3 {@link String} the npMod3
	 */
	public void setNpMod3(String npMod3) {
		this.npMod3 = npMod3;
	}
	/**
	 * Getter method for npMod4.
	 * @return {@link String} the  npMod4
	 */
	public String getNpMod4() {
		return this.npMod4;
	}

	/**
	 * Setter method for npMod4
	 * @param npMod4 {@link String} the npMod4
	 */
	public void setNpMod4(String npMod4) {
		this.npMod4 = npMod4;
	}
	/**
	 * Getter method for npIcdPtr1.
	 * @return {@link Integer} the  npIcdPtr1
	 */
	public Integer getNpIcdPtr1() {
		return this.npIcdPtr1;
	}

	/**
	 * Setter method for npIcdPtr1
	 * @param npIcdPtr1 {@link Integer} the npIcdPtr1
	 */
	public void setNpIcdPtr1(Integer npIcdPtr1) {
		this.npIcdPtr1 = npIcdPtr1;
	}
	/**
	 * Getter method for npIcdPtr2.
	 * @return {@link Integer} the  npIcdPtr2
	 */
	public Integer getNpIcdPtr2() {
		return this.npIcdPtr2;
	}

	/**
	 * Setter method for npIcdPtr2
	 * @param npIcdPtr2 {@link Integer} the npIcdPtr2
	 */
	public void setNpIcdPtr2(Integer npIcdPtr2) {
		this.npIcdPtr2 = npIcdPtr2;
	}
	/**
	 * Getter method for npIcdPtr3.
	 * @return {@link Integer} the  npIcdPtr3
	 */
	public Integer getNpIcdPtr3() {
		return this.npIcdPtr3;
	}

	/**
	 * Setter method for npIcdPtr3
	 * @param npIcdPtr3 {@link Integer} the npIcdPtr3
	 */
	public void setNpIcdPtr3(Integer npIcdPtr3) {
		this.npIcdPtr3 = npIcdPtr3;
	}
	/**
	 * Getter method for npIcdPtr4.
	 * @return {@link Integer} the  npIcdPtr4
	 */
	public Integer getNpIcdPtr4() {
		return this.npIcdPtr4;
	}

	/**
	 * Setter method for npIcdPtr4
	 * @param npIcdPtr4 {@link Integer} the npIcdPtr4
	 */
	public void setNpIcdPtr4(Integer npIcdPtr4) {
		this.npIcdPtr4 = npIcdPtr4;
	}
	/**
	 * Getter method for npBillProvKey.
	 * @return {@link Integer} the  npBillProvKey
	 */
	public Integer getNpBillProvKey() {
		return this.npBillProvKey;
	}

	/**
	 * Setter method for npBillProvKey
	 * @param npBillProvKey {@link Integer} the npBillProvKey
	 */
	public void setNpBillProvKey(Integer npBillProvKey) {
		this.npBillProvKey = npBillProvKey;
	}
	/**
	 * Getter method for npNoPayInd.
	 * @return {@link Integer} the  npNoPayInd
	 */
	public Integer getNpNoPayInd() {
		return this.npNoPayInd;
	}

	/**
	 * Setter method for npNoPayInd
	 * @param npNoPayInd {@link Integer} the npNoPayInd
	 */
	public void setNpNoPayInd(Integer npNoPayInd) {
		this.npNoPayInd = npNoPayInd;
	}
	/**
	 * Getter method for npHaInd.
	 * @return {@link String} the  npHaInd
	 */
	public String getNpHaInd() {
		return this.npHaInd;
	}

	/**
	 * Setter method for npHaInd
	 * @param npHaInd {@link String} the npHaInd
	 */
	public void setNpHaInd(String npHaInd) {
		this.npHaInd = npHaInd;
	}
	/**
	 * Getter method for npPpCnt.
	 * @return {@link Integer} the  npPpCnt
	 */
	public Integer getNpPpCnt() {
		return this.npPpCnt;
	}

	/**
	 * Setter method for npPpCnt
	 * @param npPpCnt {@link Integer} the npPpCnt
	 */
	public void setNpPpCnt(Integer npPpCnt) {
		this.npPpCnt = npPpCnt;
	}
	/**
	 * Getter method for npChPpEntrys.
	 * @return {@link NoPayChrgBenPpEntry} the  npChPpEntrys
	 */
	public List<NoPayChrgBenPpEntry> getNpChPpEntrys() {
		return this.npChPpEntrys;
	}

	/**
	 * Setter method for npChPpEntrys
	 * @param npChPpEntrys {@link NoPayChrgBenPpEntry} the npChPpEntrys
	 */
	public void setNpChPpEntrys(List<NoPayChrgBenPpEntry> npChPpEntrys) {
		this.npChPpEntrys = npChPpEntrys;
	}
	
	/**
	 * Add an entity to the npChPpEntrys collection.
	 * @param entity {@link com.uhc.aarp.fox.domain.bean.tsq.NoPayChrgBenPpEntry} the entity
	 */
	public void addToNpChPpEntrys(NoPayChrgBenPpEntry entity) {
		if (npChPpEntrys != null && !npChPpEntrys.contains(entity)) {
			npChPpEntrys.add(entity);
		}
	}

	/**
	 * Remove an entity from the npChPpEntrys collection.
	 * @param entity {@link com.uhc.aarp.fox.domain.bean.tsq.NoPayChrgBenPpEntry} the entity
	 */
	public void removeFromNpChPpEntrys(NoPayChrgBenPpEntry entity) {
		if (npChPpEntrys != null && npChPpEntrys.contains(entity)) {
			npChPpEntrys.remove(entity);
		}
	}

	/**
	 * Add entities to the npChPpEntrys collection.
	 * @param entity {@link Collection} the entities
	 */
    public void addAllToNpChPpEntrys(Collection<NoPayChrgBenPpEntry> entities) {
		for(NoPayChrgBenPpEntry entity : entities) {
			if(npChPpEntrys != null) {
				addToNpChPpEntrys(entity);
			}
		}
	}

	/**
	 * Remove entities from the npChPpEntrys collection.
	 * @param entity {@link Collection} the entities
	 */
    public void removeAllFromNpChPpEntrys(Collection<NoPayChrgBenPpEntry> entities) {
		for(NoPayChrgBenPpEntry entity : entities) {
			if(npChPpEntrys != null && npChPpEntrys.contains(entity)) {
				removeFromNpChPpEntrys(entity);
			}
		}
	}
	
	/**
	 * Remove all entities from the npChPpEntrys collection.
	 */
    public void removeAllFromNpChPpEntrys() {
        if (npChPpEntrys == null) {
            return;
        }

        npChPpEntrys.clear();
	}
	/**
	 * Getter method for npPlanCode.
	 * @return {@link String} the  npPlanCode
	 */
	public String getNpPlanCode() {
		return this.npPlanCode;
	}

	/**
	 * Setter method for npPlanCode
	 * @param npPlanCode {@link String} the npPlanCode
	 */
	public void setNpPlanCode(String npPlanCode) {
		this.npPlanCode = npPlanCode;
	}
	/**
	 * Getter method for npPlanInd.
	 * @return {@link String} the  npPlanInd
	 */
	public String getNpPlanInd() {
		return this.npPlanInd;
	}

	/**
	 * Setter method for npPlanInd
	 * @param npPlanInd {@link String} the npPlanInd
	 */
	public void setNpPlanInd(String npPlanInd) {
		this.npPlanInd = npPlanInd;
	}
	/**
	 * Getter method for npServiceCode.
	 * @return {@link String} the  npServiceCode
	 */
	public String getNpServiceCode() {
		return this.npServiceCode;
	}

	/**
	 * Setter method for npServiceCode
	 * @param npServiceCode {@link String} the npServiceCode
	 */
	public void setNpServiceCode(String npServiceCode) {
		this.npServiceCode = npServiceCode;
	}
	/**
	 * Getter method for npTypeCode.
	 * @return {@link String} the  npTypeCode
	 */
	public String getNpTypeCode() {
		return this.npTypeCode;
	}

	/**
	 * Setter method for npTypeCode
	 * @param npTypeCode {@link String} the npTypeCode
	 */
	public void setNpTypeCode(String npTypeCode) {
		this.npTypeCode = npTypeCode;
	}

}
