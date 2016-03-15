package nju.software.ems.data.daoobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DmlbbDO entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_DMLBB")
public class DmlbbDO implements java.io.Serializable {

	// Fields

	private String lbbh;
	private String lbdl;
	private String lbxl;
	private String lbms;
	private Integer dmcd;
	private String bz;

	// Constructors

	/** default constructor */
	public DmlbbDO() {
	}

	/** minimal constructor */
	public DmlbbDO(String lbbh) {
		this.lbbh = lbbh;
	}

	/** full constructor */
	public DmlbbDO(String lbbh, String lbdl, String lbxl, String lbms,
			Integer dmcd, String bz) {
		this.lbbh = lbbh;
		this.lbdl = lbdl;
		this.lbxl = lbxl;
		this.lbms = lbms;
		this.dmcd = dmcd;
		this.bz = bz;
	}

	// Property accessors
	@Id
	@Column(name = "LBBH", unique = true, nullable = false, length = 20)
	public String getLbbh() {
		return this.lbbh;
	}

	public void setLbbh(String lbbh) {
		this.lbbh = lbbh;
	}

	@Column(name = "LBDL", length = 40)
	public String getLbdl() {
		return this.lbdl;
	}

	public void setLbdl(String lbdl) {
		this.lbdl = lbdl;
	}

	@Column(name = "LBXL", length = 40)
	public String getLbxl() {
		return this.lbxl;
	}

	public void setLbxl(String lbxl) {
		this.lbxl = lbxl;
	}

	@Column(name = "LBMS", length = 40)
	public String getLbms() {
		return this.lbms;
	}

	public void setLbms(String lbms) {
		this.lbms = lbms;
	}

	@Column(name = "DMCD")
	public Integer getDmcd() {
		return this.dmcd;
	}

	public void setDmcd(Integer dmcd) {
		this.dmcd = dmcd;
	}

	@Column(name = "BZ", length = 250)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}