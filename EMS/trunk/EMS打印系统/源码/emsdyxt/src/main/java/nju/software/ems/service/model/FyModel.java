package nju.software.ems.service.model;

public class FyModel {
	
	private String fymc;    //法院名称
	private String fyyb;    //法院邮编
	private String dataBaseFymc;   //数据库中法院名称
	public FyModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFymc() {
		return fymc;
	}
	public void setFymc(String fymc) {
		this.fymc = fymc;
	}
	public String getFyyb() {
		return fyyb;
	}
	public void setFyyb(String fyyb) {
		this.fyyb = fyyb;
	}
	public String getDataBaseFymc() {
		return dataBaseFymc;
	}
	public void setDataBaseFymc(String dataBaseFymc) {
		this.dataBaseFymc = dataBaseFymc;
	}
	
	
	
	
}
