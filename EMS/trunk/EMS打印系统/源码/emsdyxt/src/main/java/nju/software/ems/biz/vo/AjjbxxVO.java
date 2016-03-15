package nju.software.ems.biz.vo;

import java.util.ArrayList;
import java.util.List;

import nju.software.ems.service.model.DsrJbxxModel;

public class AjjbxxVO {
	private long ajxh;
	private String ah;     //����
	private String ajmc;   //��������
	private String baspt;  //�참����ͥ
	
	private List<DsrjbxxVO> dsrjbxxVOs;  //��������Ϣ
	private int dsrrs;

	public AjjbxxVO() {
		super();
		// TODO Auto-generated constructor stub
		dsrjbxxVOs = new ArrayList<DsrjbxxVO>();
		dsrrs = 0;
	}
	
	/**
	 * ��ӵ�������Ϣ
	 * @param model ��������Ϣmodel
	 */
	public void updateDsrxx(DsrJbxxModel model)
	{
		dsrjbxxVOs.add(new DsrjbxxVO(model));
		++dsrrs;
	}
	public long getAjxh() {
		return ajxh;
	}
	public void setAjxh(long ajxh) {
		this.ajxh = ajxh;
	}
	public String getAjmc() {
		return ajmc;
	}
	public void setAjmc(String ajmc) {
		this.ajmc = ajmc;
	}

	public String getBaspt() {
		return baspt;
	}
	public void setBaspt(String baspt) {
		this.baspt = baspt;
	}

	public int getDsrrs() {
		return dsrrs;
	}

	public List<DsrjbxxVO> getDsrjbxxVOs() {
		return dsrjbxxVOs;
	}

	public void setDsrjbxxVOs(List<DsrjbxxVO> dsrjbxxVOs) {
		this.dsrjbxxVOs = dsrjbxxVOs;
	}

	public void setDsrrs(int dsrrs) {
		this.dsrrs = dsrrs;
	}

	public String getAh() {
		return ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}
}
