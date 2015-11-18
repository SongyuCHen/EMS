package nju.software.appraisal.service.model;

import java.io.Serializable;
import java.util.Date;

public class CheckTaskModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int t0;
	private String t1;
	private String t2;
	private String t3;
	private Date t4;
	private Date t5;
	private String t6;
	
	public CheckTaskModel(int t0 ,String t1, String t2, String t3 , Date t4, Date t5, String t6){
		this.t0 = t0;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.t6 = t6;
	}
	
	
	


	public int getT0() {
		return t0;
	}

	public void setT0(int t0) {
		this.t0 = t0;
	}

	public String getT1() {
		return t1;
	}


	public void setT1(String t1) {
		this.t1 = t1;
	}


	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public String getT3() {
		return t3;
	}
	public void setT3(String t3) {
		this.t3 = t3;
	}
	public Date getT4() {
		return t4;
	}
	public void setT4(Date t4) {
		this.t4 = t4;
	}
	public Date getT5() {
		return t5;
	}
	public void setT5(Date t5) {
		this.t5 = t5;
	}
	public String getT6() {
		return t6;
	}
	public void setT6(String t6) {
		this.t6 = t6;
	}
	
	

}
