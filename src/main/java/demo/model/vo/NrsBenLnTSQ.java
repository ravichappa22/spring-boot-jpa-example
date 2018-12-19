package demo.model.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class NrsBenLnTSQ.
 * 
 * Legacy Mapping: NC-BENEFIT-LINE
 * 
 * Entities layer bean
 * @see Serializable
 */

public class NrsBenLnTSQ implements Serializable {

	// Serial UID
	private static final long serialVersionUID = 1L;
	
/**
	 * Property ncChargeLine.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-CHARGE-LINE<=>NcBenefitLine.ncChargeLine
	 * Legacy Type: PIC S9(004)
	 */
	private Integer ncChargeLine = 0;

/**
	 * Property ncShifts.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-SHIFTS<=>NcBenefitLine.ncShifts
	 * Legacy Type: PIC S9(003)
	 */
	private Integer ncShifts = 0;

/**
	 * Property ncHours.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-HOURS<=>NcBenefitLine.ncHours
	 * Legacy Type: PIC S9(003)
	 */
	private Integer ncHours = 0;

/**
	 * Property ncCovExpenseAmt.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-COV-EXPENSE-AMT<=>NcBenefitLine.ncCovExpenseAmt
	 * Legacy Type: PIC S9(007)V99
	 */
	private BigDecimal ncCovExpenseAmt = BigDecimal.ZERO;

/**
	 * Property ncBenefitAmt.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-BENEFIT-AMT<=>NcBenefitLine.ncBenefitAmt
	 * Legacy Type: PIC S9(007)V99
	 */
	private BigDecimal ncBenefitAmt = BigDecimal.ZERO;

/**
	 * Property ncDeductibleAmt.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-DEDUCTIBLE-AMT<=>NcBenefitLine.ncDeductibleAmt
	 * Legacy Type: PIC S9(007)V99
	 */
	private BigDecimal ncDeductibleAmt = BigDecimal.ZERO;

/**
	 * Property ncBpAggregateShifts.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-BP-AGGREGATE-SHIFTS<=>NcBenefitLine.ncBpAggregateShifts
	 * Legacy Type: PIC S9(003)
	 */
	private Integer ncBpAggregateShifts = 0;

/**
	 * Property ncBpFirstPayment.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-BP-FIRST-PAYMENT<=>NcBenefitLine.ncBpFirstPayment
	 * Legacy Type: PIC  X(001)
	 */
	private String ncBpFirstPayment = "";

/**
	 * Property ncPercentPaid.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-PERCENT-PAID<=>NcBenefitLine.ncPercentPaid
	 * Legacy Type: PIC S9(003)
	 */
	private Integer ncPercentPaid = 0;

/**
	 * Property ncHaInd.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-HA-IND<=>NcBenefitLine.ncHaInd
	 * Legacy Type: PIC  X(001)
	 */
	private String ncHaInd = "";

/**
	 * Property ncBillProvKey.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-BILL-PROV-KEY<=>NcBenefitLine.ncBillProvKey
	 * Legacy Type: PIC S9(005)
	 */
	private Integer ncBillProvKey = 0;

/**
	 * Property ncBnPpCnt.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-BN-PP-CNT<=>NcBenefitLine.ncBnPpCnt
	 * Legacy Type: PIC S9(003)
	 */
	private Integer ncBnPpCnt = 0;

/**
	 * Property ncBnPpEntrys.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-BN-PP-ENTRY<=>NcBenefitLine.ncBnPpEntrys
	 * Legacy Type: NcBnPpEntry
	 * Legacy Occurs: 12
	 */
	private List<NrsBenPpEntry> ncBnPpEntrys = new ArrayList<NrsBenPpEntry>();

/**
	 * Property ncPlanCd.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-PLAN-DATA.NC-PLAN-CD<=>NcBenefitLine.ncPlanCd
	 * Legacy Type: PIC  X(002)
	 */
	private String ncPlanCd = "";

/**
	 * Property ncPlanInd.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-PLAN-DATA.NC-PLAN-IND<=>NcBenefitLine.ncPlanInd
	 * Legacy Type: PIC  X(001)
	 */
	private String ncPlanInd = "";

/**
	 * Property ncPriorPlan.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-PRIOR-PLAN-DATA.NC-PRIOR-PLAN<=>NcBenefitLine.ncPriorPlan
	 * Legacy Type: PIC  X(002)
	 */
	private String ncPriorPlan = "";

/**
	 * Property ncPriorPlanInd.
	 * 
	 * Legacy Mapping: WS-NC-BENE-AREA.NC-BENEFIT-LINES.NC-BENEFIT-LN.NC-BENEFIT-LINE.NC-PRIOR-PLAN-DATA.NC-PRIOR-PLAN-IND<=>NcBenefitLine.ncPriorPlanInd
	 * Legacy Type: PIC  X(001)
	 */
	private String ncPriorPlanInd = "";


	/**
	 * Getter method for ncChargeLine.
	 * @return {@link Integer} the  ncChargeLine
	 */
	public Integer getNcChargeLine() {
		return this.ncChargeLine;
	}

	/**
	 * Setter method for ncChargeLine
	 * @param ncChargeLine {@link Integer} the ncChargeLine
	 */
	public void setNcChargeLine(Integer ncChargeLine) {
		this.ncChargeLine = ncChargeLine;
	}
	/**
	 * Getter method for ncShifts.
	 * @return {@link Integer} the  ncShifts
	 */
	public Integer getNcShifts() {
		return this.ncShifts;
	}

	/**
	 * Setter method for ncShifts
	 * @param ncShifts {@link Integer} the ncShifts
	 */
	public void setNcShifts(Integer ncShifts) {
		this.ncShifts = ncShifts;
	}
	/**
	 * Getter method for ncHours.
	 * @return {@link Integer} the  ncHours
	 */
	public Integer getNcHours() {
		return this.ncHours;
	}

	/**
	 * Setter method for ncHours
	 * @param ncHours {@link Integer} the ncHours
	 */
	public void setNcHours(Integer ncHours) {
		this.ncHours = ncHours;
	}
	/**
	 * Getter method for ncCovExpenseAmt.
	 * @return {@link BigDecimal} the  ncCovExpenseAmt
	 */
	public BigDecimal getNcCovExpenseAmt() {
		return this.ncCovExpenseAmt;
	}

	/**
	 * Setter method for ncCovExpenseAmt
	 * @param ncCovExpenseAmt {@link BigDecimal} the ncCovExpenseAmt
	 */
	public void setNcCovExpenseAmt(BigDecimal ncCovExpenseAmt) {
		this.ncCovExpenseAmt = ncCovExpenseAmt;
	}
	/**
	 * Getter method for ncBenefitAmt.
	 * @return {@link BigDecimal} the  ncBenefitAmt
	 */
	public BigDecimal getNcBenefitAmt() {
		return this.ncBenefitAmt;
	}

	/**
	 * Setter method for ncBenefitAmt
	 * @param ncBenefitAmt {@link BigDecimal} the ncBenefitAmt
	 */
	public void setNcBenefitAmt(BigDecimal ncBenefitAmt) {
		this.ncBenefitAmt = ncBenefitAmt;
	}
	/**
	 * Getter method for ncDeductibleAmt.
	 * @return {@link BigDecimal} the  ncDeductibleAmt
	 */
	public BigDecimal getNcDeductibleAmt() {
		return this.ncDeductibleAmt;
	}

	/**
	 * Setter method for ncDeductibleAmt
	 * @param ncDeductibleAmt {@link BigDecimal} the ncDeductibleAmt
	 */
	public void setNcDeductibleAmt(BigDecimal ncDeductibleAmt) {
		this.ncDeductibleAmt = ncDeductibleAmt;
	}
	/**
	 * Getter method for ncBpAggregateShifts.
	 * @return {@link Integer} the  ncBpAggregateShifts
	 */
	public Integer getNcBpAggregateShifts() {
		return this.ncBpAggregateShifts;
	}

	/**
	 * Setter method for ncBpAggregateShifts
	 * @param ncBpAggregateShifts {@link Integer} the ncBpAggregateShifts
	 */
	public void setNcBpAggregateShifts(Integer ncBpAggregateShifts) {
		this.ncBpAggregateShifts = ncBpAggregateShifts;
	}
	/**
	 * Getter method for ncBpFirstPayment.
	 * @return {@link String} the  ncBpFirstPayment
	 */
	public String getNcBpFirstPayment() {
		return this.ncBpFirstPayment;
	}

	/**
	 * Setter method for ncBpFirstPayment
	 * @param ncBpFirstPayment {@link String} the ncBpFirstPayment
	 */
	public void setNcBpFirstPayment(String ncBpFirstPayment) {
		this.ncBpFirstPayment = ncBpFirstPayment;
	}
	/**
	 * Getter method for ncPercentPaid.
	 * @return {@link Integer} the  ncPercentPaid
	 */
	public Integer getNcPercentPaid() {
		return this.ncPercentPaid;
	}

	/**
	 * Setter method for ncPercentPaid
	 * @param ncPercentPaid {@link Integer} the ncPercentPaid
	 */
	public void setNcPercentPaid(Integer ncPercentPaid) {
		this.ncPercentPaid = ncPercentPaid;
	}
	/**
	 * Getter method for ncHaInd.
	 * @return {@link String} the  ncHaInd
	 */
	public String getNcHaInd() {
		return this.ncHaInd;
	}

	/**
	 * Setter method for ncHaInd
	 * @param ncHaInd {@link String} the ncHaInd
	 */
	public void setNcHaInd(String ncHaInd) {
		this.ncHaInd = ncHaInd;
	}
	/**
	 * Getter method for ncBillProvKey.
	 * @return {@link Integer} the  ncBillProvKey
	 */
	public Integer getNcBillProvKey() {
		return this.ncBillProvKey;
	}

	/**
	 * Setter method for ncBillProvKey
	 * @param ncBillProvKey {@link Integer} the ncBillProvKey
	 */
	public void setNcBillProvKey(Integer ncBillProvKey) {
		this.ncBillProvKey = ncBillProvKey;
	}
	/**
	 * Getter method for ncBnPpCnt.
	 * @return {@link Integer} the  ncBnPpCnt
	 */
	public Integer getNcBnPpCnt() {
		return this.ncBnPpCnt;
	}

	/**
	 * Setter method for ncBnPpCnt
	 * @param ncBnPpCnt {@link Integer} the ncBnPpCnt
	 */
	public void setNcBnPpCnt(Integer ncBnPpCnt) {
		this.ncBnPpCnt = ncBnPpCnt;
	}
	/**
	 * Getter method for ncBnPpEntrys.
	 * @return {@link NrsBenPpEntry} the  ncBnPpEntrys
	 */
	public List<NrsBenPpEntry> getNcBnPpEntrys() {
		return this.ncBnPpEntrys;
	}

	/**
	 * Setter method for ncBnPpEntrys
	 * @param ncBnPpEntrys {@link NrsBenPpEntry} the ncBnPpEntrys
	 */
	public void setNcBnPpEntrys(List<NrsBenPpEntry> ncBnPpEntrys) {
		this.ncBnPpEntrys = ncBnPpEntrys;
	}
	
	/**
	 * Add an entity to the ncBnPpEntrys collection.
	 * @param entity {@link com.uhc.aarp.fox.domain.bean.tsq.NrsBenPpEntry} the entity
	 */
	public void addToNcBnPpEntrys(NrsBenPpEntry entity) {
		if (ncBnPpEntrys != null && !ncBnPpEntrys.contains(entity)) {
			ncBnPpEntrys.add(entity);
		}
	}

	/**
	 * Remove an entity from the ncBnPpEntrys collection.
	 * @param entity {@link com.uhc.aarp.fox.domain.bean.tsq.NrsBenPpEntry} the entity
	 */
	public void removeFromNcBnPpEntrys(NrsBenPpEntry entity) {
		if (ncBnPpEntrys != null && ncBnPpEntrys.contains(entity)) {
			ncBnPpEntrys.remove(entity);
		}
	}

	/**
	 * Add entities to the ncBnPpEntrys collection.
	 * @param entity {@link Collection} the entities
	 */
    public void addAllToNcBnPpEntrys(Collection<NrsBenPpEntry> entities) {
		for(NrsBenPpEntry entity : entities) {
			if(ncBnPpEntrys != null) {
				addToNcBnPpEntrys(entity);
			}
		}
	}

	/**
	 * Remove entities from the ncBnPpEntrys collection.
	 * @param entity {@link Collection} the entities
	 */
    public void removeAllFromNcBnPpEntrys(Collection<NrsBenPpEntry> entities) {
		for(NrsBenPpEntry entity : entities) {
			if(ncBnPpEntrys != null && ncBnPpEntrys.contains(entity)) {
				removeFromNcBnPpEntrys(entity);
			}
		}
	}
	
	/**
	 * Remove all entities from the ncBnPpEntrys collection.
	 */
    public void removeAllFromNcBnPpEntrys() {
        if (ncBnPpEntrys == null) {
            return;
        }

        ncBnPpEntrys.clear();
	}
	/**
	 * Getter method for ncPlanCd.
	 * @return {@link String} the  ncPlanCd
	 */
	public String getNcPlanCd() {
		return this.ncPlanCd;
	}

	/**
	 * Setter method for ncPlanCd
	 * @param ncPlanCd {@link String} the ncPlanCd
	 */
	public void setNcPlanCd(String ncPlanCd) {
		this.ncPlanCd = ncPlanCd;
	}
	/**
	 * Getter method for ncPlanInd.
	 * @return {@link String} the  ncPlanInd
	 */
	public String getNcPlanInd() {
		return this.ncPlanInd;
	}

	/**
	 * Setter method for ncPlanInd
	 * @param ncPlanInd {@link String} the ncPlanInd
	 */
	public void setNcPlanInd(String ncPlanInd) {
		this.ncPlanInd = ncPlanInd;
	}
	/**
	 * Getter method for ncPriorPlan.
	 * @return {@link String} the  ncPriorPlan
	 */
	public String getNcPriorPlan() {
		return this.ncPriorPlan;
	}

	/**
	 * Setter method for ncPriorPlan
	 * @param ncPriorPlan {@link String} the ncPriorPlan
	 */
	public void setNcPriorPlan(String ncPriorPlan) {
		this.ncPriorPlan = ncPriorPlan;
	}
	/**
	 * Getter method for ncPriorPlanInd.
	 * @return {@link String} the  ncPriorPlanInd
	 */
	public String getNcPriorPlanInd() {
		return this.ncPriorPlanInd;
	}

	/**
	 * Setter method for ncPriorPlanInd
	 * @param ncPriorPlanInd {@link String} the ncPriorPlanInd
	 */
	public void setNcPriorPlanInd(String ncPriorPlanInd) {
		this.ncPriorPlanInd = ncPriorPlanInd;
	}

}
