package nju.software.ems.biz.vo;

import java.util.Date;

import nju.software.ems.service.model.DsrJbxxModel;

public class KdtdVO {
	
	private String kdid;
	private String ah;
	private String sjrxm;
	private String yddh;
	private String zzdh;
	private String bgdh;
	private String dwmc;
	private String sjrdz;
	private String yzbm;
	private String jjnr;
	private String jjrdh;
	private String jjrxm;
	private String scrq;
	private String sdrq;
	private String kddh;
	private String dyrq;
	private String wsmc;
	
	public KdtdVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 根据当事人添加收件人信息
	 * @param model 当事人信息
	 */
	public void addSjr(DsrJbxxModel model)
	{
		this.ah = model.getAh();
		this.sjrxm = model.getXm();
		this.dwmc = model.getDwmc();
		this.yzbm = model.getYb();
		this.yddh = model.getDxgzhm();
		this.bgdh = model.getLxdh();
		this.sjrdz = model.getDz();
		this.zzdh = model.getLxdh();		
	}
	public String getKdid() {
		return kdid;
	}
	public void setKdid(String kdid) {
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
	public String getJjnr() {
		return jjnr;
	}
	public void setJjnr(String jjnr) {
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
	public String getScrq() {
		return scrq;
	}
	public void setScrq(String scrq) {
		this.scrq = scrq;
	}
	public String getSdrq() {
		return sdrq;
	}
	public void setSdrq(String sdrq) {
		this.sdrq = sdrq;
	}
	public String getKddh() {
		return kddh;
	}
	public void setKddh(String kddh) {
		this.kddh = kddh;
	}
	public String getDyrq() {
		return dyrq;
	}
	public void setDyrq(String dyrq) {
		this.dyrq = dyrq;
	}
	public String getWsmc() {
		return wsmc;
	}
	public void setWsmc(String wsmc) {
		this.wsmc = wsmc;
	}
	
	

}
