package nju.software.appraisal.data.dataobject;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "T_PCAJ")
public class PcAj implements Serializable{
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
	 * �������
	 */
	private int ajxh;
	/**
	 * ��Ժ���FBZ0001-97
	 */
	private String fybh;
	/**
	 * ����״̬
	 */
	private String ajzt;
	/**
	 * ����ֵ1
	 */
	private double pcz1;
	/**
	 * ����ֵ2
	 */
	private double pcz2;
	/**
	 * ����ֵ3
	 */
	private double pcz3;
	/**
	 * ����ֵ4
	 */
	private double pcz4;
	/**
	 * ����ֵ5
	 */
	private double pcz5;
	/**
	 * ������
	 */
	private String pcjg;
	public PcAj() {
	}

	public PcAj(int bh,int pcbh,int ajxh, String fybh, String ajzt, double pcz1, double pcz2, double pcz3,double pcz4,double pcz5,String pcjg) {
		super();
		this.bh=bh;
		this.pcbh = pcbh;
		this.ajxh=ajxh;
		this.fybh=fybh;
		this.ajzt=ajzt;
		this.pcz1 = pcz1;
		this.pcz2 = pcz2;
		this.pcz3=pcz3;
		this.pcz4=pcz4;
		this.pcz5=pcz5;
		this.pcjg=pcjg;
	}
	@Id
	@Column(name="BH",nullable=true)
	public int getBh() {
		return bh;
	}

	public void setBh(int bh) {
		this.bh = bh;
	}
	@Column(name="PCBH",nullable=true)
	public int getPcbh() {
		return pcbh;
	}

	public void setPcbh(int pcbh) {
		this.pcbh = pcbh;
	}
	@Column(name="AJXH",nullable=true)
	public int getAjxh() {
		return ajxh;
	}

	public void setAjxh(int ajxh) {
		this.ajxh = ajxh;
	}
	@Column(name="FYBH",length=10)
	public String getFybh() {
		return fybh;
	}

	public void setFybh(String fybh) {
		this.fybh = fybh;
	}
	@Column(name="AJZT",length=10)
	public String getAjzt() {
		return ajzt;
	}

	public void setAjzt(String ajzt) {
		this.ajzt = ajzt;
	}

	public double getPcz1() {
		return pcz1;
	}

	public void setPcz1(double pcz1) {
		this.pcz1 = pcz1;
	}

	public double getPcz2() {
		return pcz2;
	}

	public void setPcz2(double pcz2) {
		this.pcz2 = pcz2;
	}

	public double getPcz3() {
		return pcz3;
	}

	public void setPcz3(double pcz3) {
		this.pcz3 = pcz3;
	}

	public double getPcz4() {
		return pcz4;
	}

	public void setPcz4(double pcz4) {
		this.pcz4 = pcz4;
	}

	public double getPcz5() {
		return pcz5;
	}

	public void setPcz5(double pcz5) {
		this.pcz5 = pcz5;
	}
	@Column(name="PCGH",length=20)
	public String getPcjg() {
		return pcjg;
	}

	public void setPcjg(String pcjg) {
		this.pcjg = pcjg;
	}
	
}
