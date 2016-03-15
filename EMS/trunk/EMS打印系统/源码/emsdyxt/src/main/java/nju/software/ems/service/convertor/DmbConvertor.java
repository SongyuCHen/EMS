package nju.software.ems.service.convertor;

import java.util.ArrayList;
import java.util.List;

import nju.software.ems.data.daoobject.DmbDO;
import nju.software.ems.data.daoobject.DmlbbDO;
import nju.software.ems.service.model.BmModel;
import nju.software.ems.service.model.DmbModel;
import nju.software.ems.service.model.DmlbModel;
import nju.software.ems.service.model.FyModel;
import nju.software.ems.util.StringUtil;

public class DmbConvertor {
	public static List<DmbModel> dmsToModels(List<DmbDO> dms){
		List<DmbModel> dmModels = new ArrayList<DmbModel>();
		for(DmbDO src:dms){
			DmbModel des = new DmbModel();
			des = copyDmbDOAttr(src);
			dmModels.add(des);
		}
		return dmModels;
	}
	public static List<DmlbModel> dmlbsToModels(List<DmlbbDO> dmlbs){
		List<DmlbModel> dmlbModels = new ArrayList<DmlbModel>();
		for(DmlbbDO src : dmlbs){
			DmlbModel des = new DmlbModel();
			des = copyDmlbbDOAttr(src);
			dmlbModels.add(des);
		}
		return dmlbModels;
	}
	public static List<BmModel> bmsToModels(List<DmbDO> bmdms)
	{
		List<BmModel> bmdmModels = new ArrayList<BmModel>();
		for (DmbDO src : bmdms) {
			BmModel des = new BmModel();
			des = copyBmdmbDOAttr(src);
			bmdmModels.add(des);
		}
		return bmdmModels;
	}
	
	public static BmModel bmToModel(DmbDO src)
	{
		BmModel des = new BmModel();
		des = copyBmdmbDOAttr(src);
		return des;
	}
	public static DmbDO modelToBmdm(BmModel src)
	{
		DmbDO des = new DmbDO();
		des = copybmdmbModeAttr(src);
		return des;
	}
	public static DmbModel dmToModel(DmbDO src){
		DmbModel des = new DmbModel();
		des = copyDmbDOAttr(src);
		return des;
	}
	public static DmbDO modelToDmb(DmbModel src){
		DmbDO des = new DmbDO();
		des = copyDmbModelAttr(src);
		return des;
	}
	public static DmlbModel dmlbToModel(DmlbbDO src){
		DmlbModel des = new DmlbModel();
		des = copyDmlbbDOAttr(src);
		return des;
	}
	public static DmlbbDO modelToDmlbb(DmlbModel src){
		DmlbbDO des = new DmlbbDO();
		des = copyDmlbbModelAttr(src);
		return des;
	}
		
	private static DmbModel copyDmbDOAttr(DmbDO dmb) {
		DmbModel dmModel = new DmbModel();
		
		dmModel.setBz(dmb.getBz());
		dmModel.setDmbh(dmb.getDmbh());
		dmModel.setDmms(dmb.getDmms());
		dmModel.setFybh(dmb.getFybh() == null ? -1 : dmb.getFybh());
		dmModel.setLbbh(dmb.getLbbh());
		dmModel.setXgdm(dmb.getXgdm());
		dmModel.setXgsj(dmb.getXgsj());
		dmModel.setXssx((Double)dmb.getXssx() == null ? 0 : dmb.getXssx());
		
		return dmModel;
	}
	private static DmbDO copyDmbModelAttr(DmbModel dmModel) {
		DmbDO dmb = new DmbDO();
		
		dmb.setBz(dmModel.getBz());
		dmb.setDmbh(dmModel.getDmbh());
		dmb.setDmms(dmModel.getDmms());
		dmb.setFybh(dmb.getFybh() == null ? -1 : dmb.getFybh());
		dmb.setLbbh(dmModel.getLbbh());
		dmb.setXgdm(dmModel.getXgdm());
		dmb.setXgsj(dmModel.getXgsj());
		dmb.setXssx((Double)dmb.getXssx() == null ? 0 : dmb.getXssx());		
		return dmb;
	}
	private static DmlbModel copyDmlbbDOAttr(DmlbbDO dmlbb) {
		DmlbModel dmlbModel = new DmlbModel();
		
		dmlbModel.setBz(dmlbb.getBz());
		dmlbModel.setDmcd(dmlbb.getDmcd());
		dmlbModel.setLbdl(dmlbb.getLbdl());
		dmlbModel.setLbbh(dmlbb.getLbbh());
		dmlbModel.setLbms(dmlbb.getLbms());
		dmlbModel.setLbxl(dmlbb.getLbxl());
		
		return dmlbModel;
	}
	private static DmlbbDO copyDmlbbModelAttr(DmlbModel dmlbModel) {
		DmlbbDO dmlb = new DmlbbDO();
		
		dmlb.setBz(dmlbModel.getBz());
		dmlb.setDmcd(dmlbModel.getDmcd());
		dmlb.setLbdl(dmlbModel.getLbdl());
		dmlb.setLbbh(dmlbModel.getLbbh());
		dmlb.setLbms(dmlbModel.getLbms());
		dmlb.setLbxl(dmlbModel.getLbxl());
		
		return dmlb;
	}
	
	private static BmModel copyBmdmbDOAttr(DmbDO bmDmb)
	{
		BmModel bmModel = new BmModel();
		bmModel.setBmmc(bmDmb.getDmms());
		bmModel.setFybh(bmDmb.getFybh() == null ? -1 : bmDmb.getFybh());
		bmModel.setBmbh(bmDmb.getDmbh());
		bmModel.setSpbm(StringUtil.equals(bmDmb.getBz(), "审判"));
		return bmModel;
	}
	private static DmbDO copybmdmbModeAttr(BmModel bmModel)
	{
		DmbDO bmdmb = new DmbDO();
		bmdmb.setLbbh("USR206-99");
		bmdmb.setDmms(bmModel.getBmmc());
		bmdmb.setFybh((int)bmModel.getFybh());
		bmdmb.setDmbh(bmModel.getBmbh());
		bmdmb.setBz(bmModel.getSpbm() ? "审判" : null);
		return bmdmb;
	}
	
	/**
	 * 将代码表中的法院信息转成法院model
	 * @param dmbDO
	 * @return
	 */
	public static FyModel dmbDoToFyModel(DmbDO dmbDO)
	{
		FyModel fyModel = new FyModel();
		if(dmbDO == null)
			return fyModel;
		fyModel.setFyyb(dmbDO.getBz());
		String fymc = dmbDO.getDmms();
		fyModel.setDataBaseFymc(fymc);
		int endIndex = fymc.indexOf(":");
		if(endIndex < 0)
			fyModel.setFymc(fymc);
		else
			fyModel.setFymc(fymc.substring(0, endIndex));
		return fyModel;
	}
}
