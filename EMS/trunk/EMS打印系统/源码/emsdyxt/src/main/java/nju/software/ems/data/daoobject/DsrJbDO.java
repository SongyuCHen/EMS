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
 * DsrJbDO entity. @author MyEclipse Persistence Tools
 */
@Entity
@IdClass(DsrJbDOId.class)
@Table(name = "DSR_JB")
public class DsrJbDO implements java.io.Serializable {

	// Fields

	private Integer ajxh;
	private Integer dsrbh;

	private String dsrssdw;
	private String dsrlb;
	private String dsrjc;
	private String sfssdbr;
	private String dsrbgfs;
	private String dsrbgyy;
	private Date dsrbgsj;
	private String sfsa;
	private String sfsg;
	private String sfsq;
	private String sfst;
	private String sfsw;
	private Double qqpcje;
	private String scbc;
	private Double hpje;

	// Constructors

	/** default constructor */
	public DsrJbDO() {
	}

	/** minimal constructor */
	public DsrJbDO(Integer ajxh, Integer dsrbh) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
	}

	/** full constructor */
	public DsrJbDO(Integer ajxh, Integer dsrbh, String dsrssdw, String dsrlb, String dsrjc,
			String sfssdbr, String dsrbgfs, String dsrbgyy, Date dsrbgsj,
			String sfsa, String sfsg, String sfsq, String sfst, String sfsw,
			Double qqpcje, String scbc, Double hpje) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
		this.dsrssdw = dsrssdw;
		this.dsrlb = dsrlb;
		this.dsrjc = dsrjc;
		this.sfssdbr = sfssdbr;
		this.dsrbgfs = dsrbgfs;
		this.dsrbgyy = dsrbgyy;
		this.dsrbgsj = dsrbgsj;
		this.sfsa = sfsa;
		this.sfsg = sfsg;
		this.sfsq = sfsq;
		this.sfst = sfst;
		this.sfsw = sfsw;
		this.qqpcje = qqpcje;
		this.scbc = scbc;
		this.hpje = hpje;
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

	@Column(name = "DSRSSDW", length = 10)
	public String getDsrssdw() {
		return this.dsrssdw;
	}

	public void setDsrssdw(String dsrssdw) {
		this.dsrssdw = dsrssdw;
	}

	@Column(name = "DSRLB", length = 10)
	public String getDsrlb() {
		return this.dsrlb;
	}

	public void setDsrlb(String dsrlb) {
		this.dsrlb = dsrlb;
	}

	@Column(name = "DSRJC", length = 200)
	public String getDsrjc() {
		return this.dsrjc;
	}

	public void setDsrjc(String dsrjc) {
		this.dsrjc = dsrjc;
	}

	@Column(name = "SFSSDBR", length = 1)
	public String getSfssdbr() {
		return this.sfssdbr;
	}

	public void setSfssdbr(String sfssdbr) {
		this.sfssdbr = sfssdbr;
	}

	@Column(name = "DSRBGFS", length = 10)
	public String getDsrbgfs() {
		return this.dsrbgfs;
	}

	public void setDsrbgfs(String dsrbgfs) {
		this.dsrbgfs = dsrbgfs;
	}

	@Column(name = "DSRBGYY", length = 10)
	public String getDsrbgyy() {
		return this.dsrbgyy;
	}

	public void setDsrbgyy(String dsrbgyy) {
		this.dsrbgyy = dsrbgyy;
	}

	@Column(name = "DSRBGSJ", length = 23)
	public Date getDsrbgsj() {
		return this.dsrbgsj;
	}

	public void setDsrbgsj(Date dsrbgsj) {
		this.dsrbgsj = dsrbgsj;
	}

	@Column(name = "SFSA", length = 1)
	public String getSfsa() {
		return this.sfsa;
	}

	public void setSfsa(String sfsa) {
		this.sfsa = sfsa;
	}

	@Column(name = "SFSG", length = 1)
	public String getSfsg() {
		return this.sfsg;
	}

	public void setSfsg(String sfsg) {
		this.sfsg = sfsg;
	}

	@Column(name = "SFSQ", length = 1)
	public String getSfsq() {
		return this.sfsq;
	}

	public void setSfsq(String sfsq) {
		this.sfsq = sfsq;
	}

	@Column(name = "SFST", length = 1)
	public String getSfst() {
		return this.sfst;
	}

	public void setSfst(String sfst) {
		this.sfst = sfst;
	}

	@Column(name = "SFSW", length = 1)
	public String getSfsw() {
		return this.sfsw;
	}

	public void setSfsw(String sfsw) {
		this.sfsw = sfsw;
	}

	@Column(name = "QQPCJE", scale = 4)
	public Double getQqpcje() {
		return this.qqpcje;
	}

	public void setQqpcje(Double qqpcje) {
		this.qqpcje = qqpcje;
	}

	@Column(name = "SCBC")
	public String getScbc() {
		return this.scbc;
	}

	public void setScbc(String scbc) {
		this.scbc = scbc;
	}

	@Column(name = "HPJE", scale = 4)
	public Double getHpje() {
		return this.hpje;
	}

	public void setHpje(Double hpje) {
		this.hpje = hpje;
	}

}