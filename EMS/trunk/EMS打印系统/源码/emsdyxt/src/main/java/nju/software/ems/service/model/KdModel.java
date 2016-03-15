/**
 * 
 */
package nju.software.ems.service.model;

import java.util.Date;

/**
 * @author –ÏˆŒ‘¥ xxy
 *
 * 2015-1-21 …œŒÁ10:28:55 Admin
 */
public class KdModel {
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

	public byte[] getKdhz() {
		return kdhz;
	}

	public void setKdhz(byte[] kdhz) {
		this.kdhz = kdhz;
	}

	/** default constructor */
	public KdModel() {
	}

	/** minimal constructor */
	public KdModel(Integer kdid, String ah, String sjrdz, Date scrq, Date dyrq) {
		this.kdid = kdid;
		this.ah = ah;
		this.sjrdz = sjrdz;
		this.scrq = scrq;
		this.dyrq = dyrq;
	}

	/** full constructor */
	public KdModel(Integer kdid, String ah, String sjrxm, String yddh,
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

	public Integer getKdid() {
		return kdid;
	}

	public void setKdid(Integer kdid) {
		this.kdid = kdid;
	}

	public String getAh() {
		return ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}

	public String getSjrxm() {
		return sjrxm;
	}

	public void setSjrxm(String sjrxm) {
		this.sjrxm = sjrxm;
	}

	public String getYddh() {
		return yddh;
	}

	public void setYddh(String yddh) {
		this.yddh = yddh;
	}

	public String getZzdh() {
		return zzdh;
	}

	public void setZzdh(String zzdh) {
		this.zzdh = zzdh;
	}

	public String getBgdh() {
		return bgdh;
	}

	public void setBgdh(String bgdh) {
		this.bgdh = bgdh;
	}

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getSjrdz() {
		return sjrdz;
	}

	public void setSjrdz(String sjrdz) {
		this.sjrdz = sjrdz;
	}

	public String getYzbm() {
		return yzbm;
	}

	public void setYzbm(String yzbm) {
		this.yzbm = yzbm;
	}

	public Integer getJjnr() {
		return jjnr;
	}

	public void setJjnr(Integer jjnr) {
		this.jjnr = jjnr;
	}

	public String getJjrdh() {
		return jjrdh;
	}

	public void setJjrdh(String jjrdh) {
		this.jjrdh = jjrdh;
	}

	public String getJjrxm() {
		return jjrxm;
	}

	public void setJjrxm(String jjrxm) {
		this.jjrxm = jjrxm;
	}

	public Date getScrq() {
		return scrq;
	}

	public void setScrq(Date scrq) {
		this.scrq = scrq;
	}

	public Date getSdrq() {
		return sdrq;
	}

	public void setSdrq(Date sdrq) {
		this.sdrq = sdrq;
	}

	public String getKddh() {
		return kddh;
	}

	public void setKddh(String kddh) {
		this.kddh = kddh;
	}

	public Date getDyrq() {
		return dyrq;
	}

	public void setDyrq(Date dyrq) {
		this.dyrq = dyrq;
	}

	public String getWsmc() {
		return wsmc;
	}

	public void setWsmc(String wsmc) {
		this.wsmc = wsmc;
	}

	
}
