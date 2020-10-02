package com.aso.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LT_INVDET")
public class Truck {
	
    private long INVH_REF;
    private String ORDH_REF;
    private String INVD_STAT;
    private String MEN_NAME_EN;
    private String MEN_NAME_KH;
    private String MEN_PRICE;
    private String UNIT_NAME;
    private String ORDD_AMT;
    
    
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	public long getINVH_REF() {
		return INVH_REF;
	}

	public void setINVH_REF(long iNVH_REF) {
		INVH_REF = iNVH_REF;
	}

	


	@Column(name = "ORDH_REF", nullable = false)
	public String getORDH_REF() {
		return ORDH_REF;
	}


	public void setORDH_REF(String oRDH_REF) {
		ORDH_REF = oRDH_REF;
	}

	@Column(name = "INVD_STAT", nullable = false)
	public String getINVD_STAT() {
		return INVD_STAT;
	}


	public void setINVD_STAT(String iNVD_STAT) {
		INVD_STAT = iNVD_STAT;
	}


	@Column(name = "MEN_NAME_EN", nullable = false)
	public String getMEN_NAME_EN() {
		return MEN_NAME_EN;
	}

	public void setMEN_NAME_EN(String mEN_NAME_EN) {
		MEN_NAME_EN = mEN_NAME_EN;
	}




	@Column(name = "MEN_NAME_KH", nullable = false)
	public String getMEN_NAME_KH() {
		return MEN_NAME_KH;
	}

	public void setMEN_NAME_KH(String mEN_NAME_KH) {
		MEN_NAME_KH = mEN_NAME_KH;
	}

	
	@Column(name = "MEN_PRICE", nullable = false)
	public String getMEN_PRICE() {
		return MEN_PRICE;
	}
	
	public void setMEN_PRICE(String mEN_PRICE) {
		MEN_PRICE = mEN_PRICE;
	}


	@Column(name = "UNIT_NAME", nullable = false)
	public String getUNIT_NAME() {
		return UNIT_NAME;
	}

	public void setUNIT_NAME(String uNIT_NAME) {
		UNIT_NAME = uNIT_NAME;
	}


	@Column(name = "ORDD_AMT", nullable = false)
	public String getORDD_AMT() {
		return ORDD_AMT;
	}

	public void setORDD_AMT(String oRDD_AMT) {
		ORDD_AMT = oRDD_AMT;
	}


	public Truck(long iNVH_REF, String oRDH_REF, String iNVD_STAT, String mEN_NAME_EN, String mEN_NAME_KH,
			String mEN_PRICE, String uNIT_NAME, String oRDD_AMT) {
		super();
		this.INVH_REF = iNVH_REF;
		this.ORDH_REF = oRDH_REF;
		this.INVD_STAT = iNVD_STAT;
		this.MEN_NAME_EN = mEN_NAME_EN;
		this.MEN_NAME_KH = mEN_NAME_KH;
		this.MEN_PRICE = mEN_PRICE;
		this.UNIT_NAME = uNIT_NAME;
		this.ORDD_AMT = oRDD_AMT;
	}


	@Override
	public String toString() {
		return "Truck [INVH_REF=" + INVH_REF + ", ORDH_REF=" + ORDH_REF + ", INVD_STAT=" + INVD_STAT + ", MEN_NAME_EN="
				+ MEN_NAME_EN + ", MEN_NAME_KH=" + MEN_NAME_KH + ", MEN_PRICE=" + MEN_PRICE + ", UNIT_NAME=" + UNIT_NAME
				+ ", ORDD_AMT=" + ORDD_AMT + ", getINVH_REF()=" + getINVH_REF() + ", getORDH_REF()=" + getORDH_REF()
				+ ", getINVD_STAT()=" + getINVD_STAT() + ", getMEN_NAME_EN()=" + getMEN_NAME_EN()
				+ ", getMEN_NAME_KH()=" + getMEN_NAME_KH() + ", getMEN_PRICE()=" + getMEN_PRICE() + ", getUNIT_NAME()="
				+ getUNIT_NAME() + ", getORDD_AMT()=" + getORDD_AMT() + "]";
	}

    
}
