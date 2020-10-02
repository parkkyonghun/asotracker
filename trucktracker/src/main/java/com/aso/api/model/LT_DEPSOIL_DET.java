package com.aso.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LT_DEPSOIL_DET {
	
	private long NUM;
    private String DEP_REF;
    private String TRAN_REF;
    private String CUS_NAME;
    private String MEN_NAME_KH;
    private String MEN_NAME_EN;
    private long AMT_USE;
    private long QTY;
    private String DEP_STATUS;
    private Date TRAN_DATE;
    private long VAL_9;
    
    
    
    
	public LT_DEPSOIL_DET() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Id
	public long getNUM() {
		return NUM;
	}

	public void setNUM(long nUM) {
		NUM = nUM;
	}



	@Column(name = "DEP_REF", nullable = false)
	public String getDEP_REF() {
		return DEP_REF;
	}

	public void setDEP_REF(String dEP_REF) {
		DEP_REF = dEP_REF;
	}



	@Column(name = "TRAN_REF", nullable = false)
	public String getTRAN_REF() {
		return TRAN_REF;
	}
	public void setTRAN_REF(String tRAN_REF) {
		TRAN_REF = tRAN_REF;
	}



	@Column(name = "CUS_NAME", nullable = false)
	public String getCUS_NAME() {
		return CUS_NAME;
	}
	public void setCUS_NAME(String cUS_NAME) {
		CUS_NAME = cUS_NAME;
	}

	@Column(name = "MEN_NAME_KH", nullable = false)
	public String getMEN_NAME_KH() {
		return MEN_NAME_KH;
	}
	public void setMEN_NAME_KH(String mEN_NAME_KH) {
		MEN_NAME_KH = mEN_NAME_KH;
	}


	@Column(name = "MEN_NAME_EN", nullable = false)
	public String getMEN_NAME_EN() {
		return MEN_NAME_EN;
	}
	public void setMEN_NAME_EN(String mEN_NAME_EN) {
		MEN_NAME_EN = mEN_NAME_EN;
	}


	@Column(name = "AMT_USE", nullable = false)
	public long getAMT_USE() {
		return AMT_USE;
	}
	public void setAMT_USE(long aMT_USE) {
		AMT_USE = aMT_USE;
	}


	@Column(name = "QTY", nullable = false)
	public long getQTY() {
		return QTY;
	}
	public void setQTY(long qTY) {
		QTY = qTY;
	}


	@Column(name = "DEP_STATUS", nullable = false)
	public String getDEP_STATUS() {
		return DEP_STATUS;
	}
	public void setDEP_STATUS(String dEP_STATUS) {
		DEP_STATUS = dEP_STATUS;
	}


	@Column(name = "TRAN_DATE", nullable = false)
	public Date getTRAN_DATE() {
		return TRAN_DATE;
	}
	public void setTRAN_DATE(Date tRAN_DATE) {
		TRAN_DATE = tRAN_DATE;
	}


	@Column(name = "VAL_9", nullable = false)
	public long getVAL_9() {
		return VAL_9;
	}
	public void setVAL_9(long vAL_9) {
		VAL_9 = vAL_9;
	}

	@Override
	public String toString() {
		return "LT_DEPSOIL_DET [NUM=" + NUM + ", DEP_REF=" + DEP_REF + ", TRAN_REF=" + TRAN_REF + ", CUS_NAME="
				+ CUS_NAME + ", MEN_NAME_KH=" + MEN_NAME_KH + ", MEN_NAME_EN=" + MEN_NAME_EN + ", AMT_USE=" + AMT_USE
				+ ", QTY=" + QTY + ", DEP_STATUS=" + DEP_STATUS + ", TRAN_DATE=" + TRAN_DATE + ", VAL_9=" + VAL_9 + "]";
	}

	
	


}
