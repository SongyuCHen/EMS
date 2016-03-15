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
 * DsrGrDO entity. @author MyEclipse Persistence Tools
 */
@Entity
@IdClass(DsrGrDOId.class)
@Table(name = "DSR_GR")
public class DsrGrDO implements java.io.Serializable {

	// Fields

	private Integer ajxh;
	private Integer dsrbh;

	private String xm;
	private String xb;
	private Date csnyr;
	private String mz;
	private String jg;
	private String zy;
	private String zw;
	private String whcd;
	private String gzdw;
	private String zzmm;
	private String jb;
	private String sf;
	private String hyqk;
	private String jtqk;
	private String jkqk;
	private String ssgj;
	private String sfzhm;
	private String yb;
	private String dh;
	private String dz;
	private String qrjg;
	private String qrgc;
	private String zzd;
	private String zwzy;
	private String zjlb;

	// Constructors

	/** default constructor */
	public DsrGrDO() {
	}

	/** minimal constructor */
	public DsrGrDO(Integer ajxh, Integer dsrbh) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
	}

	/** full constructor */
	public DsrGrDO(Integer ajxh, Integer dsrbh, String xm, String xb, Date csnyr, String mz,
			String jg, String zy, String zw, String whcd, String gzdw,
			String zzmm, String jb, String sf, String hyqk, String jtqk,
			String jkqk, String ssgj, String sfzhm, String yb, String dh,
			String dz, String qrjg, String qrgc, String zzd, String zwzy,
			String zjlb) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
		this.xm = xm;
		this.xb = xb;
		this.csnyr = csnyr;
		this.mz = mz;
		this.jg = jg;
		this.zy = zy;
		this.zw = zw;
		this.whcd = whcd;
		this.gzdw = gzdw;
		this.zzmm = zzmm;
		this.jb = jb;
		this.sf = sf;
		this.hyqk = hyqk;
		this.jtqk = jtqk;
		this.jkqk = jkqk;
		this.ssgj = ssgj;
		this.sfzhm = sfzhm;
		this.yb = yb;
		this.dh = dh;
		this.dz = dz;
		this.qrjg = qrjg;
		this.qrgc = qrgc;
		this.zzd = zzd;
		this.zwzy = zwzy;
		this.zjlb = zjlb;
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

	@Column(name = "XM", length = 50)
	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	@Column(name = "XB", length = 10)
	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	@Column(name = "CSNYR", length = 23)
	public Date getCsnyr() {
		return this.csnyr;
	}

	public void setCsnyr(Date csnyr) {
		this.csnyr = csnyr;
	}

	@Column(name = "MZ", length = 10)
	public String getMz() {
		return this.mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	@Column(name = "JG", length = 50)
	public String getJg() {
		return this.jg;
	}

	public void setJg(String jg) {
		this.jg = jg;
	}

	@Column(name = "ZY", length = 10)
	public String getZy() {
		return this.zy;
	}

	public void setZy(String zy) {
		this.zy = zy;
	}

	@Column(name = "ZW", length = 10)
	public String getZw() {
		return this.zw;
	}

	public void setZw(String zw) {
		this.zw = zw;
	}

	@Column(name = "WHCD", length = 10)
	public String getWhcd() {
		return this.whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	@Column(name = "GZDW", length = 50)
	public String getGzdw() {
		return this.gzdw;
	}

	public void setGzdw(String gzdw) {
		this.gzdw = gzdw;
	}

	@Column(name = "ZZMM", length = 10)
	public String getZzmm() {
		return this.zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	@Column(name = "JB", length = 10)
	public String getJb() {
		return this.jb;
	}

	public void setJb(String jb) {
		this.jb = jb;
	}

	@Column(name = "SF", length = 10)
	public String getSf() {
		return this.sf;
	}

	public void setSf(String sf) {
		this.sf = sf;
	}

	@Column(name = "HYQK", length = 10)
	public String getHyqk() {
		return this.hyqk;
	}

	public void setHyqk(String hyqk) {
		this.hyqk = hyqk;
	}

	@Column(name = "JTQK", length = 250)
	public String getJtqk() {
		return this.jtqk;
	}

	public void setJtqk(String jtqk) {
		this.jtqk = jtqk;
	}

	@Column(name = "JKQK", length = 50)
	public String getJkqk() {
		return this.jkqk;
	}

	public void setJkqk(String jkqk) {
		this.jkqk = jkqk;
	}

	@Column(name = "SSGJ", length = 10)
	public String getSsgj() {
		return this.ssgj;
	}

	public void setSsgj(String ssgj) {
		this.ssgj = ssgj;
	}

	@Column(name = "SFZHM", length = 50)
	public String getSfzhm() {
		return this.sfzhm;
	}

	public void setSfzhm(String sfzhm) {
		this.sfzhm = sfzhm;
	}

	@Column(name = "YB", length = 10)
	public String getYb() {
		return this.yb;
	}

	public void setYb(String yb) {
		this.yb = yb;
	}

	@Column(name = "DH", length = 40)
	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	@Column(name = "DZ", length = 100)
	public String getDz() {
		return this.dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	@Column(name = "QRJG", length = 50)
	public String getQrjg() {
		return this.qrjg;
	}

	public void setQrjg(String qrjg) {
		this.qrjg = qrjg;
	}

	@Column(name = "QRGC", length = 250)
	public String getQrgc() {
		return this.qrgc;
	}

	public void setQrgc(String qrgc) {
		this.qrgc = qrgc;
	}

	@Column(name = "ZZD", length = 100)
	public String getZzd() {
		return this.zzd;
	}

	public void setZzd(String zzd) {
		this.zzd = zzd;
	}

	@Column(name = "ZWZY", length = 40)
	public String getZwzy() {
		return this.zwzy;
	}

	public void setZwzy(String zwzy) {
		this.zwzy = zwzy;
	}

	@Column(name = "ZJLB", length = 2)
	public String getZjlb() {
		return this.zjlb;
	}

	public void setZjlb(String zjlb) {
		this.zjlb = zjlb;
	}

}