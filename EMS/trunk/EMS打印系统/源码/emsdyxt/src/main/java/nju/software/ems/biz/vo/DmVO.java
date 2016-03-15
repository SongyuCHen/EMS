package nju.software.ems.biz.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DmVO {
	/**
	 * ±‡∫≈
	 */
	public String bh;
	/**
	 * √Ë ˆ
	 */
	public String ms;
	
	public DmVO() {
		super();
	}
	public DmVO(String bh, String ms) {
		super();
		this.bh = bh;
		this.ms = ms;
	}
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
