package nju.software.ems.biz.vo;

import nju.software.ems.service.model.DsrJbxxModel;

public class DsrjbxxVO {
	
	private String dsrlx;  //当事人类型
	private String dsrmc;  //当事人名称
	private String dsrdz;  //当事人地址
	private String dsrbh;  //当事人编号
	
	public String getDsrlx() {
		return dsrlx;
	}
	public void setDsrlx(String dsrlx) {
		this.dsrlx = dsrlx;
	}
	public String getDsrmc() {
		return dsrmc;
	}
	public void setDsrmc(String dsrmc) {
		this.dsrmc = dsrmc;
	}
	public String getDsrdz() {
		return dsrdz;
	}
	public void setDsrdz(String dsrdz) {
		this.dsrdz = dsrdz;
	}
	public DsrjbxxVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DsrjbxxVO(DsrJbxxModel model)
	{
		this.dsrlx = model.getDsrlbms();
		this.dsrmc = model.getDsrjc();
		this.dsrdz = model.getDz();
		this.dsrbh = String.valueOf(model.getDsrbh());
	}
	public String getDsrbh() {
		return dsrbh;
	}
	public void setDsrbh(String dsrbh) {
		this.dsrbh = dsrbh;
	}

}
