package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "T_PCSQ")
public class Pcsq implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 类别编号
	 */
	private int pcbh;
	/**
	 * 评查名称
	 */
	private String pcmc;
	/**
	 * 评查依据
	 */
	private String pcyj;
	
	
	public Pcsq() {
	}

	public Pcsq(int pcbh, String pcmc, String pcyj) {
		super();
		this.pcbh = pcbh;
		this.pcmc = pcmc;
		this.pcyj = pcyj;
	}
	@Id
	@Column(name="PCBH",nullable=false)

	public int getPcbh() {
		return pcbh;
	}

	public void setPcbh(int pcbh) {
		this.pcbh = pcbh;
	}
	@Column(name="PCMC",nullable=true,length=200)
	public String getPcmc() {
		return pcmc;
	}

	public void setPcmc(String pcmc) {
		this.pcmc = pcmc;
	}
	@Column(name="PCYJ",nullable=true,length=200)
	public String getPcyj() {
		return pcyj;
	}

	public void setPcyj(String pcyj) {
		this.pcyj = pcyj;
	}
	
}
