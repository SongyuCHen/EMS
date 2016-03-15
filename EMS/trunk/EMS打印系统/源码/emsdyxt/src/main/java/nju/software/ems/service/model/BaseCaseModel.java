package nju.software.ems.service.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import nju.software.ems.data.daoobject.AjJbDO;
import nju.software.ems.util.DateUtil;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * �����Ļ�����Ϣģ��
 * 
 * @author zym
 * 
 */
//�����漰 <--> �����������
public class BaseCaseModel implements Serializable {

	private static final long serialVersionUID = -5443697228593879089L;

	/**
	 * �������
	 */
	private long ajxh;
	/**
	 * ����
	 */
	private String ah;
	/**
	 * ��������
	 */
	private String ajxz;
	/**
	 * ��������
	 */
	private String ajmc;
	/**
	 * ���г���
	 */
	private String spcx;
	/**
	 * ���г������
	 */
	private String spcxdz;
	/**
	 * ��Ժ�������
	 */
	private String bycxdz;
	/**
	 * ������Դ
	 */
	private String ajly;
	/**
	 * ������
	 */
	private String lar;
	/**
	 * ��������
	 */
	private Date larq;
	/**
	 * ��Ժ���
	 */
	private long fybh;
	/**
	 * �참����ͥ����
	 */
	private String basptmc;
	/**
	 * �참����ͥ���
	 */
	private String basptbh;
	/**
	 * �참����ͥ
	 */
	private String spt;
	/**
	 * ���ó���
	 */
	private String sycx;
	/**
	 * �Ƿ�һ��
	 */
	private String sfys;
	/**
	 * �Ƿ񷢻�����
	 */
	private String sffhcs;
	/**
	 * �Ƿ�����ƽ�
	 */
	private String sfwdyj;
	/**
	 * �����߻���
	 */
	private String gksjg;
	/**
	 * �Ƿ���
	 */
	private String sfgs;
	/**
	 * ��������
	 */
	private String sslx;
	/**
	 * ��Դ����
	 */
	private String lydq;
	/**
	 * ����
	 */
	private Integer sx;
	/**
	 * �Ƿ��ش󰸼�
	 */
	private String sfzdaj;
	/**
	 * �Ƿ񽻰참��
	 */
	private String sfjbaj;
	/**
	 * ���������
	 */
	private BigDecimal laslf;
	/**
	 * ��������
	 */
	private String laay;
	/**
	 * �����漰
	 */
	private String ajsj;
	/**
	 * �漰����
	 */
	private String sjgb;
	/**
	 **������Ľ��
	 */
	private BigDecimal labdje;
	/**
	 * ��������ͥ
	 */
	private String laspt;
	/**
	 * �Ƿ�֪ʶ��Ȩ
	 */
	private String sfzscq;

	/**
	 * ��������
	 */
	private Date ysrq;
	/**
	 * ������������
	 */
	private Date yspqrq;
	/**
	 * �᰸����
	 */
	private Date jarq;
	/**
	 * �᰸��ʽ 
	 */
	private String jafs;

	/**
	 * ���γе���
	 */
	private String zrcdr;
	/**
	 * ��������ԭ��
	 */	
	private String byslyy;
	/**
	 * ��������ԭ��
	 */	
	private String bhqsyy;
	/**
	 * ���Զ����ߴ���ԭ��
	 */	
	private String azdcsclyy;
	/**
	 * �ս�����ԭ��
	 */	
	private String zjssyy;
	/**
	 * �᰸������ 
	 */
	private Integer jazay;
	/**
	 * �᰸����������
	 */
	private String jazaymc;
	/**
	 * �᰸���
	 */
	private BigDecimal jabd;
	/**
	 * ��������ԭ��
	 */
	private String fhcsyy;
	/**
	 * ����ԭ��
	 */
	private String gpyy;
	/**
	 * �а��˱�������
	 */
	private Date cbrbprq;
	/**
	 * ��Ч����
	 */
	private Date sxrq;
	
	/**
	 * �Ƿ�С������
	 */
	private String sfxess;
	
	/**
	 * �а���
	 */
	private String xm;
	/**
	 * �참��Ժ
	 */
	private String bafy;
	/**
	 * �а��˱��
	 */
	private Integer cbrbh;
	private String shwdfxpg;
	
	// added
	/**
	 * ��Ҫ����
	 */
	private String jyaq;
	/**
	 * �᰸ԭ�����
	 */
	private String jayydm;
	
	private String bz;
	/**
	 * �鵵��־
	 */
	private String gdbz;
	/**
	 * ����״̬
	 */
	private String ajzt;
	/**
	 * ��������
	 */
	private Integer fjsx;
	/**
	 * ʵ������
	 */
	private Integer sjsx;
	private String slqk;
	/**
	 * ʣ����������
	 */
	private Long syslts;
	/**
	 * ���Ա
	 */
	private String sjy;
	/**
	 * �᰸��
	 */
	private String jar;
	/**
	 * �᰸����
	 */
	private String jaay;
	/**
	 * �Ƿ�ͥ����
	 */
	private String sfdtxp;
	/**
	 * ���ӵ������״̬
	 */
	private String shzt;
	
	public BaseCaseModel(AjJbDO ajDo)
	{
		if (ajDo != null) {

			this.setAjly(ajDo.getAjly());
			this.setAjxz(ajDo.getAjxz());
			this.setSpcx(ajDo.getSpcx());
			this.setLarq(ajDo.getLarq());
			this.setAjxh(ajDo.getAjxh());
			this.setAh(ajDo.getAh());
			this.setLar(ajDo.getLar());

			this.setSpcxdz(ajDo.getSpcxdz());
			this.setBycxdz(ajDo.getBycxdz());
			this.setSx(ajDo.getSx());
			this.setLydq(ajDo.getLydq());
			this.setSfys(ajDo.getSfys());
			this.setSycx(ajDo.getSycx());
			this.setSffhcs(ajDo.getSffhcs());
			this.setSfwdyj(ajDo.getSfwdyj());
			this.setGksjg(ajDo.getGksjg());
			this.setSfgs(ajDo.getSfgs());
			this.setSslx(ajDo.getSslx());
			this.setSfzdaj(ajDo.getSfzdaj());
			this.setSfjbaj(ajDo.getSfjbaj());
			this.setAjmc(ajDo.getAjmc());
			this.setLydq(ajDo.getLydq());
			this.setSfxess(ajDo.getSfxess());
			this.setAjsj(ajDo.getAjwsqk());
			this.setSjgb(ajDo.getSwlx());
			this.setSfzscq(ajDo.getSfzscq());
			this.setJafs(ajDo.getJafs());
			this.setJarq(ajDo.getJarq());
			this.setFhcsyy(ajDo.getFhcsyy());
			this.setGpyy(ajDo.getGpyy());
			this.setCbrbprq(ajDo.getCbrbprq());
			this.setAjmc(ajDo.getAjmc());
			this.setSxrq(ajDo.getSxrq());
			this.setBasptbh(ajDo.getBaspt());
			this.setBasptmc(ajDo.getBaspt());
			this.setBafy(ajDo.getBafy());
			this.setShwdfxpg(ajDo.getShwdfxpg());
			// add
			this.setJyaq(ajDo.getJyaq());
			this.setJayydm(ajDo.getJayydm());
			this.setBz(ajDo.getBz());
			this.setGdbz(ajDo.getGdbz());
			this.setAjzt(ajDo.getAjzt());
			this.setSlqk(ajDo.getSlqk());

		}
	}

	public String getSfxess() {
		return sfxess;
	}

	public void setSfxess(String sfxess) {
		this.sfxess = sfxess;
	}


	public BigDecimal getJabd() {
		return jabd;
	}

	public void setJabd(BigDecimal jabd) {
		this.jabd = jabd;
	}

	public Date getSxrq() {
		return sxrq;
	}

	public void setSxrq(Date sxrq) {
		this.sxrq = sxrq;
	}

	public Date getCbrbprq() {
		return cbrbprq;
	}

	public void setCbrbprq(Date cbrbprq) {
		this.cbrbprq = cbrbprq;
	}

	public Integer getJazay() {
		return jazay;
	}

	public void setJazay(Integer jazay) {
		this.jazay = jazay;
	}

	public String getJazaymc() {
		return jazaymc;
	}

	public void setJazaymc(String jazaymc) {
		this.jazaymc = jazaymc;
	}

	public BigDecimal getLaslf() {
		return laslf;
	}

	public void setLaslf(BigDecimal laslf) {
		this.laslf = laslf;
	}

	public String getLaay() {
		return laay;
	}

	public void setLaay(String laay) {
		this.laay = laay;
	}

	public String getAjsj() {
		return ajsj;
	}

	public void setAjsj(String ajsj) {
		this.ajsj = ajsj;
	}

	public String getSjgb() {
		return sjgb;
	}

	public void setSjgb(String sjgb) {
		this.sjgb = sjgb;
	}

	public BigDecimal getLabdje() {
		return labdje;
	}

	public void setLabdje(BigDecimal labdje) {
		this.labdje = labdje;
	}

	
	

	public Date getJarq() {
		return jarq;
	}

	public void setJarq(Date jarq) {
		this.jarq = jarq;
	}

	public String getJafs() {
		return jafs;
	}

	public void setJafs(String jafs) {
		this.jafs = jafs;
	}

	public BaseCaseModel() {
		super();
	}

	
	public String getBasptbh() {
		return basptbh;
	}

	public void setBasptbh(String basptbh) {
		this.basptbh = basptbh;
	}

	public BaseCaseModel(long ajxh, String ah, String ajxz, String spcx,
			String spcxdz, String bycxdz, String ajly, String lar, Date larq,
			long fybh, String sycx, String sfys, String sffhcs, String sfwdyj,
			String gksjg, String sfgs, String sslx, String lydq, Integer sx, Integer fjsx,
			String sfzdaj, String sfjbaj, BigDecimal laslf, String laay,
			Date sxrq, BigDecimal jabd, String basptbh,
			String ajsj, String sjgb, BigDecimal labdje, String laspt,
			String sfzscq, String zrcdr, String byslyy, String bhqsyy,
			String azdcsclyy, String zjssyy, Date jarq, String jafs, Date cbrbprq, String ajmc, String basptmc, String slqk) {

		super();
		this.ajxh = ajxh;
		this.ah = ah;
		this.ajxz = ajxz;
		this.spcx = spcx;
		this.spcxdz = spcxdz;
		this.bycxdz = bycxdz;
		this.ajly = ajly;
		this.lar = lar;
		this.larq = larq;
		this.fybh = fybh;
		this.sycx = sycx;
		this.sfys = sfys;
		this.sffhcs = sffhcs;
		this.sfwdyj = sfwdyj;
		this.gksjg = gksjg;
		this.sfgs = sfgs;
		this.sslx = sslx;
		this.lydq = lydq;
		this.sx = sx;
		this.fjsx = fjsx;
		this.sfzdaj = sfzdaj;
		this.sfjbaj = sfjbaj;
		this.laslf = laslf;
		this.laay = laay;
		this.ajsj = ajsj;
		this.sjgb = sjgb;
		this.labdje = labdje;
		this.laspt = laspt;
		this.sfzscq = sfzscq;

		this.jarq = jarq;
		this.jafs = jafs;

		this.zrcdr = zrcdr;
		this.byslyy = byslyy;
		this.bhqsyy = bhqsyy;
		this.azdcsclyy = azdcsclyy;
		this.zjssyy = zjssyy;
		this.cbrbprq = cbrbprq;
		this.ajmc = ajmc;
		this.basptmc = basptmc;
		this.basptbh = basptbh;
		
		this.jabd = jabd;
		this.sxrq = sxrq;
		this.slqk = slqk;
	}

	public long getAjxh() {
		return ajxh;
	}

	public void setAjxh(int ajxh) {
		this.ajxh = ajxh;
	}

	public String getAh() {
		return ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}

	public String getAjxz() {
		return ajxz;
	}

	public void setAjxz(String ajxz) {
		this.ajxz = ajxz;
	}

	public String getSpcx() {
		return spcx;
	}

	public void setSpcx(String spcx) {
		this.spcx = spcx;
	}

	public String getSpcxdz() {
		return spcxdz;
	}

	public void setSpcxdz(String spcxdz) {
		this.spcxdz = spcxdz;
	}

	public String getBycxdz() {
		return bycxdz;
	}

	public void setBycxdz(String bycxdz) {
		this.bycxdz = bycxdz;
	}

	public String getAjly() {
		return ajly;
	}

	public void setAjly(String ajly) {
		this.ajly = ajly;
	}

	public String getLar() {
		return lar;
	}

	public void setLar(String lar) {
		this.lar = lar;
	}

	public Date getLarq() {
		return larq;
	}

	public void setLarq(Date larq) {
		this.larq = larq;
	}

	public long getFybh() {
		return fybh;
	}

	public void setFybh(long fybh) {
		this.fybh = fybh;
	}

	public String getSycx() {
		return sycx;
	}

	public void setSycx(String sycx) {
		this.sycx = sycx;
	}

	public String getSfys() {
		return sfys;
	}

	public void setSfys(String sfys) {
		this.sfys = sfys;
	}

	public String getSfgs() {
		return sfgs;
	}

	public void setSfgs(String sfgs) {
		this.sfgs = sfgs;
	}

	public String getLydq() {
		return lydq;
	}

	public void setLydq(String lydq) {
		this.lydq = lydq;
	}

	public Integer getSx() {
		return sx;
	}

	public void setSx(Integer sx) {
		this.sx = sx;
	}

	public String getSfzdaj() {
		return sfzdaj;
	}

	public void setSfzdaj(String sfzdaj) {
		this.sfzdaj = sfzdaj;
	}

	public String getSfjbaj() {
		return sfjbaj;
	}

	public void setSfjbaj(String sfjbaj) {
		this.sfjbaj = sfjbaj;
	}

	public String getSffhcs() {
		return sffhcs;
	}

	public void setSffhcs(String sffhcs) {
		this.sffhcs = sffhcs;
	}

	public String getSfwdyj() {
		return sfwdyj;
	}

	public void setSfwdyj(String sfwdyj) {
		this.sfwdyj = sfwdyj;
	}

	public String getGksjg() {
		return gksjg;
	}

	public void setGksjg(String gksjg) {
		this.gksjg = gksjg;
	}

	public String getSslx() {
		return sslx;
	}

	public void setSslx(String sslx) {
		this.sslx = sslx;
	}
	
	

	public String getSfzscq() {
		return sfzscq;
	}

	public void setSfzscq(String sfzscq) {
		this.sfzscq = sfzscq;
	}

	public String getLaspt() {
		return laspt;
	}

	public void setLaspt(String laspt) {
		this.laspt = laspt;
	}

	public String getZrcdr() {
		return zrcdr;
	}

	public void setZrcdr(String zrcdr) {
		this.zrcdr = zrcdr;
	}

	public String getByslyy() {
		return byslyy;
	}

	public void setByslyy(String byslyy) {
		this.byslyy = byslyy;
	}

	public String getBhqsyy() {
		return bhqsyy;
	}

	public void setBhqsyy(String bhqsyy) {
		this.bhqsyy = bhqsyy;
	}

	public String getAzdcsclyy() {
		return azdcsclyy;
	}

	public void setAzdcsclyy(String azdcsclyy) {
		this.azdcsclyy = azdcsclyy;
	}

	public String getZjssyy() {
		return zjssyy;
	}

	public void setZjssyy(String zjssyy) {
		this.zjssyy = zjssyy;
	}

	public String getFhcsyy() {
		return fhcsyy;
	}

	public void setFhcsyy(String fhcsyy) {
		this.fhcsyy = fhcsyy;
	}

	public String getGpyy() {
		return gpyy;
	}

	public void setGpyy(String gpyy) {
		this.gpyy = gpyy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAjmc() {
		return ajmc;
	}

	public void setAjmc(String ajmc) {
		this.ajmc = ajmc;
	}

	public String getBasptmc() {
		return basptmc;
	}

	public void setBasptmc(String basptmc) {
		this.basptmc = basptmc;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getBafy() {
		return bafy;
	}

	public void setBafy(String bafy) {
		this.bafy = bafy;
	}

	public String getShwdfxpg() {
		return shwdfxpg;
	}

	public void setShwdfxpg(String shwdfxpg) {
		this.shwdfxpg = shwdfxpg;
	}
	
	

	public String getJyaq() {
		return jyaq;
	}

	public void setJyaq(String jyaq) {
		this.jyaq = jyaq;
	}

	public String getJayydm() {
		return jayydm;
	}

	public void setJayydm(String jayydm) {
		this.jayydm = jayydm;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getGdbz() {
		return gdbz;
	}

	public void setGdbz(String gdbz) {
		this.gdbz = gdbz;
	}

	public String getAjzt() {
		return ajzt;
	}

	public void setAjzt(String ajzt) {
		this.ajzt = ajzt;
	}

public String getSlqk() {
		return slqk;
	}

	public void setSlqk(String slqk) {
		this.slqk = slqk;
	}
	public Integer getFjsx() {
		return fjsx;
	}

	public void setFjsx(Integer fjsx) {
		this.fjsx = fjsx;
	}
	

	public Integer getSjsx() {
		return sjsx;
	}

	public void setSjsx(Integer sjsx) {
		this.sjsx = sjsx;
	}


	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}


	public String getSjy() {
		return sjy;
	}

	public void setSjy(String sjy) {
		this.sjy = sjy;
	}

	public Integer getCbrbh() {
		return cbrbh;
	}

	public void setCbrbh(Integer cbrbh) {
		this.cbrbh = cbrbh;
	}

	public String getJaay() {
		return jaay;
	}

	public void setJaay(String jaay) {
		this.jaay = jaay;
	}

	public String getSfdtxp() {
		return sfdtxp;
	}

	public void setSfdtxp(String sfdtxp) {
		this.sfdtxp = sfdtxp;
	}

public String getShzt() {
		return shzt;
	}

	public void setShzt(String shzt) {
		this.shzt = shzt;
	}

	public Date getYsrq() {
		return ysrq;
	}

	public void setYsrq(Date ysrq) {
		this.ysrq = ysrq;
	}

	public Date getYspqrq() {
		return yspqrq;
	}

	public void setYspqrq(Date yspqrq) {
		this.yspqrq = yspqrq;
	}

	public String getSpt() {
		return spt;
	}

	public void setSpt(String spt) {
		this.spt = spt;
	}

	public String getJar() {
		return jar;
	}

	public void setJar(String jar) {
		this.jar = jar;
	}

	public Long getSyslts() {
		return syslts;
	}

	public void setSyslts(Long syslts) {
		this.syslts = syslts;
	}


}
