package nju.software.appraisal.service.model;

import java.io.Serializable;

public class PubFyModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4035327596656339995L;
	/**
	 * 法院代码
	 */
	private String fydm;
	/**
	 * 法院名称
	 */
	private String fymc;
	public String getFydm() {
		return fydm;
	}
	public void setFydm(String fydm) {
		this.fydm = fydm;
	}
	public String getFymc() {
		return fymc;
	}
	public void setFymc(String fymc) {
		this.fymc = fymc;
	}
	public PubFyModel(String fydm, String fymc) {
		super();
		this.fydm = fydm;
		this.fymc = fymc;
	}
	
}
