package nju.software.appraisal.data.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


/**
 * PubAyDmb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PUB_AYDMB")
@IdClass(PubAyDmbId.class)
public class PubAyDmb  implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6453676373711167975L;
	private String bbh;
	private String dmbh;
	private String dmms;
	private String aydm_4;
	private Integer aydm_5;
	private String sfsx;
	private Integer aylb;
	private String txh;
	private String kxh;
	private String bz1;
	private String bz2;
	private Integer aydm_8;
	private Integer aydm_11;
	
	
	/**
	 * 
	 */
	PubAyDmb() {
	}
	
	
	/**
	 * @param id
	 * @param dmms
	 * @param aydm_4
	 * @param aydm_5
	 * @param sfsx
	 * @param aylb
	 * @param txh
	 * @param kxh
	 * @param bz1
	 * @param bz2
	 * @param aydm_8
	 */
	PubAyDmb(String bbh, String dmbh, String dmms, String aydm_4, Integer aydm_5,
			String sfsx, Integer aylb, String txh, String kxh, String bz1,
			String bz2, Integer aydm_8,Integer aydm_11) {
		super();
		this.bbh = bbh;
		this.dmbh = dmbh;
		this.dmms = dmms;
		this.aydm_4 = aydm_4;
		this.aydm_5 = aydm_5;
		this.sfsx = sfsx;
		this.aylb = aylb;
		this.txh = txh;
		this.kxh = kxh;
		this.bz1 = bz1;
		this.bz2 = bz2;
		this.aydm_8 = aydm_8;
		this.aydm_11=aydm_11;
	}

	@Id
	@Column(name="BBH",nullable=false)
	public String getBbh() {
		return bbh;
	}


	public void setBbh(String bbh) {
		this.bbh = bbh;
	}

	@Id
	@Column(name="DMBH",nullable=false)
	public String getDmbh() {
		return dmbh;
	}


	public void setDmbh(String dmbh) {
		this.dmbh = dmbh;
	}
	
	/**
	 * @return the dmms
	 */
	@Column(name = "DMMS", length = 255, nullable=true)
	public String getDmms() {
		return dmms;
	}

	/**
	 * @param dmms the dmms to set
	 */
	public void setDmms(String dmms) {
		this.dmms = dmms;
	}
	
	
	/**
	 * @return the aydm_4
	 */
	@Column(name = "AYDM_4", length = 10, nullable=true)
	public String getAydm_4() {
		return aydm_4;
	}
	/**
	 * @param aydm_4 the aydm_4 to set
	 */
	public void setAydm_4(String aydm_4) {
		this.aydm_4 = aydm_4;
	}
	
	
	/**
	 * @return the aydm_5
	 */
	@Column(name = "AYDM_5", nullable=true)
	public Integer getAydm_5() {
		return aydm_5;
	}
	/**
	 * @param aydm_5 the aydm_5 to set
	 */
	public void setAydm_5(Integer aydm_5) {
		this.aydm_5 = aydm_5;
	}
	
	
	/**
	 * @return the sfsx
	 */
	@Column(name = "SFSX", length = 1, nullable=true)
	public String getSfsx() {
		return sfsx;
	}
	/**
	 * @param sfsx the sfsx to set
	 */
	public void setSfsx(String sfsx) {
		this.sfsx = sfsx;
	}
	
	
	/**
	 * @return the aylb
	 */
	@Column(name = "AYLB", nullable=true)
	public Integer getAylb() {
		return aylb;
	}
	/**
	 * @param aylb the aylb to set
	 */
	public void setAylb(Integer aylb) {
		this.aylb = aylb;
	}
	
	
	/**
	 * @return the txh
	 */
	@Column(name = "TXH", length = 40, nullable=true)
	public String getTxh() {
		return txh;
	}
	/**
	 * @param txh the txh to set
	 */
	public void setTxh(String txh) {
		this.txh = txh;
	}
	
	
	/**
	 * @return the kxh
	 */
	@Column(name = "KXH", length = 40, nullable=true)
	public String getKxh() {
		return kxh;
	}
	/**
	 * @param kxh the kxh to set
	 */
	public void setKxh(String kxh) {
		this.kxh = kxh;
	}
	
	
	/**
	 * @return the bz1
	 */
	@Column(name = "BZ1", length = 255, nullable=true)
	public String getBz1() {
		return bz1;
	}
	/**
	 * @param bz1 the bz1 to set
	 */
	public void setBz1(String bz1) {
		this.bz1 = bz1;
	}
	
	
	/**
	 * @return the bz2
	 */
	@Column(name = "BZ2", length = 255, nullable=true)
	public String getBz2() {
		return bz2;
	}
	/**
	 * @param bz2 the bz2 to set
	 */
	public void setBz2(String bz2) {
		this.bz2 = bz2;
	}
	
	
	/**
	 * @return the aydm_8
	 */
	@Column(name = "AYDM_8", nullable=true)
	public Integer getAydm_8() {
		return aydm_8;
	}
	/**
	 * @param aydm_8 the aydm_8 to set
	 */
	public void setAydm_8(Integer aydm_8) {
		this.aydm_8 = aydm_8;
	}
	
	@Column(name = "AYDM_11", nullable=true)
	public Integer getAydm_11() {
		return aydm_11;
	}
	
	public void setAydm_11(Integer aydm_11) {
		this.aydm_11 = aydm_11;
	}

}