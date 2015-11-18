package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;

public class PubAyDmbId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6012765168661828467L;
	private String bbh;
	private String dmbh;
	
	public PubAyDmbId() {
	}

	public PubAyDmbId(String bbh, String dmbh) {
		super();
		this.bbh = bbh;
		this.dmbh = dmbh;
	}
	@Column(name="BBH",nullable=false)
	public String getBbh() {
		return bbh;
	}

	public void setBbh(String bbh) {
		this.bbh = bbh;
	}
	@Column(name="DMBH",nullable=false)
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
		result = prime * result + ((bbh == null) ? 0 : bbh.hashCode());
		result = prime * result + ((dmbh == null) ? 0 : dmbh.hashCode());
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
		PubAyDmbId other = (PubAyDmbId) obj;
		if (bbh == null) {
			if (other.bbh != null)
				return false;
		} else if (!bbh.equals(other.bbh))
			return false;
		if (dmbh == null) {
			if (other.dmbh != null)
				return false;
		} else if (!dmbh.equals(other.dmbh))
			return false;
		return true;
	}
	
	
}
