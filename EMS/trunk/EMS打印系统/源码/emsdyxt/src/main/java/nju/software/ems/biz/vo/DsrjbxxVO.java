package nju.software.ems.biz.vo;

import nju.software.ems.service.model.DsrJbxxModel;

public class DsrjbxxVO {
	
	private String dsrlx;  //����������
	private String dsrmc;  //����������
	private String dsrdz;  //�����˵�ַ
	private String dsrbh;  //�����˱��
	
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
