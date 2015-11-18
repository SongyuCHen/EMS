package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "T_PCOPTION")
public class PcOption implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ���
	 */
	private int bh;
	/**
	 * ������
	 */
	private int pcbh;
	/**
	 * ������Ŀ���
	 */
	private int optionbh;
	public PcOption() {
	}

	public PcOption(int bh, int pcbh, int optionbh) {
		super();
		this.bh = bh;
		this.pcbh = pcbh;
		this.optionbh = optionbh;
	}
	@Id
	@Column(name="BH",nullable=false)
	public int getBh() {
		return bh;
	}

	public void setBh(int bh) {
		this.bh = bh;
	}
	@Column(name="PCBH",nullable=false)
	public int getPcbh() {
		return pcbh;
	}

	public void setPcbh(int pcbh) {
		this.pcbh = pcbh;
	}
	@Column(name="OPTIONBH",nullable=false)
	public int getOptionbh() {
		return optionbh;
	}

	public void setOptionbh(int optionbh) {
		this.optionbh = optionbh;
	}
	

}
