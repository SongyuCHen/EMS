package nju.software.ems.service.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * 部门的领域模型
 * 
 * @author dyh
 * 
 */
public class BmModel {
	/**
	 * 部门编号
	 */
	private String bmbh;
	/**
	 * 法院编号
	 */
	private long fybh;
	/**
	 * 部门名称
	 */
	private String bmmc;
	/**
	 * 部门名称
	 */
	private boolean spbm;
	
	public boolean getSpbm() {
		return spbm;
	}

	public void setSpbm(boolean spbm) {
		this.spbm = spbm;
	}

	public String getBmzt() {
		return bmzt;
	}

	public void setBmzt(String bmzt) {
		this.bmzt = bmzt;
	}

	/**
	 * 部门名称
	 */
	private String bmzt;
	
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public void setBmbh(String bmbh) {
		this.bmbh = bmbh;
	}

	public String getBmbh() {
		return bmbh;
	}

	public void setFybh(long fybh) {
		this.fybh = fybh;
	}

	public long getFybh() {
		return fybh;
	}

	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}

	public String getBmmc() {
		return bmmc;
	}
	
	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BmModel))
			return false;
		BmModel castOther=(BmModel)other;
		boolean isEqual=
				((this.getBmbh() == castOther.getBmbh()))
				&&((this.getFybh() == castOther.getFybh()))
				&&((this.getBmmc() == castOther.getBmmc()) || (this.getBmmc() != null && castOther.getBmmc() != null && this.getBmmc().equals(castOther.getBmmc())))
				;
		return isEqual;
	}
}
