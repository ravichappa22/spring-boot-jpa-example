package demo.model.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class NrsChrgLnTSQ.
 * 
 * Legacy Mapping: NC-CHARGE-LN
 * 
 * Entities layer bean
 * @see Serializable
 */

public class NrsChrgLnTSQ implements Serializable {

	// Serial UID
	private static final long serialVersionUID = 1L;
	
/**
	 * Property ncScreenNum.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-SCREEN-NUM<=>NcChargeLn.ncScreenNum
	 * Legacy Type: PIC S9(002)
	 */
	private Integer ncScreenNum = 0;

/**
	 * Property ncRendProvName.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-REND-PROV-NAME<=>NcChargeLn.ncRendProvName
	 * Legacy Type: PIC  X(035)
	 */
	private String ncRendProvName = "";

/**
	 * Property ncRendProvNpi.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-REND-PROV-NPI<=>NcChargeLn.ncRendProvNpi
	 * Legacy Type: PIC S9(010)
	 */
	private Long ncRendProvNpi = Long.valueOf(0);

/**
	 * Property ncServiceFromDate.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-SERVICE-FROM-DATE<=>NcChargeLn.ncServiceFromDate
	 * Legacy Type: PIC S9(007)
	 */
	private Integer ncServiceFromDate = 0;

/**
	 * Property ncServiceToDate.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-SERVICE-TO-DATE<=>NcChargeLn.ncServiceToDate
	 * Legacy Type: PIC S9(007)
	 */
	private Integer ncServiceToDate = 0;

/**
	 * Property ncNoOfShifts.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-NO-OF-SHIFTS<=>NcChargeLn.ncNoOfShifts
	 * Legacy Type: PIC S9(003)
	 */
	private Integer ncNoOfShifts = 0;

/**
	 * Property ncNoOfHours.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-NO-OF-HOURS<=>NcChargeLn.ncNoOfHours
	 * Legacy Type: PIC S9(003)
	 */
	private Integer ncNoOfHours = 0;

/**
	 * Property ncChargeAmt.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CHARGE-AMT<=>NcChargeLn.ncChargeAmt
	 * Legacy Type: PIC S9(007)V99
	 */
	private BigDecimal ncChargeAmt = BigDecimal.ZERO;

/**
	 * Property ncPreExistingInd.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-PRE-EXISTING-IND<=>NcChargeLn.ncPreExistingInd
	 * Legacy Type: PIC  X(001)
	 */
	private String ncPreExistingInd = "";

/**
	 * Property ncPrevConsideredPlans.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-PREV-CONSIDERED-PLAN<=>NcChargeLn.ncPrevConsideredPlans
	 * Legacy Type: PIC  X(002)
	 * Legacy Occurs: 5
	 */
	private List<String> ncPrevConsideredPlans = new ArrayList<String>(java.util.Collections.nCopies(5,""));

/**
	 * Property ncPossibleDup.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-POSSIBLE-DUP<=>NcChargeLn.ncPossibleDup
	 * Legacy Type: PIC  X(001)
	 */
	private String ncPossibleDup = "";

/**
	 * Property ncDupInd.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-DUP-IND<=>NcChargeLn.ncDupInd
	 * Legacy Type: PIC  X(001)
	 */
	private String ncDupInd = "";

/**
	 * Property ncCptCode.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CPT-CODE<=>NcChargeLn.ncCptCode
	 * Legacy Type: PIC  X(005)
	 */
	private String ncCptCode = "";

/**
	 * Property ncMod1.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-MOD1<=>NcChargeLn.ncMod1
	 * Legacy Type: PIC  X(002)
	 */
	private String ncMod1 = "";

/**
	 * Property ncMod2.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-MOD2<=>NcChargeLn.ncMod2
	 * Legacy Type: PIC  X(002)
	 */
	private String ncMod2 = "";

/**
	 * Property ncMod3.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-MOD3<=>NcChargeLn.ncMod3
	 * Legacy Type: PIC  X(002)
	 */
	private String ncMod3 = "";

/**
	 * Property ncMod4.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-MOD4<=>NcChargeLn.ncMod4
	 * Legacy Type: PIC  X(002)
	 */
	private String ncMod4 = "";

/**
	 * Property ncIcdPtr1.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-ICD-PTR-1<=>NcChargeLn.ncIcdPtr1
	 * Legacy Type: PIC S9(005)
	 */
	private Integer ncIcdPtr1 = 0;

/**
	 * Property ncIcdPtr2.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-ICD-PTR-2<=>NcChargeLn.ncIcdPtr2
	 * Legacy Type: PIC S9(005)
	 */
	private Integer ncIcdPtr2 = 0;

/**
	 * Property ncIcdPtr3.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-ICD-PTR-3<=>NcChargeLn.ncIcdPtr3
	 * Legacy Type: PIC S9(005)
	 */
	private Integer ncIcdPtr3 = 0;

/**
	 * Property ncIcdPtr4.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-ICD-PTR-4<=>NcChargeLn.ncIcdPtr4
	 * Legacy Type: PIC S9(005)
	 */
	private Integer ncIcdPtr4 = 0;

/**
	 * Property ncNoPayPlanCode.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-NO-PAY-PLAN-CODE<=>NcChargeLn.ncNoPayPlanCode
	 * Legacy Type: PIC  X(002)
	 */
	private String ncNoPayPlanCode = "";

/**
	 * Property ncNoPayInd.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-NO-PAY-IND<=>NcChargeLn.ncNoPayInd
	 * Legacy Type: PIC  9(001)
	 */
	private Integer ncNoPayInd = 0;

/**
	 * Property ncPpCnt.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-PP-CNT<=>NcChargeLn.ncPpCnt
	 * Legacy Type: PIC S9(003)
	 */
	private Integer ncPpCnt = 0;

/**
	 * Property ncChPpEntrys.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CH-PP-ENTRY<=>NcChargeLn.ncChPpEntrys
	 * Legacy Type: NcChPpEntry
	 * Legacy Occurs: 12
	 */
	private List<NrsChrgPpEntry> ncChPpEntrys = new ArrayList<NrsChrgPpEntry>();

/**
	 * Property ncServiceCode.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-TOS.NC-SERVICE-CODE<=>NcChargeLn.ncServiceCode
	 * Legacy Type: PIC  X(001)
	 */
	private String ncServiceCode = "";

/**
	 * Property ncTypeCode.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-TOS.NC-TYPE-CODE<=>NcChargeLn.ncTypeCode
	 * Legacy Type: PIC  X(001)
	 */
	private String ncTypeCode = "";


	/**
	 * Getter method for ncScreenNum.
	 * @return {@link Integer} the  ncScreenNum
	 */
	public Integer getNcScreenNum() {
		return this.ncScreenNum;
	}

	/**
	 * Setter method for ncScreenNum
	 * @param ncScreenNum {@link Integer} the ncScreenNum
	 */
	public void setNcScreenNum(Integer ncScreenNum) {
		this.ncScreenNum = ncScreenNum;
	}
	/**
	 * Getter method for ncRendProvName.
	 * @return {@link String} the  ncRendProvName
	 */
	public String getNcRendProvName() {
		return this.ncRendProvName;
	}

	/**
	 * Setter method for ncRendProvName
	 * @param ncRendProvName {@link String} the ncRendProvName
	 */
	public void setNcRendProvName(String ncRendProvName) {
		this.ncRendProvName = ncRendProvName;
	}
	/**
	 * Getter method for ncRendProvNpi.
	 * @return {@link Long} the  ncRendProvNpi
	 */
	public Long getNcRendProvNpi() {
		return this.ncRendProvNpi;
	}

	/**
	 * Setter method for ncRendProvNpi
	 * @param ncRendProvNpi {@link Long} the ncRendProvNpi
	 */
	public void setNcRendProvNpi(Long ncRendProvNpi) {
		this.ncRendProvNpi = ncRendProvNpi;
	}
	/**
	 * Getter method for ncServiceFromDate.
	 * @return {@link Integer} the  ncServiceFromDate
	 */
	public Integer getNcServiceFromDate() {
		return this.ncServiceFromDate;
	}

	/**
	 * Setter method for ncServiceFromDate
	 * @param ncServiceFromDate {@link Integer} the ncServiceFromDate
	 */
	public void setNcServiceFromDate(Integer ncServiceFromDate) {
		this.ncServiceFromDate = ncServiceFromDate;
	}
	/**
	 * Getter method for ncServiceToDate.
	 * @return {@link Integer} the  ncServiceToDate
	 */
	public Integer getNcServiceToDate() {
		return this.ncServiceToDate;
	}

	/**
	 * Setter method for ncServiceToDate
	 * @param ncServiceToDate {@link Integer} the ncServiceToDate
	 */
	public void setNcServiceToDate(Integer ncServiceToDate) {
		this.ncServiceToDate = ncServiceToDate;
	}
	/**
	 * Getter method for ncNoOfShifts.
	 * @return {@link Integer} the  ncNoOfShifts
	 */
	public Integer getNcNoOfShifts() {
		return this.ncNoOfShifts;
	}

	/**
	 * Setter method for ncNoOfShifts
	 * @param ncNoOfShifts {@link Integer} the ncNoOfShifts
	 */
	public void setNcNoOfShifts(Integer ncNoOfShifts) {
		this.ncNoOfShifts = ncNoOfShifts;
	}
	/**
	 * Getter method for ncNoOfHours.
	 * @return {@link Integer} the  ncNoOfHours
	 */
	public Integer getNcNoOfHours() {
		return this.ncNoOfHours;
	}

	/**
	 * Setter method for ncNoOfHours
	 * @param ncNoOfHours {@link Integer} the ncNoOfHours
	 */
	public void setNcNoOfHours(Integer ncNoOfHours) {
		this.ncNoOfHours = ncNoOfHours;
	}
	/**
	 * Getter method for ncChargeAmt.
	 * @return {@link BigDecimal} the  ncChargeAmt
	 */
	public BigDecimal getNcChargeAmt() {
		return this.ncChargeAmt;
	}

	/**
	 * Setter method for ncChargeAmt
	 * @param ncChargeAmt {@link BigDecimal} the ncChargeAmt
	 */
	public void setNcChargeAmt(BigDecimal ncChargeAmt) {
		this.ncChargeAmt = ncChargeAmt;
	}
	/**
	 * Getter method for ncPreExistingInd.
	 * @return {@link String} the  ncPreExistingInd
	 */
	public String getNcPreExistingInd() {
		return this.ncPreExistingInd;
	}

	/**
	 * Setter method for ncPreExistingInd
	 * @param ncPreExistingInd {@link String} the ncPreExistingInd
	 */
	public void setNcPreExistingInd(String ncPreExistingInd) {
		this.ncPreExistingInd = ncPreExistingInd;
	}
	/**
	 * Getter method for ncPrevConsideredPlans.
	 * @return {@link List} the  ncPrevConsideredPlans
	 */
	public List<String> getNcPrevConsideredPlans() {
		return this.ncPrevConsideredPlans;
	}

	/**
	 * Setter method for ncPrevConsideredPlans
	 * @param ncPrevConsideredPlans {@link List} the ncPrevConsideredPlans
	 */
	public void setNcPrevConsideredPlans(List<String> ncPrevConsideredPlans) {
		this.ncPrevConsideredPlans = ncPrevConsideredPlans;
	}
	/**
	 * Getter method for ncPossibleDup.
	 * @return {@link String} the  ncPossibleDup
	 */
	public String getNcPossibleDup() {
		return this.ncPossibleDup;
	}

	/**
	 * Setter method for ncPossibleDup
	 * @param ncPossibleDup {@link String} the ncPossibleDup
	 */
	public void setNcPossibleDup(String ncPossibleDup) {
		this.ncPossibleDup = ncPossibleDup;
	}
	/**
	 * Getter method for ncDupInd.
	 * @return {@link String} the  ncDupInd
	 */
	public String getNcDupInd() {
		return this.ncDupInd;
	}

	/**
	 * Setter method for ncDupInd
	 * @param ncDupInd {@link String} the ncDupInd
	 */
	public void setNcDupInd(String ncDupInd) {
		this.ncDupInd = ncDupInd;
	}
	/**
	 * Getter method for ncCptCode.
	 * @return {@link String} the  ncCptCode
	 */
	public String getNcCptCode() {
		return this.ncCptCode;
	}

	/**
	 * Setter method for ncCptCode
	 * @param ncCptCode {@link String} the ncCptCode
	 */
	public void setNcCptCode(String ncCptCode) {
		this.ncCptCode = ncCptCode;
	}
	/**
	 * Getter method for ncMod1.
	 * @return {@link String} the  ncMod1
	 */
	public String getNcMod1() {
		return this.ncMod1;
	}

	/**
	 * Setter method for ncMod1
	 * @param ncMod1 {@link String} the ncMod1
	 */
	public void setNcMod1(String ncMod1) {
		this.ncMod1 = ncMod1;
	}
	/**
	 * Getter method for ncMod2.
	 * @return {@link String} the  ncMod2
	 */
	public String getNcMod2() {
		return this.ncMod2;
	}

	/**
	 * Setter method for ncMod2
	 * @param ncMod2 {@link String} the ncMod2
	 */
	public void setNcMod2(String ncMod2) {
		this.ncMod2 = ncMod2;
	}
	/**
	 * Getter method for ncMod3.
	 * @return {@link String} the  ncMod3
	 */
	public String getNcMod3() {
		return this.ncMod3;
	}

	/**
	 * Setter method for ncMod3
	 * @param ncMod3 {@link String} the ncMod3
	 */
	public void setNcMod3(String ncMod3) {
		this.ncMod3 = ncMod3;
	}
	/**
	 * Getter method for ncMod4.
	 * @return {@link String} the  ncMod4
	 */
	public String getNcMod4() {
		return this.ncMod4;
	}

	/**
	 * Setter method for ncMod4
	 * @param ncMod4 {@link String} the ncMod4
	 */
	public void setNcMod4(String ncMod4) {
		this.ncMod4 = ncMod4;
	}
	/**
	 * Getter method for ncIcdPtr1.
	 * @return {@link Integer} the  ncIcdPtr1
	 */
	public Integer getNcIcdPtr1() {
		return this.ncIcdPtr1;
	}

	/**
	 * Setter method for ncIcdPtr1
	 * @param ncIcdPtr1 {@link Integer} the ncIcdPtr1
	 */
	public void setNcIcdPtr1(Integer ncIcdPtr1) {
		this.ncIcdPtr1 = ncIcdPtr1;
	}
	/**
	 * Getter method for ncIcdPtr2.
	 * @return {@link Integer} the  ncIcdPtr2
	 */
	public Integer getNcIcdPtr2() {
		return this.ncIcdPtr2;
	}

	/**
	 * Setter method for ncIcdPtr2
	 * @param ncIcdPtr2 {@link Integer} the ncIcdPtr2
	 */
	public void setNcIcdPtr2(Integer ncIcdPtr2) {
		this.ncIcdPtr2 = ncIcdPtr2;
	}
	/**
	 * Getter method for ncIcdPtr3.
	 * @return {@link Integer} the  ncIcdPtr3
	 */
	public Integer getNcIcdPtr3() {
		return this.ncIcdPtr3;
	}

	/**
	 * Setter method for ncIcdPtr3
	 * @param ncIcdPtr3 {@link Integer} the ncIcdPtr3
	 */
	public void setNcIcdPtr3(Integer ncIcdPtr3) {
		this.ncIcdPtr3 = ncIcdPtr3;
	}
	/**
	 * Getter method for ncIcdPtr4.
	 * @return {@link Integer} the  ncIcdPtr4
	 */
	public Integer getNcIcdPtr4() {
		return this.ncIcdPtr4;
	}

	/**
	 * Setter method for ncIcdPtr4
	 * @param ncIcdPtr4 {@link Integer} the ncIcdPtr4
	 */
	public void setNcIcdPtr4(Integer ncIcdPtr4) {
		this.ncIcdPtr4 = ncIcdPtr4;
	}
	/**
	 * Getter method for ncNoPayPlanCode.
	 * @return {@link String} the  ncNoPayPlanCode
	 */
	public String getNcNoPayPlanCode() {
		return this.ncNoPayPlanCode;
	}

	/**
	 * Setter method for ncNoPayPlanCode
	 * @param ncNoPayPlanCode {@link String} the ncNoPayPlanCode
	 */
	public void setNcNoPayPlanCode(String ncNoPayPlanCode) {
		this.ncNoPayPlanCode = ncNoPayPlanCode;
	}
	/**
	 * Getter method for ncNoPayInd.
	 * @return {@link Integer} the  ncNoPayInd
	 */
	public Integer getNcNoPayInd() {
		return this.ncNoPayInd;
	}

	/**
	 * Setter method for ncNoPayInd
	 * @param ncNoPayInd {@link Integer} the ncNoPayInd
	 */
	public void setNcNoPayInd(Integer ncNoPayInd) {
		this.ncNoPayInd = ncNoPayInd;
	}
	/**
	 * Getter method for ncPpCnt.
	 * @return {@link Integer} the  ncPpCnt
	 */
	public Integer getNcPpCnt() {
		return this.ncPpCnt;
	}

	/**
	 * Setter method for ncPpCnt
	 * @param ncPpCnt {@link Integer} the ncPpCnt
	 */
	public void setNcPpCnt(Integer ncPpCnt) {
		this.ncPpCnt = ncPpCnt;
	}
	/**
	 * Getter method for ncChPpEntrys.
	 * @return {@link NrsChrgPpEntry} the  ncChPpEntrys
	 */
	public List<NrsChrgPpEntry> getNcChPpEntrys() {
		return this.ncChPpEntrys;
	}

	/**
	 * Setter method for ncChPpEntrys
	 * @param ncChPpEntrys {@link NrsChrgPpEntry} the ncChPpEntrys
	 */
	public void setNcChPpEntrys(List<NrsChrgPpEntry> ncChPpEntrys) {
		this.ncChPpEntrys = ncChPpEntrys;
	}
	
	/**
	 * Add an entity to the ncChPpEntrys collection.
	 * @param entity {@link com.uhc.aarp.fox.domain.bean.tsq.NrsChrgPpEntry} the entity
	 */
	public void addToNcChPpEntrys(NrsChrgPpEntry entity) {
		if (ncChPpEntrys != null && !ncChPpEntrys.contains(entity)) {
			ncChPpEntrys.add(entity);
		}
	}

	/**
	 * Remove an entity from the ncChPpEntrys collection.
	 * @param entity {@link com.uhc.aarp.fox.domain.bean.tsq.NrsChrgPpEntry} the entity
	 */
	public void removeFromNcChPpEntrys(NrsChrgPpEntry entity) {
		if (ncChPpEntrys != null && ncChPpEntrys.contains(entity)) {
			ncChPpEntrys.remove(entity);
		}
	}

	/**
	 * Add entities to the ncChPpEntrys collection.
	 * @param entity {@link Collection} the entities
	 */
    public void addAllToNcChPpEntrys(Collection<NrsChrgPpEntry> entities) {
		for(NrsChrgPpEntry entity : entities) {
			if(ncChPpEntrys != null) {
				addToNcChPpEntrys(entity);
			}
		}
	}

	/**
	 * Remove entities from the ncChPpEntrys collection.
	 * @param entity {@link Collection} the entities
	 */
    public void removeAllFromNcChPpEntrys(Collection<NrsChrgPpEntry> entities) {
		for(NrsChrgPpEntry entity : entities) {
			if(ncChPpEntrys != null && ncChPpEntrys.contains(entity)) {
				removeFromNcChPpEntrys(entity);
			}
		}
	}
	
	/**
	 * Remove all entities from the ncChPpEntrys collection.
	 */
    public void removeAllFromNcChPpEntrys() {
        if (ncChPpEntrys == null) {
            return;
        }

        ncChPpEntrys.clear();
	}
	/**
	 * Getter method for ncServiceCode.
	 * @return {@link String} the  ncServiceCode
	 */
	public String getNcServiceCode() {
		return this.ncServiceCode;
	}

	/**
	 * Setter method for ncServiceCode
	 * @param ncServiceCode {@link String} the ncServiceCode
	 */
	public void setNcServiceCode(String ncServiceCode) {
		this.ncServiceCode = ncServiceCode;
	}
	/**
	 * Getter method for ncTypeCode.
	 * @return {@link String} the  ncTypeCode
	 */
	public String getNcTypeCode() {
		return this.ncTypeCode;
	}

	/**
	 * Setter method for ncTypeCode
	 * @param ncTypeCode {@link String} the ncTypeCode
	 */
	public void setNcTypeCode(String ncTypeCode) {
		this.ncTypeCode = ncTypeCode;
	}

}
