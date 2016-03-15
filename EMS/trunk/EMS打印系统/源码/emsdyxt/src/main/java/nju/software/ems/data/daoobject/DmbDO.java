package nju.software.ems.data.daoobject;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * DmbDO entity. @author MyEclipse Persistence Tools
 */
@Entity
@IdClass(DmbDOId.class)
@Table(name = "PUB_DMB")
public class DmbDO implements java.io.Serializable {

	// Fields

	private String lbbh;
	private String dmbh;

	private String dmms;
	private String xgdm;
	private String bz;
	private String modflag;
	private String transflag;
	private Double xssx;
	private Date xgsj;
	private Integer fybh;

	// Constructors

	/** default constructor */
	public DmbDO() {
	}

	/** minimal constructor */
	public DmbDO(String lbbh, String dmbh) {
		this.lbbh = lbbh;
		this.dmbh = dmbh;
	}

	/** full constructor */
	public DmbDO(String lbbh, String dmbh, String dmms, String xgdm, String bz,
			String modflag, String transflag, Double xssx, Date xgsj,
			Integer fybh) {
		this.lbbh = lbbh;
		this.dmbh = dmbh;
		this.dmms = dmms;
		this.xgdm = xgdm;
		this.bz = bz;
		this.modflag = modflag;
		this.transflag = transflag;
		this.xssx = xssx;
		this.xgsj = xgsj;
		this.fybh = fybh;
	}

	// Property accessors
	@Id
	@Column(name = "LBBH", nullable = false, length = 20)
	public String getLbbh() {
		return this.lbbh;
	}

	public void setLbbh(String lbbh) {
		this.lbbh = lbbh;
	}

	@Id
	@Column(name = "DMBH", nullable = false, length = 20)
	public String getDmbh() {
		return this.dmbh;
	}

	public void setDmbh(String dmbh) {
		this.dmbh = dmbh;
	}

	@Column(name = "DMMS", length = 250)
	public String getDmms() {
		return this.dmms;
	}

	public void setDmms(String dmms) {
		this.dmms = dmms;
	}

	@Column(name = "XGDM", length = 250)
	public String getXgdm() {
		return this.xgdm;
	}

	public void setXgdm(String xgdm) {
		this.xgdm = xgdm;
	}

	@Column(name = "BZ", length = 250)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Column(name = "MODFLAG", length = 1)
	public String getModflag() {
		return this.modflag;
	}

	public void setModflag(String modflag) {
		this.modflag = modflag;
	}

	@Column(name = "TRANSFLAG", length = 1)
	public String getTransflag() {
		return this.transflag;
	}

	public void setTransflag(String transflag) {
		this.transflag = transflag;
	}

	@Column(name = "XSSX", precision = 15, scale = 0)
	public Double getXssx() {
		return this.xssx;
	}

	public void setXssx(Double xssx) {
		this.xssx = xssx;
	}

	@Column(name = "XGSJ", length = 23)
	public Date getXgsj() {
		return this.xgsj;
	}

	public void setXgsj(Date xgsj) {
		this.xgsj = xgsj;
	}

	@Column(name = "FYBH")
	public Integer getFybh() {
		return this.fybh;
	}

	public void setFybh(Integer fybh) {
		this.fybh = fybh;
	}

}