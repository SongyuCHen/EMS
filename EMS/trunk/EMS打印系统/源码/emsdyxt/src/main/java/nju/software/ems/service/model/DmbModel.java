/**
 * 2013-10-25 16:39:29
 */
package nju.software.ems.service.model;

import java.util.Date;

import nju.software.ems.data.daoobject.DmbDO;
import nju.software.ems.util.StringUtil;

/**
 * @author Admin
 * 
 */
public class DmbModel {

	private String lbbh;
	private String dmbh;
	private String dmms;
	private String xgdm;
	private String bz;
	private String modflag;
	private String transflag;
	private Date xgsj;
	private Double xssx;
	private Integer fybh;

	public DmbModel() {
		super();
	}

	public DmbModel(String dmbh,String dmms) {
		super();
		this.lbbh = "";
		this.dmbh = dmbh;
		this.dmms = dmms;
		this.bz = "";
	}

	public DmbModel(DmbDO dmbDO) {
		this.lbbh = StringUtil.trim(dmbDO.getLbbh());
		this.dmbh = StringUtil.trim(dmbDO.getDmbh());
		this.dmms = StringUtil.trim(dmbDO.getDmms());
		this.xgdm = StringUtil.trim(dmbDO.getXgdm());
		this.bz = StringUtil.trim(dmbDO.getBz());
		this.modflag=StringUtil.trim(dmbDO.getModflag());
		this.transflag=StringUtil.trim(dmbDO.getTransflag());
		this.xgsj=dmbDO.getXgsj();
		this.xssx=dmbDO.getXssx();
		this.fybh=dmbDO.getFybh();
	}

	public String getLbbh() {
		return lbbh;
	}

	public void setLbbh(String lbbh) {
		this.lbbh = lbbh;
	}

	public String getDmbh() {
		return dmbh;
	}

	public void setDmbh(String dmbh) {
		this.dmbh = dmbh;
	}

	public String getDmms() {
		return dmms;
	}

	public void setDmms(String dmms) {
		this.dmms = dmms;
	}

	public String getXgdm() {
		return this.xgdm;
	}

	public void setXgdm(String xgdm) {
		this.xgdm = xgdm;
	}
	
	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getModflag() {
		return modflag;
	}

	public void setModflag(String modflag) {
		this.modflag = modflag;
	}

	public String getTransflag() {
		return transflag;
	}

	public void setTransflag(String transflag) {
		this.transflag = transflag;
	}

	public Date getXgsj() {
		return xgsj;
	}

	public void setXgsj(Date xgsj) {
		this.xgsj = xgsj;
	}

	public double getXssx() {
		return xssx;
	}

	public void setXssx(Double xssx) {
		this.xssx = xssx;
	}

	public Integer getFybh() {
		return fybh;
	}

	public void setFybh(Integer fybh) {
		this.fybh = fybh;
	}

}
