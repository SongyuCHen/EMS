package nju.software.ems.service.model;

public class QueryModel {
	
	private String bmdm;    //部门代码
	private String cbrxm;   //承办人姓名
	private String cbrdm;   //承办人代码
	private String ah;      //案号
	private String ajmc;    //案件名称
	private String rqStart;      //日期
	private String rqEnd;        //日期
	
	public QueryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBmdm() {
		return bmdm;
	}
	public void setBmdm(String bmdm) {
		this.bmdm = bmdm;
	}
	public String getCbrxm() {
		return cbrxm;
	}
	public void setCbrxm(String cbrxm) {
		this.cbrxm = cbrxm;
	}
	public String getCbrdm() {
		return cbrdm;
	}
	public void setCbrdm(String cbrdm) {
		this.cbrdm = cbrdm;
	}
	public String getAh() {
		return ah;
	}
	public void setAh(String ah) {
		this.ah = ah;
	}
	public String getAjmc() {
		return ajmc;
	}
	public void setAjmc(String ajmc) {
		this.ajmc = ajmc;
	}
	public String getRqStart() {
		return rqStart;
	}
	public void setRqStart(String rqStart) {
		this.rqStart = rqStart;
	}
	public String getRqEnd() {
		return rqEnd;
	}
	public void setRqEnd(String rqEnd) {
		this.rqEnd = rqEnd;
	}
	

}
