package nju.software.appraisal.data.dataobject;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "T_CONDITION")
public class Condition implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	private int bh;
	/**
	 * 评查编号
	 */
	private int pcbh;
	/**
	 * 案件性质 FBS0021-97	
	 */
	private String ajxz;
	/**
	 * 审判程序1*FBS0041-97,2*FBS0081-97,6*FBS0111-97,7*FBSSPCX-PC,8*FBSSPCX-ZX,9*FBSSPCX-SB,A*FBSSPCX-QS	
	 */
	private String spcx;
	/**
	 * 案由FBS0022-97
	 */
	private String ay;
	/**
	 * 承办人
	 */
	private String cbr;
	/**
	 * 办案法院 FBZ0001-97
	 */
	private String bafy;
	/**
	 * 办案庭室USR206-99
	 */
	private String bats;
	/**
	 * 立案开始时间
	 */
	private Date laksrq;
	/**
	 * 立案结束时间
	 */
	private Date lajsrq;
	/**
	 * 结案开始时间
	 */
	private Date jaksrq;
	/**
	 * 结案结束时间
	 */
	private Date jajsrq;
	public Condition() {
	}

	public Condition(int bh, int pcbh, String ajxz, String spcx, String ay, String cbr, String bafy, String bats, Date laksrq, Date lajsrq, Date jaksrq, Date jajsrq) {
		super();
		this.bh = bh;
		this.pcbh = pcbh;
		this.ajxz = ajxz;
		this.spcx = spcx;
		this.ay = ay;
		this.cbr = cbr;
		this.bafy =bafy;
		this.bats = bats;
		this.laksrq = laksrq;
		this.lajsrq = lajsrq;
		this.jaksrq = jaksrq;
		this.jajsrq =jajsrq;
	}
	@Id
	@Column(name="BH",nullable=false)
	public int getBh() {
		return bh;
	}

	public void setBh(int bh) {
		this.bh = bh;
	}
	@Id
	@Column(name="PCBH",nullable=false)
	public int getPcbh() {
		return pcbh;
	}

	public void setPcbh(int pcbh) {
		this.pcbh = pcbh;
	}
	@Column(name="AJXZ",nullable=true,length=20)
	public String getAjxz() {
		return ajxz;
	}

	public void setAjxz(String ajxz) {
		this.ajxz = ajxz;
	}
	@Column(name="SPCX",nullable=true,length=20)
	public String getSpcx() {
		return spcx;
	}

	public void setSpcx(String spcx) {
		this.spcx = spcx;
	}
	@Column(name="AY",nullable=true,length=20)
	public String getAy() {
		return ay;
	}

	public void setAy(String ay) {
		this.ay = ay;
	}
	@Column(name="CBR",nullable=true,length=20)
	public String getCbr() {
		return cbr;
	}

	public void setCbr(String cbr) {
		this.cbr = cbr;
	}
	@Column(name="BAFY",nullable=true,length=20)
	public String getBafy() {
		return bafy;
	}

	public void setBafy(String bafy) {
		this.bafy = bafy;
	}
	@Column(name="BATS",nullable=true,length=20)
	public String getBats() {
		return bats;
	}

	public void setBats(String bats) {
		this.bats = bats;
	}
	@Column(name="LAKSRQ",nullable=true)
	public Date getLaksrq() {
		return laksrq;
	}

	public void setLaksrq(Date laksrq) {
		this.laksrq = laksrq;
	}
	@Column(name="LAJSRQ",nullable=true)
	public Date getLajsrq() {
		return lajsrq;
	}

	public void setLajsrq(Date lajsrq) {
		this.lajsrq = lajsrq;
	}
	@Column(name="JAKSRQ",nullable=true)
	public Date getJaksrq() {
		return jaksrq;
	}

	public void setJaksrq(Date jaksrq) {
		this.jaksrq = jaksrq;
	}
	@Column(name="JAJSRQ",nullable=true)
	public Date getJajsrq() {
		return jajsrq;
	}

	public void setJajsrq(Date jajsrq) {
		this.jajsrq = jajsrq;
	}
	

}
