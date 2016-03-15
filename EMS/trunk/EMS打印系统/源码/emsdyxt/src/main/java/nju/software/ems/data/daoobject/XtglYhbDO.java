package nju.software.ems.data.daoobject;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * XtglYhbDO entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_XTGL_YHB")
public class XtglYhbDO implements java.io.Serializable {

	// Fields

	private Integer yhbh;
	private String yhdm;
	private String yhmc;
	private String yhkl;
	private String yhbm;
	private String klts;
	private String klda;
	private String yhsf;
	private Date klszsj;
	private Date qjkssj;
	private Date qjjssj;
	private String qjyy;
	private Integer grnzb;
	private Integer qtnzb;
	private Integer fazt;
	private Integer fasl;
	private Integer grbajs;
//	private byte[] dzqmImg;
	private String phonenum;
	private String yhzt;
	private Integer fybh;

	// Constructors

	/** default constructor */
	public XtglYhbDO() {
	}

	/** minimal constructor */
	public XtglYhbDO(Integer yhbh) {
		this.yhbh = yhbh;
	}

	/** full constructor */
	public XtglYhbDO(Integer yhbh, String yhdm, String yhmc, String yhkl,
			String yhbm, String klts, String klda, String yhsf, Date klszsj,
			Date qjkssj, Date qjjssj, String qjyy, Integer grnzb,
			Integer qtnzb, Integer fazt, Integer fasl, Integer grbajs,
			String phonenum, String yhzt,
			Integer fybh) {
		this.yhbh = yhbh;
		this.yhdm = yhdm;
		this.yhmc = yhmc;
		this.yhkl = yhkl;
		this.yhbm = yhbm;
		this.klts = klts;
		this.klda = klda;
		this.yhsf = yhsf;
		this.klszsj = klszsj;
		this.qjkssj = qjkssj;
		this.qjjssj = qjjssj;
		this.qjyy = qjyy;
		this.grnzb = grnzb;
		this.qtnzb = qtnzb;
		this.fazt = fazt;
		this.fasl = fasl;
		this.grbajs = grbajs;
//		this.dzqmImg = dzqmImg;
		this.phonenum = phonenum;
		this.yhzt = yhzt;
		this.fybh = fybh;
	}

	// Property accessors
	@Id
	@Column(name = "YHBH", unique = true, nullable = false)
	public Integer getYhbh() {
		return this.yhbh;
	}

	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}

	@Column(name = "YHDM", length = 10)
	public String getYhdm() {
		return this.yhdm;
	}

	public void setYhdm(String yhdm) {
		this.yhdm = yhdm;
	}

	@Column(name = "YHMC", length = 50)
	public String getYhmc() {
		return this.yhmc;
	}

	public void setYhmc(String yhmc) {
		this.yhmc = yhmc;
	}

	@Column(name = "YHKL", length = 20)
	public String getYhkl() {
		return this.yhkl;
	}

	public void setYhkl(String yhkl) {
		this.yhkl = yhkl;
	}

	@Column(name = "YHBM", length = 20)
	public String getYhbm() {
		return this.yhbm;
	}

	public void setYhbm(String yhbm) {
		this.yhbm = yhbm;
	}

	@Column(name = "KLTS", length = 40)
	public String getKlts() {
		return this.klts;
	}

	public void setKlts(String klts) {
		this.klts = klts;
	}

	@Column(name = "KLDA", length = 20)
	public String getKlda() {
		return this.klda;
	}

	public void setKlda(String klda) {
		this.klda = klda;
	}

	@Column(name = "YHSF", length = 20)
	public String getYhsf() {
		return this.yhsf;
	}

	public void setYhsf(String yhsf) {
		this.yhsf = yhsf;
	}

	@Column(name = "KLSZSJ", length = 23)
	public Date getKlszsj() {
		return this.klszsj;
	}

	public void setKlszsj(Date klszsj) {
		this.klszsj = klszsj;
	}

	@Column(name = "QJKSSJ", length = 23)
	public Date getQjkssj() {
		return this.qjkssj;
	}

	public void setQjkssj(Date qjkssj) {
		this.qjkssj = qjkssj;
	}

	@Column(name = "QJJSSJ", length = 23)
	public Date getQjjssj() {
		return this.qjjssj;
	}

	public void setQjjssj(Date qjjssj) {
		this.qjjssj = qjjssj;
	}

	@Column(name = "QJYY", length = 200)
	public String getQjyy() {
		return this.qjyy;
	}

	public void setQjyy(String qjyy) {
		this.qjyy = qjyy;
	}

	@Column(name = "GRNZB")
	public Integer getGrnzb() {
		return this.grnzb;
	}

	public void setGrnzb(Integer grnzb) {
		this.grnzb = grnzb;
	}

	@Column(name = "QTNZB")
	public Integer getQtnzb() {
		return this.qtnzb;
	}

	public void setQtnzb(Integer qtnzb) {
		this.qtnzb = qtnzb;
	}

	@Column(name = "FAZT")
	public Integer getFazt() {
		return this.fazt;
	}

	public void setFazt(Integer fazt) {
		this.fazt = fazt;
	}

	@Column(name = "FASL")
	public Integer getFasl() {
		return this.fasl;
	}

	public void setFasl(Integer fasl) {
		this.fasl = fasl;
	}

	@Column(name = "GRBAJS")
	public Integer getGrbajs() {
		return this.grbajs;
	}

	public void setGrbajs(Integer grbajs) {
		this.grbajs = grbajs;
	}

//	@Column(name = "DZQM_IMG")
//	public byte[] getDzqmImg() {
//		return this.dzqmImg;
//	}
//
//	public void setDzqmImg(byte[] dzqmImg) {
//		this.dzqmImg = dzqmImg;
//	}

	@Column(name = "PHONENUM", length = 20)
	public String getPhonenum() {
		return this.phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	@Column(name = "YHZT", length = 10)
	public String getYhzt() {
		return this.yhzt;
	}

	public void setYhzt(String yhzt) {
		this.yhzt = yhzt;
	}

	@Column(name = "FYBH")
	public Integer getFybh() {
		return this.fybh;
	}

	public void setFybh(Integer fybh) {
		this.fybh = fybh;
	}

}