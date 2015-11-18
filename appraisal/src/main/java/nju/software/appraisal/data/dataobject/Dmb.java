package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name = "PUB_DMB")
@IdClass(DmbId.class)
public class Dmb implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6916254413929054852L;
	/**
	 * 类别编号
	 */
	private String lbbh;
	/**
	 * 代码编号
	 */
	private String dmbh;
	/**
	 * 代码描述
	 */
	private String dmms;
	/**
	 * 相关代码
	 */
	private String xgdm;
	/**
	 * 备注
	 */
	private String bz;
	
	public Dmb() {
	}

	public Dmb(String lbbh, String dmbh, String dmms, String xgdm, String bz) {
		super();
		this.lbbh = lbbh;
		this.dmbh = dmbh;
		this.dmms = dmms;
		this.xgdm = xgdm;
		this.bz = bz;
	}
	@Id
	@Column(name="LBBH",nullable=false,length=20)
	public String getLbbh() {
		return lbbh;
	}

	public void setLbbh(String lbbh) {
		this.lbbh = lbbh;
	}
	@Id
	@Column(name="DMBH",nullable=false,length=20)
	public String getDmbh() {
		return dmbh;
	}

	public void setDmbh(String dmbh) {
		this.dmbh = dmbh;
	}
	@Column(name="DMMS",nullable=true,length=250)
	public String getDmms() {
		return dmms;
	}

	public void setDmms(String dmms) {
		this.dmms = dmms;
	}
	@Column(name="XGDM",nullable=true,length=250)
	public String getXgdm() {
		return xgdm;
	}

	public void setXgdm(String xgdm) {
		this.xgdm = xgdm;
	}
	@Column(name="BZ",nullable=true,length=250)
	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}
	
}
