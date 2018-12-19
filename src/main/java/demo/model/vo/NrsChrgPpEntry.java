package demo.model.vo;

import java.io.Serializable;

/**
 * Class NrsChrgPpEntry.
 * 
 * Legacy Mapping: NC-CH-PP-ENTRY
 * 
 * Entities layer bean
 * @see Serializable
 */

public class NrsChrgPpEntry implements Serializable {

	// Serial UID
	private static final long serialVersionUID = 1L;
	
/**
	 * Property ncChPpNum.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CH-PP-ENTRY.NC-CH-PP-NUM<=>NcChPpEntry.ncChPpNum
	 * Legacy Type: PIC S9(005)
	 */
	private Integer ncChPpNum = 0;

/**
	 * Property ncChPpVar01.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CH-PP-ENTRY.NC-CH-PP-VAR01<=>NcChPpEntry.ncChPpVar01
	 * Legacy Type: PIC  X(015)
	 */
	private String ncChPpVar01 = "";

/**
	 * Property ncChPpVar02.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CH-PP-ENTRY.NC-CH-PP-VAR02<=>NcChPpEntry.ncChPpVar02
	 * Legacy Type: PIC  X(015)
	 */
	private String ncChPpVar02 = "";

/**
	 * Property ncChPpVar03.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CH-PP-ENTRY.NC-CH-PP-VAR03<=>NcChPpEntry.ncChPpVar03
	 * Legacy Type: PIC  X(015)
	 */
	private String ncChPpVar03 = "";

/**
	 * Property ncChPpVar04.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CH-PP-ENTRY.NC-CH-PP-VAR04<=>NcChPpEntry.ncChPpVar04
	 * Legacy Type: PIC  X(015)
	 */
	private String ncChPpVar04 = "";

/**
	 * Property ncChPpVar05.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CH-PP-ENTRY.NC-CH-PP-VAR05<=>NcChPpEntry.ncChPpVar05
	 * Legacy Type: PIC  X(015)
	 */
	private String ncChPpVar05 = "";

/**
	 * Property ncChPpVar06.
	 * 
	 * Legacy Mapping: WS-NURSING-CHARGE-TSQ-AREA.WS-NURSING-CHARGE-LINE.NC-CHARGE-LN.NC-CH-PP-ENTRY.NC-CH-PP-VAR06<=>NcChPpEntry.ncChPpVar06
	 * Legacy Type: PIC  X(015)
	 */
	private String ncChPpVar06 = "";


	/**
	 * Getter method for ncChPpNum.
	 * @return {@link Integer} the  ncChPpNum
	 */
	public Integer getNcChPpNum() {
		return this.ncChPpNum;
	}

	/**
	 * Setter method for ncChPpNum
	 * @param ncChPpNum {@link Integer} the ncChPpNum
	 */
	public void setNcChPpNum(Integer ncChPpNum) {
		this.ncChPpNum = ncChPpNum;
	}
	/**
	 * Getter method for ncChPpVar01.
	 * @return {@link String} the  ncChPpVar01
	 */
	public String getNcChPpVar01() {
		return this.ncChPpVar01;
	}

	/**
	 * Setter method for ncChPpVar01
	 * @param ncChPpVar01 {@link String} the ncChPpVar01
	 */
	public void setNcChPpVar01(String ncChPpVar01) {
		this.ncChPpVar01 = ncChPpVar01;
	}
	/**
	 * Getter method for ncChPpVar02.
	 * @return {@link String} the  ncChPpVar02
	 */
	public String getNcChPpVar02() {
		return this.ncChPpVar02;
	}

	/**
	 * Setter method for ncChPpVar02
	 * @param ncChPpVar02 {@link String} the ncChPpVar02
	 */
	public void setNcChPpVar02(String ncChPpVar02) {
		this.ncChPpVar02 = ncChPpVar02;
	}
	/**
	 * Getter method for ncChPpVar03.
	 * @return {@link String} the  ncChPpVar03
	 */
	public String getNcChPpVar03() {
		return this.ncChPpVar03;
	}

	/**
	 * Setter method for ncChPpVar03
	 * @param ncChPpVar03 {@link String} the ncChPpVar03
	 */
	public void setNcChPpVar03(String ncChPpVar03) {
		this.ncChPpVar03 = ncChPpVar03;
	}
	/**
	 * Getter method for ncChPpVar04.
	 * @return {@link String} the  ncChPpVar04
	 */
	public String getNcChPpVar04() {
		return this.ncChPpVar04;
	}

	/**
	 * Setter method for ncChPpVar04
	 * @param ncChPpVar04 {@link String} the ncChPpVar04
	 */
	public void setNcChPpVar04(String ncChPpVar04) {
		this.ncChPpVar04 = ncChPpVar04;
	}
	/**
	 * Getter method for ncChPpVar05.
	 * @return {@link String} the  ncChPpVar05
	 */
	public String getNcChPpVar05() {
		return this.ncChPpVar05;
	}

	/**
	 * Setter method for ncChPpVar05
	 * @param ncChPpVar05 {@link String} the ncChPpVar05
	 */
	public void setNcChPpVar05(String ncChPpVar05) {
		this.ncChPpVar05 = ncChPpVar05;
	}
	/**
	 * Getter method for ncChPpVar06.
	 * @return {@link String} the  ncChPpVar06
	 */
	public String getNcChPpVar06() {
		return this.ncChPpVar06;
	}

	/**
	 * Setter method for ncChPpVar06
	 * @param ncChPpVar06 {@link String} the ncChPpVar06
	 */
	public void setNcChPpVar06(String ncChPpVar06) {
		this.ncChPpVar06 = ncChPpVar06;
	}

}
