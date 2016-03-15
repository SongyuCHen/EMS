package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "T_SCORE")
public class Score implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8571799214437101073L;
	private int bh;
	private int optionbh;
	private String ms;
	private Double fz;
	@Id
	@Column(name="BH",nullable=false)
	public int getBh() {
		return bh;
	}
	public void setBh(int bh) {
		this.bh = bh;
	}
	@Column(name="OPTIONBH")
	public int getOptionbh() {
		return optionbh;
	}
	public void setOptionbh(int optionbh) {
		this.optionbh = optionbh;
	}
	@Column(name="MS",length=255)
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	@Column(name="FZ")
	public Double getFz() {
		return fz;
	}
	public void setFz(Double fz) {
		this.fz = fz;
	}
	
}
