package nju.software.ems.service.model;

/**
 * 案件查询结果模型
 * @author Admin
 *
 */
public class CaseResultModel  {
	@Result(table="PUB_AJ_JB", column="AJXH")
	public Integer ajxh;
	@Result(table="PUB_AJ_JB", column="AH")
	public String ah;
	@Result(table="PUB_AJ_JB", column="AJMC")
	public String ajmc;
	@Result(table="PUB_AJ_JB", column="BASPT")
	public String spt;
	@Result(table="PUB_SPRY", column="XM")
	public String xm;
	@Result(table="PUB_SPRY",column="SFCBR")
	public String sfcbr;
	@Result(table="PUB_AJ_JB", column="LARQ")
	public String larq;
	@Result(table="PUB_AJ_JB", column="JARQ")
	public String jasj;
	@Result(table="PUB_AJ_JB", column="SYCX")
	public String sycx;
	@Result(table="PUB_SPRY",column="FG")
	public String fg; 
	@Result(table="PUB_AJ_JB",column="AJXZ")
	public String ajxz;
	@Result(table="PUB_AJ_JB",column="AJZT")
	public String ajzt;
	@Result(table="PUB_AJ_JB",column="SX")
	public Integer sx;
	@Result(table="PUB_AJ_JB",column="FJSX")
	public Integer fjsx;
	@Result(table="PUB_AJ_JB",column="GDBZ")
	public String gdbz;
	@Result(table="PUB_AJ_JB",column="GDRQ")
	public String gdrq;
	//结案方式
	@Result(table="PUB_AJ_JB",column="JAFS")
	public String jafs;
	//是否有人民陪审员
	@Result(table="PUB_AJ_JB",column="PSYCY")
	public String psycy;
	//是否小额诉讼
	@Result(table="PUB_AJ_JB",column="SFXESS")
	public String sfxess;
	//审判程序
	@Result(table="PUB_AJ_JB",column="SPCX")
	public String spcx;
	//是否知识产权
	@Result(table="PUB_AJ_JB",column="SFZSCQ")
	public String sfzscq;
	//涉外情况
	@Result(table="PUB_AJ_JB",column="AJWSQK")
	public String ajwsqk;
	
	
	
	public Integer getAjxh() {
		return ajxh;
	}
	public void setAjxh(Integer ajxh) {
		this.ajxh = ajxh;
	}
	public String getAh() {
		return ah;
	}
	public void setAh(String ah) {
		this.ah = ah;
	}
	public String getAjmc() {
		return ajmc;
	}
	public void setAjmc(String ajmc) {
		this.ajmc = ajmc;
	}
	public String getSpt() {
		return spt;
	}
	public void setSpt(String spt) {
		this.spt = spt;
	}
	public String getJasj() {
		return jasj;
	}
	public void setJasj(String jasj) {
		this.jasj = jasj;
	}
	public String getLarq() {
		return larq;
	}
	public void setLarq(String larq) {
		this.larq = larq;
	}
	public String getSycx() {
		return sycx;
	}
	public void setSycx(String sycx) {
		this.sycx = sycx;
	}
//	public String getYsclsj() {
//		return ysclsj;
//	}
//	public void setYsclsj(String yscljs) {
//		this.ysclsj = yscljs;
//	}
//	public String getFirstKtsj() {
//		return firstKtsj;
//	}
//	public void setFirstKtsj(String firstKtsj) {
//		this.firstKtsj = firstKtsj;
//	}
//	public String getLastKtsj() {
//		return lastKtsj;
//	}
//	public void setLastKtsj(String lastKtsj) {
//		this.lastKtsj = lastKtsj;
//	}
//	public String getWsqfsj() {
//		return wsqfsj;
//	}
//	public void setWsqfsj(String wsqfsj) {
//		this.wsqfsj = wsqfsj;
//	}
//	public String getSjybgszd() {
//		return sjybgszd;
//	}
//	public void setSjybgszd(String sjybgszd) {
//		this.sjybgszd = sjybgszd;
//	}
//	public String getGdsj() {
//		return gdsj;
//	}
//	public void setGdsj(String gdsj) {
//		this.gdsj = gdsj;
//	}
//	public String getSfysclsj() {
//		return sfysclsj;
//	}
//	public void setSfysclsj(String sfysclsj) {
//		this.sfysclsj = sfysclsj;
//	}
//	public String getSffirstKtsj() {
//		return sffirstKtsj;
//	}
//	public void setSffirstKtsj(String sffirstKtsj) {
//		this.sffirstKtsj = sffirstKtsj;
//	}
	public String getSfcbr() {
		return sfcbr;
	}
	public void setSfcbr(String sfcbr) {
		this.sfcbr = sfcbr;
	}
	public String getFg() {
		return fg;
	}
	public void setFg(String fg) {
		this.fg = fg;
	}
	public String getAjxz() {
		return ajxz;
	}
	public void setAjxz(String ajxz) {
		this.ajxz = ajxz;
	}
	public Integer getSx() {
		return sx;
	}
	public void setSx(Integer sx) {
		this.sx = sx;
	}
	public Integer getFjsx() {
		return fjsx;
	}
	public void setFjsx(Integer fjsx) {
		this.fjsx = fjsx;
	}
	public String getGdbz() {
		return gdbz;
	}
	public void setGdbz(String gdbz) {
		this.gdbz = gdbz;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getJafs() {
		return jafs;
	}
	public void setJafs(String jafs) {
		this.jafs = jafs;
	}
	public String getPsycy() {
		return psycy;
	}
	public void setPsycy(String psycy) {
		this.psycy = psycy;
	}
	public String getSfxess() {
		return sfxess;
	}
	public void setSfxess(String sfxess) {
		this.sfxess = sfxess;
	}
	public String getSpcx() {
		return spcx;
	}
	public void setSpcx(String spcx) {
		this.spcx = spcx;
	}
	public String getAjzt() {
		return ajzt;
	}
	public void setAjzt(String ajzt) {
		this.ajzt = ajzt;
	}
	public String getSfzscq() {
		return sfzscq;
	}
	public void setSfzscq(String sfzscq) {
		this.sfzscq = sfzscq;
	}
	public String getAjwsqk() {
		return ajwsqk;
	}
	public void setAjwsqk(String ajwsqk) {
		this.ajwsqk = ajwsqk;
	}
	public String getGdrq() {
		return gdrq;
	}
	public void setGdrq(String gdrq) {
		this.gdrq = gdrq;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ah == null) ? 0 : ah.hashCode());
		result = prime * result + ((ajmc == null) ? 0 : ajmc.hashCode());
		result = prime * result + ((ajwsqk == null) ? 0 : ajwsqk.hashCode());
		result = prime * result + ((ajxh == null) ? 0 : ajxh.hashCode());
		result = prime * result + ((ajxz == null) ? 0 : ajxz.hashCode());
		result = prime * result + ((ajzt == null) ? 0 : ajzt.hashCode());
		result = prime * result + ((fg == null) ? 0 : fg.hashCode());
		result = prime * result + ((fjsx == null) ? 0 : fjsx.hashCode());
		result = prime * result + ((gdbz == null) ? 0 : gdbz.hashCode());
		result = prime * result + ((gdrq == null) ? 0 : gdrq.hashCode());
		result = prime * result + ((jafs == null) ? 0 : jafs.hashCode());
		result = prime * result + ((jasj == null) ? 0 : jasj.hashCode());
		result = prime * result + ((larq == null) ? 0 : larq.hashCode());
		result = prime * result + ((psycy == null) ? 0 : psycy.hashCode());
		result = prime * result + ((sfcbr == null) ? 0 : sfcbr.hashCode());
		result = prime * result + ((sfxess == null) ? 0 : sfxess.hashCode());
		result = prime * result + ((sfzscq == null) ? 0 : sfzscq.hashCode());
		result = prime * result + ((spcx == null) ? 0 : spcx.hashCode());
		result = prime * result + ((spt == null) ? 0 : spt.hashCode());
		result = prime * result + ((sx == null) ? 0 : sx.hashCode());
		result = prime * result + ((sycx == null) ? 0 : sycx.hashCode());
		result = prime * result + ((xm == null) ? 0 : xm.hashCode());
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
		CaseResultModel other = (CaseResultModel) obj;
		if (ah == null) {
			if (other.ah != null)
				return false;
		} else if (!ah.equals(other.ah))
			return false;
		if (ajmc == null) {
			if (other.ajmc != null)
				return false;
		} else if (!ajmc.equals(other.ajmc))
			return false;
		if (ajwsqk == null) {
			if (other.ajwsqk != null)
				return false;
		} else if (!ajwsqk.equals(other.ajwsqk))
			return false;
		if (ajxh == null) {
			if (other.ajxh != null)
				return false;
		} else if (!ajxh.equals(other.ajxh))
			return false;
		if (ajxz == null) {
			if (other.ajxz != null)
				return false;
		} else if (!ajxz.equals(other.ajxz))
			return false;
		if (ajzt == null) {
			if (other.ajzt != null)
				return false;
		} else if (!ajzt.equals(other.ajzt))
			return false;
		if (fg == null) {
			if (other.fg != null)
				return false;
		} else if (!fg.equals(other.fg))
			return false;
		if (fjsx == null) {
			if (other.fjsx != null)
				return false;
		} else if (!fjsx.equals(other.fjsx))
			return false;
		if (gdbz == null) {
			if (other.gdbz != null)
				return false;
		} else if (!gdbz.equals(other.gdbz))
			return false;
		if (gdrq == null) {
			if (other.gdrq != null)
				return false;
		} else if (!gdrq.equals(other.gdrq))
			return false;
		if (jafs == null) {
			if (other.jafs != null)
				return false;
		} else if (!jafs.equals(other.jafs))
			return false;
		if (jasj == null) {
			if (other.jasj != null)
				return false;
		} else if (!jasj.equals(other.jasj))
			return false;
		if (larq == null) {
			if (other.larq != null)
				return false;
		} else if (!larq.equals(other.larq))
			return false;
		if (psycy == null) {
			if (other.psycy != null)
				return false;
		} else if (!psycy.equals(other.psycy))
			return false;
		if (sfcbr == null) {
			if (other.sfcbr != null)
				return false;
		} else if (!sfcbr.equals(other.sfcbr))
			return false;
		if (sfxess == null) {
			if (other.sfxess != null)
				return false;
		} else if (!sfxess.equals(other.sfxess))
			return false;
		if (sfzscq == null) {
			if (other.sfzscq != null)
				return false;
		} else if (!sfzscq.equals(other.sfzscq))
			return false;
		if (spcx == null) {
			if (other.spcx != null)
				return false;
		} else if (!spcx.equals(other.spcx))
			return false;
		if (spt == null) {
			if (other.spt != null)
				return false;
		} else if (!spt.equals(other.spt))
			return false;
		if (sx == null) {
			if (other.sx != null)
				return false;
		} else if (!sx.equals(other.sx))
			return false;
		if (sycx == null) {
			if (other.sycx != null)
				return false;
		} else if (!sycx.equals(other.sycx))
			return false;
		if (xm == null) {
			if (other.xm != null)
				return false;
		} else if (!xm.equals(other.xm))
			return false;
		return true;
	}
	
}
