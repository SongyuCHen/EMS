package nju.software.appraisal.service.model;

public class DmbModel {
	private String lbbh;
	private String dmbh;
	private String dmms;
	private String xgdm;
	private String bz;
	private String modflag;
	private String transflag;

	public DmbModel(String lbbh, String dmbh, String dmms, String xgdm,
			String bz, String modflag, String transflag) {
		super();
		this.lbbh = lbbh;
		this.dmbh = dmbh;
		this.dmms = dmms;
		this.xgdm = xgdm;
		this.bz = bz;
		this.modflag = modflag;
		this.transflag = transflag;
	}

	public DmbModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLbbh() {
		return this.lbbh;
	}

	public void setLbbh(String lbbh) {
		this.lbbh = lbbh;
	}

	public String getDmbh() {
		return this.dmbh;
	}

	public void setDmbh(String dmbh) {
		this.dmbh = dmbh;
	}

	public String getDmms() {
		return this.dmms;
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
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getModflag() {
		return this.modflag;
	}

	public void setModflag(String modflag) {
		this.modflag = modflag;
	}

	public String getTransflag() {
		return this.transflag;
	}

	public void setTransflag(String transflag) {
		this.transflag = transflag;
	}
}
