package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;

public class DmbId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1105022955471251528L;
	/**
	 * Àà±ð±àºÅ
	 */
	private String lbbh;
	/**
	 * ´úÂë±àºÅ
	 */
	private String dmbh;

	public DmbId() {
	}

	public DmbId(String lbbh, String dmbh) {
		super();
		this.lbbh = lbbh;
		this.dmbh = dmbh;
	}

	@Column(name = "LBBH", nullable = false, length = 20)
	public String getLbbh() {
		return lbbh;
	}

	public void setLbbh(String lbbh) {
		this.lbbh = lbbh;
	}

	@Column(name = "DMBH", nullable = false, length = 20)
	public String getDmbh() {
		return dmbh;
	}

	public void setDmbh(String dmbh) {
		this.dmbh = dmbh;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dmbh == null) ? 0 : dmbh.hashCode());
		result = prime * result + ((lbbh == null) ? 0 : lbbh.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DmbId other = (DmbId) obj;
		if (dmbh == null) {
			if (other.dmbh != null)
				return false;
		} else if (!dmbh.equals(other.dmbh))
			return false;
		if (lbbh == null) {
			if (other.lbbh != null)
				return false;
		} else if (!lbbh.equals(other.lbbh))
			return false;
		return true;
	}
}
