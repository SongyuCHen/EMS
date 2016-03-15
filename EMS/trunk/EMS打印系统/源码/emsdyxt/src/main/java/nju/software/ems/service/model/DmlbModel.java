/**
 * created at 2012-5-21
 */
package nju.software.ems.service.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 代码类别的领域模型
 * @author zym
 *
 */
public class DmlbModel implements Serializable{
	
	private static final long serialVersionUID = -2564425145161071380L;
	/**
	 * 类别编号
	 */
	private String lbbh;
	/**
	 * 类别大类
	 */
	private String lbdl;
	/**
	 * 类别小类
	 */
	private String lbxl;
	/**
	 * 类别描述
	 */
	private String lbms;
	/**
	 * 编码长度
	 */
	private Integer dmcd;
	/**
	 * 备注
	 */
	private String bz;
	/**
	 * 修改时间
	 */
	private Date xgsj;
	/**
	 * 当前标识
	 */
	private String dqbs;
	/**
	 * 法院编号
	 */
	private long fybh;
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

	public String getLbbh() {
		return lbbh;
	}

	public void setLbbh(String lbbh) {
		this.lbbh = lbbh;
	}

	public String getLbdl() {
		return lbdl;
	}

	public void setLbdl(String lbdl) {
		this.lbdl = lbdl;
	}

	public String getLbxl() {
		return lbxl;
	}

	public void setLbxl(String lbxl) {
		this.lbxl = lbxl;
	}

	public String getLbms() {
		return lbms;
	}

	public void setLbms(String lbms) {
		this.lbms = lbms;
	}

	public Integer getDmcd() {
		return dmcd;
	}
	
	public void setDmcd(Integer dmcd) {
		this.dmcd = dmcd;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}


	public Date getXgsj() {
		return xgsj;
	}

	public void setXgsj(Date xgsj) {
		this.xgsj = xgsj;
	}

	public String getDqbs() {
		return dqbs;
	}

	public void setDqbs(String dqbs) {
		this.dqbs = dqbs;
	}

	public long getFybh() {
		return fybh;
	}

	public void setFybh(long fybh) {
		this.fybh = fybh;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DmlbModel))
			return false;
		DmlbModel castOther=(DmlbModel)other;
		boolean isEqual=
				((this.getLbbh() == castOther.getLbbh()) || (this.getLbbh() != null && castOther.getLbbh() != null && this.getLbbh().equals(castOther.getLbbh())))
				&&((this.getLbdl() == castOther.getLbdl()) || (this.getLbdl() != null && castOther.getLbdl() != null && this.getLbdl().equals(castOther.getLbdl())))
				&&((this.getLbxl() == castOther.getLbxl()) || (this.getLbxl() != null && castOther.getLbxl() != null && this.getLbxl().equals(castOther.getLbxl())))
				&&((this.getLbms() == castOther.getLbms()) || (this.getLbms() != null && castOther.getLbms() != null && this.getLbms().equals(castOther.getLbms())))
				&&((this.getDmcd() == castOther.getDmcd()) || (this.getDmcd() != null && castOther.getDmcd() != null && this.getDmcd().equals(castOther.getDmcd())))
				&&((this.getBz() == castOther.getBz()) || (this.getBz() != null && castOther.getBz() != null && this.getBz().equals(castOther.getBz())))
				&& ((this.getXgsj() == castOther.getXgsj()) || (this.getXgsj() != null && castOther.getXgsj() != null && this.getXgsj().toGMTString().equals(castOther.getXgsj().toGMTString())))
				&& ((this.getDqbs() == castOther.getDqbs()) || (this.getDqbs() != null && castOther.getDqbs() != null && this.getDqbs().equals(castOther.getDqbs())))
				&& (this.getFybh() == castOther.getFybh())
				;
		return isEqual;
	}
}
