package nju.software.appraisal.service.model;

/**
 * @author 徐鑫源 xxy
 *
 * 2014-6-30 下午05:22:21 Admin
 */

import java.util.Date;

public class SearchConditionForDzda {
	//案号
	private String ah;
	//案件名称
	private String ajmc;
	//立案开始时间
	private Date la_begin_time;
	//立案结束时间
	private Date la_end_time;
	//结案开始时间
	private Date ja_begin_time;
	//结案结束时间
	private Date ja_end_time;
	//审判庭
	private String spt;
	//案件性质
	private String ajxz;
	//承办人
	private String cbr;
	//归档日期
	private Date gdrq;
	//电子档案来源
	private String dzdaly;
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
	public Date getLa_begin_time() {
		return la_begin_time;
	}
	public void setLa_begin_time(Date la_begin_time) {
		this.la_begin_time = la_begin_time;
	}
	
	public Date getLa_end_time() {
		return la_end_time;
	}
	public void setLa_end_time(Date la_end_time) {
		this.la_end_time = la_end_time;
	}
	public Date getJa_begin_time() {
		return ja_begin_time;
	}
	public void setJa_begin_time(Date ja_begin_time) {
		this.ja_begin_time = ja_begin_time;
	}
	
	public Date getJa_end_time() {
		return ja_end_time;
	}
	public void setJa_end_time(Date ja_end_time) {
		this.ja_end_time = ja_end_time;
	}
	public String getSpt() {
		return spt;
	}
	public void setSpt(String spt) {
		this.spt = spt;
	}
	public String getAjxz() {
		return ajxz;
	}
	public void setAjxz(String ajxz) {
		this.ajxz = ajxz;
	}
	public String getCbr() {
		return cbr;
	}
	public void setCbr(String cbr) {
		this.cbr = cbr;
	}
	public Date getGdrq() {
		return gdrq;
	}
	public void setGdrq(Date gdrq) {
		this.gdrq = gdrq;
	}
	public String getDzdaly() {
		return dzdaly;
	}
	public void setDzdaly(String dzdaly) {
		this.dzdaly = dzdaly;
	}
}