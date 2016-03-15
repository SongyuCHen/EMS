package nju.software.ems.data.daoobject;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * DsrXpJgDO entity. @author MyEclipse Persistence Tools
 */
@Entity
@IdClass(DsrXpJgDOId.class)
@Table(name = "DSR_XP_JG")
public class DsrXpJgDO implements java.io.Serializable {

	// Fields

	private Integer ajxh;
	private Integer dsrbh;

	private String jgmc;
	private String xzjgxz;
	private String sffy;
	private String sfpc;
	private String dh;
	private String dz;
	private String yb;
	private String fddbrxm;
	private String djzlb;
	private String djzh;

	// Constructors

	/** default constructor */
	public DsrXpJgDO() {
	}

	/** minimal constructor */
	public DsrXpJgDO(Integer ajxh, Integer dsrbh) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
	}

	/** full constructor */
	public DsrXpJgDO(Integer ajxh, Integer dsrbh, String jgmc, String xzjgxz, String sffy,
			String sfpc, String dh, String dz, String yb, String fddbrxm,
			String djzlb, String djzh) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
		this.jgmc = jgmc;
		this.xzjgxz = xzjgxz;
		this.sffy = sffy;
		this.sfpc = sfpc;
		this.dh = dh;
		this.dz = dz;
		this.yb = yb;
		this.fddbrxm = fddbrxm;
		this.djzlb = djzlb;
		this.djzh = djzh;
	}

	// Property accessors
	@Id
	@Column(name = "AJXH", nullable = false)
	public Integer getAjxh() {
		return this.ajxh;
	}

	public void setAjxh(Integer ajxh) {
		this.ajxh = ajxh;
	}

	@Id
	@Column(name = "DSRBH", nullable = false)
	public Integer getDsrbh() {
		return this.dsrbh;
	}

	public void setDsrbh(Integer dsrbh) {
		this.dsrbh = dsrbh;
	}

	@Column(name = "JGMC", length = 50)
	public String getJgmc() {
		return this.jgmc;
	}

	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}

	@Column(name = "XZJGXZ", length = 10)
	public String getXzjgxz() {
		return this.xzjgxz;
	}

	public void setXzjgxz(String xzjgxz) {
		this.xzjgxz = xzjgxz;
	}

	@Column(name = "SFFY", length = 1)
	public String getSffy() {
		return this.sffy;
	}

	public void setSffy(String sffy) {
		this.sffy = sffy;
	}

	@Column(name = "SFPC", length = 1)
	public String getSfpc() {
		return this.sfpc;
	}

	public void setSfpc(String sfpc) {
		this.sfpc = sfpc;
	}

	@Column(name = "DH", length = 20)
	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	@Column(name = "DZ", length = 50)
	public String getDz() {
		return this.dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	@Column(name = "YB", length = 10)
	public String getYb() {
		return this.yb;
	}

	public void setYb(String yb) {
		this.yb = yb;
	}

	@Column(name = "FDDBRXM", length = 50)
	public String getFddbrxm() {
		return this.fddbrxm;
	}

	public void setFddbrxm(String fddbrxm) {
		this.fddbrxm = fddbrxm;
	}

	@Column(name = "DJZLB", length = 2)
	public String getDjzlb() {
		return this.djzlb;
	}

	public void setDjzlb(String djzlb) {
		this.djzlb = djzlb;
	}

	@Column(name = "DJZH", length = 50)
	public String getDjzh() {
		return this.djzh;
	}

	public void setDjzh(String djzh) {
		this.djzh = djzh;
	}

}