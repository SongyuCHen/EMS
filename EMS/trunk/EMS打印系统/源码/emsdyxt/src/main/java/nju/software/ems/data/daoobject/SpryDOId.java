package nju.software.ems.data.daoobject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.IdClass;

/**
 * Don't use this file!
 * SpryDOId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class SpryDOId implements java.io.Serializable {

	// Fields

	private Integer ajxh;
	private Integer sprybh;

	// Constructors

	/** default constructor */
	public SpryDOId() {
	}

	/** full constructor */
	public SpryDOId(Integer ajxh, Integer sprybh) {
		this.ajxh = ajxh;
		this.sprybh = sprybh;
	}

	// Property accessors

	@Column(name = "AJXH", nullable = false)
	public Integer getAjxh() {
		return this.ajxh;
	}

	public void setAjxh(Integer ajxh) {
		this.ajxh = ajxh;
	}

	@Column(name = "SPRYBH", nullable = false)
	public Integer getSprybh() {
		return this.sprybh;
	}

	public void setSprybh(Integer sprybh) {
		this.sprybh = sprybh;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SpryDOId))
			return false;
		SpryDOId castOther = (SpryDOId) other;

		return ((this.getAjxh() == castOther.getAjxh()) || (this.getAjxh() != null
				&& castOther.getAjxh() != null && this.getAjxh().equals(
				castOther.getAjxh())))
				&& ((this.getSprybh() == castOther.getSprybh()) || (this
						.getSprybh() != null && castOther.getSprybh() != null && this
						.getSprybh().equals(castOther.getSprybh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAjxh() == null ? 0 : this.getAjxh().hashCode());
		result = 37 * result
				+ (getSprybh() == null ? 0 : this.getSprybh().hashCode());
		return result;
	}

}