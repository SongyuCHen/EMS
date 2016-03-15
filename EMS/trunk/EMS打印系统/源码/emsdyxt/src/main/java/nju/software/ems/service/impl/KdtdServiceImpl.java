/**
 * 
 */
package nju.software.ems.service.impl;

import java.util.Date;
import java.util.List;

import nju.software.ems.data.dao.KdtdDao;
import nju.software.ems.data.daoobject.KdtdDO;
import nju.software.ems.service.KdtdService;
import nju.software.ems.service.convertor.KdtdConvertor;
import nju.software.ems.service.model.KdModel;

/**
 * @author 徐鑫源 xxy
 *
 * 2015-1-21 上午10:46:32 Admin
 */
public class KdtdServiceImpl implements KdtdService {
	KdtdDao kdtdDao;
	
	/* (non-Javadoc)
	 * @see nju.software.ems.service.kdtdService#getWdy()
	 */
	public List<KdModel> getWdy() {
		// TODO Auto-generated method stub
		List<KdtdDO> kdDOs = kdtdDao.getWdy();
		return KdtdConvertor.doToModel(kdDOs);
	}
	

	/* (non-Javadoc)
	 * @see nju.software.ems.service.KdtdService#getKdtd(int)
	 */
	public KdModel getKdtd(int kdid) {
		KdtdDO kdDO = kdtdDao.findById(kdid);
		return KdtdConvertor.doToModel(kdDO);
	}

	/* (non-Javadoc)
	 * @see nju.software.ems.service.kdtdService#getYdy(java.util.Date, java.util.Date)
	 */
	public List<KdModel> getYdy(Date scrqFormer, Date scrqLatter) {
		List<KdtdDO> kdDOs = kdtdDao.getYdy(scrqFormer, scrqLatter);
		return KdtdConvertor.doToModel(kdDOs);
	}

	/* (non-Javadoc)
	 * @see nju.software.ems.service.kdtdService#saveKdtd(nju.software.ems.service.model.KdModel)
	 */
	public boolean saveKdtd(KdModel kd) {
		if(kd.getKdid()>0) {	// 快递信息已有，保存快递单号
			KdtdDO kdtdDO = kdtdDao.findById(kd.getKdid());
			if(null==kdtdDO) {
				return false;
			}
			kd.setKdid(kdtdDO.getKdid());
			kdtdDO.setAh(kd.getAh());
			kdtdDO.setBgdh(kd.getBgdh());
			kdtdDO.setDwmc(kd.getDwmc());
			kdtdDO.setJjnr(kd.getJjnr());
			kdtdDO.setJjrdh(kd.getJjrdh());
			kdtdDO.setJjrxm(kd.getJjrxm());
			kdtdDO.setKddh(kd.getKddh());
			kdtdDO.setSjrdz(kd.getSjrdz());
			kdtdDO.setSjrxm(kd.getSjrxm());
			kdtdDO.setWsmc(kd.getWsmc());
			kdtdDO.setYddh(kd.getYddh());
			kdtdDO.setYzbm(kd.getYzbm());
			kdtdDO.setZzdh(kd.getZzdh());
			kdtdDO.setKdhz(kd.getKdhz());
			try {
				kdtdDao.merge(kdtdDO);
			} catch (Exception e) {
				return false;
			}
		} else {	// 保存新的快递信息
			int maxid = kdtdDao.getMaxID();
			KdtdDO kdtdDO = KdtdConvertor.modelToDO(kd);
			kdtdDO.setKdid(maxid+1);
			try {
				kdtdDao.save(kdtdDO);
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see nju.software.ems.service.kdtdService#printKd(int)
	 */
	public boolean printKd(int kdid) {
		KdtdDO kdtdDO = kdtdDao.findById(kdid);
		if(null==kdtdDO) {
			return false;
		}
		kdtdDO.setDyrq(new Date());
		try {
			kdtdDao.merge(kdtdDO);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see nju.software.ems.service.kdtdService#recievedKdByEms(java.lang.String)
	 */
	public boolean recievedKdByEms(String kddh) {
		List<KdtdDO> kdtdDOs = kdtdDao.findByKddh(kddh);
		if(null!=kdtdDOs && kdtdDOs.size()==1) {
			KdtdDO kdtdDO = kdtdDOs.get(0);
			kdtdDO.setSdrq(new Date());
			kdtdDao.merge(kdtdDO);
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see nju.software.ems.service.kdtdService#recievedKdByKdid(int)
	 */
	public boolean recievedKdByKdid(int kdid) {
		KdtdDO kdtdDO = kdtdDao.findById(kdid);
		if(null==kdtdDO) {
			return false;
		}
		kdtdDO.setSdrq(new Date());
		try {
			kdtdDao.merge(kdtdDO);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see nju.software.ems.service.KdtdService#deleteKdByKdid(int)
	 */
	public boolean deleteKdByKdid(int kdid) {
		KdtdDO kdtdDO = kdtdDao.findById(kdid);
		if(null==kdtdDO) {
			return false;
		}
		try {
			kdtdDao.delete(kdtdDO);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public KdtdDao getKdtdDao() {
		return kdtdDao;
	}

	public void setKdtdDao(KdtdDao kdtdDao) {
		this.kdtdDao = kdtdDao;
	}

	public List<KdModel> getTdz(Date qsrq, Date jsrq) {
		List<KdtdDO> kdDOs = kdtdDao.getTdz(qsrq, jsrq);
		return KdtdConvertor.doToModel(kdDOs);
	}

	public List<KdModel> getYsd(Date qsrq, Date jsrq) {
		List<KdtdDO> kdDOs = kdtdDao.getYsd(qsrq, jsrq);
		return KdtdConvertor.doToModel(kdDOs);
	}

	public List<KdModel> search(Date qsrq, Date jsrq, String czr, String ah,
			String sjr) {
		List<KdtdDO> kdDOs = kdtdDao.search(qsrq, jsrq, czr, sjr, ah);
		return KdtdConvertor.doToModel(kdDOs);
	}

}
