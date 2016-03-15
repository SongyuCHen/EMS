package nju.software.ems.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import nju.software.ems.data.dao.AjJbDao;
import nju.software.ems.data.dao.SqlResultDao;
import nju.software.ems.data.daoobject.AjJbDO;
import nju.software.ems.service.AjcxService;
import nju.software.ems.service.DmService;
import nju.software.ems.service.model.BaseCaseModel;
import nju.software.ems.service.model.CaseQueryModel;
import nju.software.ems.service.model.CaseResultModel;
import nju.software.ems.service.model.DmbModel;
import nju.software.ems.service.model.QueryModel;
import nju.software.ems.util.DateUtil;
import nju.software.ems.util.QueryUtil;
import nju.software.ems.util.StringUtil;

public class AjcxServiceImpl implements AjcxService {
	
	private SqlResultDao sqlResultDao;   //sql query
	private DmService dmService;         //代码Service
	private AjJbDao ajJbDao;

	public List<BaseCaseModel> getSearchResult(QueryModel vo) throws IllegalArgumentException, IllegalAccessException, SQLException {
		// TODO Auto-generated method stub
		CaseQueryModel model = new CaseQueryModel();
		model.setAjmc(vo.getAjmc());
		model.setAh(vo.getAh());
		model.setBmdm(vo.getBmdm());
		model.setCbr(vo.getCbrxm());
		model.setRqStart(vo.getRqStart());
		model.setRqEnd(vo.getRqEnd());
		
		CaseResultModel result = new CaseResultModel();
		String sql = QueryUtil.getCaseQuerySql(model, result);
		List<CaseResultModel> caseResultModels = sqlResultDao.getSqlResult(sql);
		List<DmbModel> sptList = dmService.getDmByLbbh("USR206-99");   //加快匹配速度
		Map<String, String> sptMap = new HashMap<String, String>();
		for (DmbModel dmbModel : sptList)
			sptMap.put(dmbModel.getDmbh(), dmbModel.getDmms());
		
		Map<Integer, BaseCaseModel> modelMap = new HashMap<Integer, BaseCaseModel>();
		for (CaseResultModel resultModel : caseResultModels) {
			resultModel.setJasj(DateUtil.format(DateUtil.parse(resultModel
					.getJasj(), DateUtil.webFormat), DateUtil.webFormat));
			resultModel.setLarq(DateUtil.format(DateUtil.parse(resultModel
					.getLarq(), DateUtil.webFormat), DateUtil.webFormat));
			if (resultModel.getSpt() != null)
				resultModel.setSpt(sptMap.get(resultModel.getSpt().trim()));
			Integer ajxh = resultModel.getAjxh();
			if (modelMap.containsKey(ajxh)) {
				BaseCaseModel bcm = modelMap.get(ajxh);
				if (StringUtil.equals(resultModel.getSfcbr(), "Y")) {
					bcm.setXm(resultModel.getXm());
				}
				if (StringUtil.equals(resultModel.getFg(), "0")) {
					bcm.setSjy(resultModel.getXm());
				}
			} else {
				BaseCaseModel bcm = new BaseCaseModel();
				bcm.setAh(resultModel.getAh());
				bcm.setAjxh(resultModel.getAjxh());
				bcm.setAjmc(resultModel.getAjmc());
				bcm.setBasptmc(resultModel.getSpt());
				if (StringUtil.equals(resultModel.getSfcbr(), "Y")) {
					bcm.setXm(resultModel.getXm());
				}

				if (StringUtil.equals(resultModel.getFg(), "0")) {
					bcm.setSjy(resultModel.getXm());
				}
				bcm.setLarq(DateUtil.parse(resultModel.getLarq(),
						DateUtil.webFormat));
				bcm.setJarq(DateUtil.parse(resultModel.getJasj(),
						DateUtil.webFormat));
				bcm.setSycx(resultModel.getSycx());
				bcm.setAjxz(resultModel.getAjxz());
				bcm.setSx(resultModel.getSx());
				bcm.setFjsx(resultModel.getFjsx());
				bcm.setGdbz(resultModel.getGdbz());
				bcm.setJafs(resultModel.getJafs());
				bcm.setSfxess(resultModel.getSfxess());
				bcm.setSpcx(resultModel.getSpcx());
				bcm.setAjzt(resultModel.getAjzt());
				bcm.setSfzscq(resultModel.getSfzscq());
				bcm.setAjsj(resultModel.getAjwsqk());
				modelMap.put(resultModel.getAjxh(), bcm);
			}
		}
		List<BaseCaseModel> models = new ArrayList<BaseCaseModel>();
		Set<Entry<Integer, BaseCaseModel>> sets = modelMap.entrySet();
		for (Entry<Integer, BaseCaseModel> entry : sets) {
			models.add(entry.getValue());
		}
		return models;
		
	}
	
	public BaseCaseModel getAjxxByAjxh(int ajxh) {
		// TODO Auto-generated method stub
		AjJbDO ajJbDO = ajJbDao.findByAjxh(ajxh);
		if (ajJbDO == null) 
			return null;
		return new BaseCaseModel(ajJbDO);
	}

	public void setSqlResultDao(SqlResultDao sqlResultDao) {
		this.sqlResultDao = sqlResultDao;
	}

	public void setDmService(DmService dmService) {
		this.dmService = dmService;
	}

	public void setAjJbDao(AjJbDao ajJbDao) {
		this.ajJbDao = ajJbDao;
	}

}
