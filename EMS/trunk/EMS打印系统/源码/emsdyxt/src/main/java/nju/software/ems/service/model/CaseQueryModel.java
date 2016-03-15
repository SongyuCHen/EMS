package nju.software.ems.service.model;

public class CaseQueryModel {
	
	//部门代码
	@Query(table="PUB_AJ_JB", sqlY="(PUB_AJ_JB.BASPT = '?') and ")
	public String bmdm;
	
	//案号
	@Query(table="PUB_AJ_JB", sqlY="(PUB_AJ_JB.AH like '%?%') and ")
	public String ah;
	
	//案件名称
	@Query(table="PUB_AJ_JB", sqlY="PUB_AJ_JB.AJMC like '%?%' and ")
	public String ajmc;
	
	//日期
	@Query(table="PUB_AJ_JB", sqlY="PUB_AJ_JB.LARQ > '?' and ")
	public String rqStart;
	
	@Query(table="PUB_AJ_JB", sqlY="PUB_AJ_JB.LARQ < '?' and ")
	public String rqEnd;
	
	//部门名称
	@Query(table="PUB_DMB", sqlY="(PUB_DMB.LBBH = 'USR206-99') and (PUB_DMB.DMMS like '%?%')")
	public String bmmc;
	
	//承办人
	@Query(table="PUB_SPRY", sqlY="(PUB_SPRY.SFCBR='Y' and PUB_SPRY.XM like '%?%') and ")
	public String cbr;
	
	public String getCbr() {
		return cbr;
	}

	public void setCbr(String cbr) {
		this.cbr = cbr;
	}

	public CaseQueryModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBmdm() {
		return bmdm;
	}

	public void setBmdm(String bmdm) {
		this.bmdm = bmdm;
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

	public String getRqStart() {
		return rqStart;
	}

	public void setRqStart(String rqStart) {
		this.rqStart = rqStart;
	}

	public String getRqEnd() {
		return rqEnd;
	}

	public void setRqEnd(String rqEnd) {
		this.rqEnd = rqEnd;
	}

	public String getBmmc() {
		return bmmc;
	}

	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}
	
	

}
