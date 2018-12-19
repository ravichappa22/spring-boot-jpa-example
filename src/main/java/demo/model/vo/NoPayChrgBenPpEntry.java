package demo.model.vo;

import java.io.Serializable;

/**
 * Class NoPayChrgBenPpEntry.
 * 
 * Legacy Mapping: NP-CH-PP-ENTRY
 * 
 * Entities layer bean
 * @see Serializable
 */

public class NoPayChrgBenPpEntry implements Serializable {

	// Serial UID
	private static final long serialVersionUID = 1L;
	
/**
	 * Property npChPpNum.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CH-PP-ENTRY.NP-CH-PP-NUM<=>NpChPpEntry.npChPpNum
	 * Legacy Type: PIC S9(005)
	 */
	private Integer npChPpNum = 0;

/**
	 * Property npChPpVar01.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CH-PP-ENTRY.NP-CH-PP-VAR01<=>NpChPpEntry.npChPpVar01
	 * Legacy Type: PIC  X(015)
	 */
	private String npChPpVar01 = "";

/**
	 * Property npChPpVar02.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CH-PP-ENTRY.NP-CH-PP-VAR02<=>NpChPpEntry.npChPpVar02
	 * Legacy Type: PIC  X(015)
	 */
	private String npChPpVar02 = "";

/**
	 * Property npChPpVar03.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CH-PP-ENTRY.NP-CH-PP-VAR03<=>NpChPpEntry.npChPpVar03
	 * Legacy Type: PIC  X(015)
	 */
	private String npChPpVar03 = "";

/**
	 * Property npChPpVar04.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CH-PP-ENTRY.NP-CH-PP-VAR04<=>NpChPpEntry.npChPpVar04
	 * Legacy Type: PIC  X(015)
	 */
	private String npChPpVar04 = "";

/**
	 * Property npChPpVar05.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CH-PP-ENTRY.NP-CH-PP-VAR05<=>NpChPpEntry.npChPpVar05
	 * Legacy Type: PIC  X(015)
	 */
	private String npChPpVar05 = "";

/**
	 * Property npChPpVar06.
	 * 
	 * Legacy Mapping: WS-WORK-NP-TSQ-AREA.WS-NP-CHRG-LINE-REC.NP-CHARGE-LN.NP-CH-PP-ENTRY.NP-CH-PP-VAR06<=>NpChPpEntry.npChPpVar06
	 * Legacy Type: PIC  X(015)
	 */
	private String npChPpVar06 = "";


	/**
	 * Getter method for npChPpNum.
	 * @return {@link Integer} the  npChPpNum
	 */
	public Integer getNpChPpNum() {
		return this.npChPpNum;
	}

	/**
	 * Setter method for npChPpNum
	 * @param npChPpNum {@link Integer} the npChPpNum
	 */
	public void setNpChPpNum(Integer npChPpNum) {
		this.npChPpNum = npChPpNum;
	}
	/**
	 * Getter method for npChPpVar01.
	 * @return {@link String} the  npChPpVar01
	 */
	public String getNpChPpVar01() {
		return this.npChPpVar01;
	}

	/**
	 * Setter method for npChPpVar01
	 * @param npChPpVar01 {@link String} the npChPpVar01
	 */
	public void setNpChPpVar01(String npChPpVar01) {
		this.npChPpVar01 = npChPpVar01;
	}
	/**
	 * Getter method for npChPpVar02.
	 * @return {@link String} the  npChPpVar02
	 */
	public String getNpChPpVar02() {
		return this.npChPpVar02;
	}

	/**
	 * Setter method for npChPpVar02
	 * @param npChPpVar02 {@link String} the npChPpVar02
	 */
	public void setNpChPpVar02(String npChPpVar02) {
		this.npChPpVar02 = npChPpVar02;
	}
	/**
	 * Getter method for npChPpVar03.
	 * @return {@link String} the  npChPpVar03
	 */
	public String getNpChPpVar03() {
		return this.npChPpVar03;
	}

	/**
	 * Setter method for npChPpVar03
	 * @param npChPpVar03 {@link String} the npChPpVar03
	 */
	public void setNpChPpVar03(String npChPpVar03) {
		this.npChPpVar03 = npChPpVar03;
	}
	/**
	 * Getter method for npChPpVar04.
	 * @return {@link String} the  npChPpVar04
	 */
	public String getNpChPpVar04() {
		return this.npChPpVar04;
	}

	/**
	 * Setter method for npChPpVar04
	 * @param npChPpVar04 {@link String} the npChPpVar04
	 */
	public void setNpChPpVar04(String npChPpVar04) {
		this.npChPpVar04 = npChPpVar04;
	}
	/**
	 * Getter method for npChPpVar05.
	 * @return {@link String} the  npChPpVar05
	 */
	public String getNpChPpVar05() {
		return this.npChPpVar05;
	}

	/**
	 * Setter method for npChPpVar05
	 * @param npChPpVar05 {@link String} the npChPpVar05
	 */
	public void setNpChPpVar05(String npChPpVar05) {
		this.npChPpVar05 = npChPpVar05;
	}
	/**
	 * Getter method for npChPpVar06.
	 * @return {@link String} the  npChPpVar06
	 */
	public String getNpChPpVar06() {
		return this.npChPpVar06;
	}

	/**
	 * Setter method for npChPpVar06
	 * @param npChPpVar06 {@link String} the npChPpVar06
	 */
	public void setNpChPpVar06(String npChPpVar06) {
		this.npChPpVar06 = npChPpVar06;
	}

}
