package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "T_PCR")
public class Pcr implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ±àºÅ
	 */
	private int bh;
	/**
	 * ÈËÔ±±àºÅ
	 */
	private int rybh;
	/**
	 * ÐÕÃû
	 */
	private String xm;
	/**
	 * ½ÇÉ«±àºÅ
	 */
	private int jsbh;
	
	public Pcr() {
	}


	/**
	 * @param bh
	 * @param rybh
	 * @param xm
	 * @param jsbh
	 */
	public Pcr(int bh, int rybh, String xm, int jsbh) {
		super();
		this.bh = bh;
		this.rybh = rybh;
		this.xm = xm;
		this.jsbh = jsbh;
	}


	@Id
	@Column(name="BH",nullable=false)
	public int getBh() {
		return bh;
	}

	public void setBh(int bh) {
		this.bh = bh;
	}
	@Column(name="RYBH")
	public int getRybh() {
		return rybh;
	}

	public void setRybh(int rybh) {
		this.rybh = rybh;
	}
	@Column(name="XM",nullable=true,length=50)
	public String getPcbh() {
		return xm;
	}

	public void setPcbh(String xm) {
		this.xm = xm;
	}
	@Column(name="JSBH")
	public int getJsbh() {
		return jsbh;
	}

	public void setJsbh(int jsbh) {
		this.jsbh = jsbh;
	}
	

}
