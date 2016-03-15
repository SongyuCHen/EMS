package nju.software.ems.data.daoobject;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * KdtdDO entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_KDTD")
public class KdtdDO implements java.io.Serializable {

	// Fields

	private Integer kdid;
	private String ah;
	private String sjrxm;
	private String yddh;
	private String zzdh;
	private String bgdh;
	private String dwmc;
	private String sjrdz;
	private String yzbm;
	private Integer jjnr;
	private String jjrdh;
	private String jjrxm;
	private Date scrq;
	private Date sdrq;
	private String kddh;
	private Date dyrq;
	private String wsmc;
	private byte[] kdhz;

	// Constructors
	/** default constructor */
	public KdtdDO() {
	}

	/** minimal constructor */
	public KdtdDO(Integer kdid, String ah, String sjrdz, Date scrq, Date dyrq) {
		this.kdid = kdid;
		this.ah = ah;
		this.sjrdz = sjrdz;
		this.scrq = scrq;
		this.dyrq = dyrq;
	}

	/** full constructor */
	public KdtdDO(Integer kdid, String ah, String sjrxm, String yddh,
			String zzdh, String bgdh, String dwmc, String sjrdz, String yzbm,
			Integer jjnr, String jjrdh, String jjrxm, Date scrq, Date sdrq,
			String kddh, Date dyrq, String wsmc, byte[] kdhz) {
		this.kdid = kdid;
		this.ah = ah;
		this.sjrxm = sjrxm;
		this.yddh = yddh;
		this.zzdh = zzdh;
		this.bgdh = bgdh;
		this.dwmc = dwmc;
		this.sjrdz = sjrdz;
		this.yzbm = yzbm;
		this.jjnr = jjnr;
		this.jjrdh = jjrdh;
		this.jjrxm = jjrxm;
		this.scrq = scrq;
		this.sdrq = sdrq;
		this.kddh = kddh;
		this.dyrq = dyrq;
		this.wsmc = wsmc;
		this.kdhz = kdhz;
	}

	// Property accessors
	@Id
	@Column(name = "KDID", unique = true, nullable = false)
	public Integer getKdid() {
		return this.kdid;
	}

	public void setKdid(Integer kdid) {
		this.kdid = kdid;
	}

	@Column(name = "AH", nullable = false, length = 200)
	public String getAh() {
		return this.ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}

	@Column(name = "SJRXM", length = 30)
	public String getSjrxm() {
		return this.sjrxm;
	}

	public void setSjrxm(String sjrxm) {
		this.sjrxm = sjrxm;
	}

	@Column(name = "YDDH", length = 30)
	public String getYddh() {
		return this.yddh;
	}

	public void setYddh(String yddh) {
		this.yddh = yddh;
	}

	@Column(name = "ZZDH", length = 30)
	public String getZzdh() {
		return this.zzdh;
	}

	public void setZzdh(String zzdh) {
		this.zzdh = zzdh;
	}

	@Column(name = "BGDH", length = 30)
	public String getBgdh() {
		return this.bgdh;
	}

	public void setBgdh(String bgdh) {
		this.bgdh = bgdh;
	}

	@Column(name = "DWMC", length = 200)
	public String getDwmc() {
		return this.dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	@Column(name = "SJRDZ", nullable = false, length = 200)
	public String getSjrdz() {
		return this.sjrdz;
	}

	public void setSjrdz(String sjrdz) {
		this.sjrdz = sjrdz;
	}

	@Column(name = "YZBM", length = 30)
	public String getYzbm() {
		return this.yzbm;
	}

	public void setYzbm(String yzbm) {
		this.yzbm = yzbm;
	}

	@Column(name = "JJNR")
	public Integer getJjnr() {
		return this.jjnr;
	}

	public void setJjnr(Integer jjnr) {
		this.jjnr = jjnr;
	}

	@Column(name = "JJRDH", length = 30)
	public String getJjrdh() {
		return this.jjrdh;
	}

	public void setJjrdh(String jjrdh) {
		this.jjrdh = jjrdh;
	}

	@Column(name = "JJRXM", length = 30)
	public String getJjrxm() {
		return this.jjrxm;
	}

	public void setJjrxm(String jjrxm) {
		this.jjrxm = jjrxm;
	}

	@Column(name = "SCRQ", nullable = false, length = 23)
	public Date getScrq() {
		return this.scrq;
	}

	public void setScrq(Date scrq) {
		this.scrq = scrq;
	}

	@Column(name = "SDRQ", length = 23)
	public Date getSdrq() {
		return this.sdrq;
	}

	public void setSdrq(Date sdrq) {
		this.sdrq = sdrq;
	}

	@Column(name = "KDDH", length = 30)
	public String getKddh() {
		return this.kddh;
	}

	public void setKddh(String kddh) {
		this.kddh = kddh;
	}

	@Column(name = "DYRQ")
	public Date getDyrq() {
		return this.dyrq;
	}

	public void setDyrq(Date dyrq) {
		this.dyrq = dyrq;
	}

	@Column(name = "WSMC", length = 200)
	public String getWsmc() {
		return this.wsmc;
	}

	public void setWsmc(String wsmc) {
		this.wsmc = wsmc;
	}

	@Column(name = "KDHZ")
	public byte[] getKdhz() {
		return kdhz;
	}

	public void setKdhz(byte[] kdhz) {
		this.kdhz = kdhz;
	}

}