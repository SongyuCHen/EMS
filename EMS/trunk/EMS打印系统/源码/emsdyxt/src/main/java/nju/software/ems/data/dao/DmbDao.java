package nju.software.ems.data.dao;

import java.util.ArrayList;
import java.util.List;

import nju.software.ems.data.daoobject.DmbDO;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for DmbDO
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.DmbDO
 * @author MyEclipse Persistence Tools
 */

public class DmbDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DmbDao.class);
	// property constants
	public static final String DMMS = "dmms";
	public static final String XGDM = "xgdm";
	public static final String BZ = "bz";
	public static final String MODFLAG = "modflag";
	public static final String TRANSFLAG = "transflag";
	public static final String XSSX = "xssx";
	public static final String FYBH = "fybh";

	protected void initDao() {
		// do nothing
	}

	public void save(DmbDO transientInstance) {
		log.debug("saving DmbDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DmbDO persistentInstance) {
		log.debug("deleting DmbDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DmbDO findById(nju.software.ems.data.daoobject.DmbDOId id) {
		log.debug("getting DmbDO instance with id: " + id);
		try {
			DmbDO instance = (DmbDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.DmbDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<DmbDO> findByExample(DmbDO instance) {
		log.debug("finding DmbDO instance by example");
		try {
			List<DmbDO> results = (List<DmbDO>) getHibernateTemplate()
					.findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding DmbDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DmbDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<DmbDO> findByDmms(Object dmms) {
		return findByProperty(DMMS, dmms);
	}

	public List<DmbDO> findByXgdm(Object xgdm) {
		return findByProperty(XGDM, xgdm);
	}

	public List<DmbDO> findByBz(Object bz) {
		return findByProperty(BZ, bz);
	}

	public List<DmbDO> findByModflag(Object modflag) {
		return findByProperty(MODFLAG, modflag);
	}

	public List<DmbDO> findByTransflag(Object transflag) {
		return findByProperty(TRANSFLAG, transflag);
	}

	public List<DmbDO> findByXssx(Object xssx) {
		return findByProperty(XSSX, xssx);
	}

	public List<DmbDO> findByFybh(Object fybh) {
		return findByProperty(FYBH, fybh);
	}

	public List findAll() {
		log.debug("finding all DmbDO instances");
		try {
			String queryString = "from DmbDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DmbDO merge(DmbDO detachedInstance) {
		log.debug("merging DmbDO instance");
		try {
			DmbDO result = (DmbDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DmbDO instance) {
		log.debug("attaching dirty DmbDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DmbDO instance) {
		log.debug("attaching clean DmbDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DmbDao getFromApplicationContext(ApplicationContext ctx) {
		return (DmbDao) ctx.getBean("DmbDODAO");
	}
	
	/**
	 * 根据类别编号和代码编号获取代码描述
	 * @param lbbh
	 * @param dmbh
	 * @return
	 */
	public String getDmms(String lbbh,String dmbh){
		log.debug("getDmms with lbbh:"+lbbh+", dmbh:"+dmbh);
		String hql="from DmbDO where lbbh=? and dmbh=?";
		List<DmbDO> result=getHibernateTemplate().find(hql, lbbh,dmbh);
		if(result==null || result.isEmpty())
			return "";
		else
			return result.get(0).getDmms();
	}
	
	/**
	 * 获取当前法院的部门
	 * @return 部门列表
	 */
	public List<DmbDO> getFybm() {
		String hql = "from DmbDO where lbbh = 'USR206-99'";  // and bz = '审判'
		List<DmbDO> dmb = getHibernateTemplate().find(hql);
		if (dmb == null) {
			dmb = new ArrayList<DmbDO>();
		}
		if (log.isInfoEnabled()) {
			log.info("getDm by sql: " + hql);
		}
		return dmb;
	}
	
	public List<DmbDO> findByLbbh(String lbbh)
	{
		String hql="from DmbDO where lbbh=?";
		try {
			return getHibernateTemplate().find(hql, lbbh);
		} catch (RuntimeException re) {
			log.error("find failed", re);
			throw re;
		}
	}
	
	/**
	 * 根据ID得到DMB对象
	 * @param lbbh 类别编号
	 * @param dmbh  代码编号
	 * @return 查询得到的代码表对象
	 */
	public DmbDO findById(String lbbh, String dmbh) {
		log.debug("finding all fy inofmation from DmbDO instances");
		try {
			String queryString = "from DmbDO where lbbh='" + lbbh + "' and dmbh='" + dmbh + "'";
			List<DmbDO> tempData = getHibernateTemplate().find(queryString);
			return tempData.isEmpty() ? null : tempData.get(0);
		} catch (RuntimeException re) {
			log.error("find failed", re);
			throw re;
		}
	}
}