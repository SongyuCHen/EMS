package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Entity;
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
}
