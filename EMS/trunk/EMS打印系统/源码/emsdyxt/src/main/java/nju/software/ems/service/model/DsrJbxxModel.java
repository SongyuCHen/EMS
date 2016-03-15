package nju.software.ems.service.model;

/**
 * 当事人信息通用model
 * @author Admin
 *
 */
public class DsrJbxxModel {
	private long ajxh;
	private int dsrbh;
	private String dsrlb;
	private String dsrlbms;   //当事人类别描述
	private String dsrssdw;   //当事人诉讼地位
	private String dsrjc;   //当事人简称
	private String ah;      //案号
	
	private String xm;   //当事人姓名
	private String dwmc;   //当事人单位
	private String dz;   //当事人地址
	private String dxgzhm; //当事短信告知号码
	private String lxdh;   //联系电话
	private String yb;     //邮编
	private String gzdw;   //工作单位
	private String jzd;    //居住地
	
	public DsrJbxxModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAjxh() {
		return ajxh;
	}
	public void setAjxh(long ajxh) {
		this.ajxh = ajxh;
	}
	public int getDsrbh() {
		return dsrbh;
	}
	public void setDsrbh(int dsrbh) {
		this.dsrbh = dsrbh;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getDwmc() {
		return dwmc;
	}
	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}
	public String getDz() {
		return dz;
	}
	public void setDz(String dz) {
		this.dz = dz;
	}
	public String getDxgzhm() {
		return dxgzhm;
	}
	public void setDxgzhm(String dxgzhm) {
		this.dxgzhm = dxgzhm;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getYb() {
		return yb;
	}
	public void setYb(String yb) {
		this.yb = yb;
	}
	public String getGzdw() {
		return gzdw;
	}
	public void setGzdw(String gzdw) {
		this.gzdw = gzdw;
	}
	public String getJzd() {
		return jzd;
	}
	public void setJzd(String jzd) {
		this.jzd = jzd;
	}
	public String getDsrlb() {
		return dsrlb;
	}
	public void setDsrlb(String dsrlb) {
		this.dsrlb = dsrlb;
	}
	public String getDsrssdw() {
		return dsrssdw;
	}
	public void setDsrssdw(String dsrssdw) {
		this.dsrssdw = dsrssdw;
	}
	public String getDsrjc() {
		return dsrjc;
	}
	public void setDsrjc(String dsrjc) {
		this.dsrjc = dsrjc;
	}
	public String getDsrlbms() {
		return dsrlbms;
	}
	public void setDsrlbms(String dsrlbms) {
		this.dsrlbms = dsrlbms;
	}
	public String getAh() {
		return ah;
	}
	public void setAh(String ah) {
		this.ah = ah;
	}
	
	

}
