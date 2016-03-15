package nju.software.ems.data.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nju.software.ems.data.daoobject.KdtdDO;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KdtdDO entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.KdtdDO
 * @author MyEclipse Persistence Tools
 */

public class KdtdDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(KdtdDao.class);
	// property constants
	public static final String AH = "ah";
	public static final String SJRXM = "sjrxm";
	public static final String YDDH = "yddh";
	public static final String ZZDH = "zzdh";
	public static final String BGDH = "bgdh";
	public static final String DWMC = "dwmc";
	public static final String SJRDZ = "sjrdz";
	public static final String YZBM = "yzbm";
	public static final String JJNR = "jjnr";
	public static final String JJRDH = "jjrdh";
	public static final String JJRXM = "jjrxm";
	public static final String KDDH = "kddh";
	public static final String SFDY = "sfdy";
	public static final String WSMC = "wsmc";

	protected void initDao() {
		// do nothing
	}

	public void save(KdtdDO transientInstance) {
		log.debug("saving KdtdDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdtdDO persistentInstance) {
		log.debug("deleting KdtdDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
		// 刷新Session
		getSession().flush();
	}

	public KdtdDO findById(java.lang.Integer id) {
		log.debug("getting KdtdDO instance with id: " + id);
		try {
			KdtdDO instance = (KdtdDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.KdtdDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<KdtdDO> findByExample(KdtdDO instance) {
		log.debug("finding KdtdDO instance by example");
		try {
			List<KdtdDO> results = (List<KdtdDO>) getHibernateTemplate()
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
		log.debug("finding KdtdDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KdtdDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<KdtdDO> findByAh(Object ah) {
		return findByProperty(AH, ah);
	}

	public List<KdtdDO> findBySjrxm(Object sjrxm) {
		return findByProperty(SJRXM, sjrxm);
	}

	public List<KdtdDO> findByYddh(Object yddh) {
		return findByProperty(YDDH, yddh);
	}

	public List<KdtdDO> findByZzdh(Object zzdh) {
		return findByProperty(ZZDH, zzdh);
	}

	public List<KdtdDO> findByBgdh(Object bgdh) {
		return findByProperty(BGDH, bgdh);
	}

	public List<KdtdDO> findByDwmc(Object dwmc) {
		return findByProperty(DWMC, dwmc);
	}

	public List<KdtdDO> findBySjrdz(Object sjrdz) {
		return findByProperty(SJRDZ, sjrdz);
	}

	public List<KdtdDO> findByYzbm(Object yzbm) {
		return findByProperty(YZBM, yzbm);
	}

	public List<KdtdDO> findByJjnr(Object jjnr) {
		return findByProperty(JJNR, jjnr);
	}

	public List<KdtdDO> findByJjrdh(Object jjrdh) {
		return findByProperty(JJRDH, jjrdh);
	}

	public List<KdtdDO> findByJjrxm(Object jjrxm) {
		return findByProperty(JJRXM, jjrxm);
	}

	public List<KdtdDO> findByKddh(Object kddh) {
		return findByProperty(KDDH, kddh);
	}

	public List<KdtdDO> findBySfdy(Object sfdy) {
		return findByProperty(SFDY, sfdy);
	}

	public List<KdtdDO> findByWsmc(Object wsmc) {
		return findByProperty(WSMC, wsmc);
	}

	public List findAll() {
		log.debug("finding all KdtdDO instances");
		try {
			String queryString = "from KdtdDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdtdDO merge(KdtdDO detachedInstance) {
		log.debug("merging KdtdDO instance");
		try {
			KdtdDO result = (KdtdDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdtdDO instance) {
		log.debug("attaching dirty KdtdDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdtdDO instance) {
		log.debug("attaching clean KdtdDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdtdDao getFromApplicationContext(ApplicationContext ctx) {
		return (KdtdDao) ctx.getBean("KdtdDODAO");
	}
	
	/**
	 * 获取未打印的快递信息
	 * @return
	 */
	public List<KdtdDO> getWdy() {
		String hql = "from KdtdDO where dyrq is null";
		List<KdtdDO> kdtdDOs = new ArrayList<KdtdDO>();
		kdtdDOs = getHibernateTemplate().find(hql);
		return kdtdDOs;
	}
	
	/**
	 * 获取已打印的快递信息
	 * @param d1
	 * @param d2
	 * @return
	 */
	public List<KdtdDO> getYdy(Date d1, Date d2) {
		String hql = "from KdtdDO where dyrq is not null and kddh ='' and dyrq>? and dyrq<? order by dyrq";
		List<KdtdDO> kdtdDOs = new ArrayList<KdtdDO>();
		kdtdDOs = getHibernateTemplate().find(hql, d1, d2);
		return kdtdDOs;
	}
	
	/**
	 * 获得所有的快递套打信息
	 * @return 快递套打信息列表
	 */
	public List<KdtdDO> getAllKdtdxx()
	{
		String hql = "from KdtdDO";
		
		List<KdtdDO> kdtdDOs = getHibernateTemplate().find(hql);
		if(log.isInfoEnabled())
			log.info("getCcbqByAjxh by sql: " + hql);
		return kdtdDOs;
	}
	
	/**
	 * 获得快递套打信息的最大的id编号
	 * @return 最大的id编号
	 */
	public int getMaxID()
	{
		String hql = "select max(kdid) from KdtdDO";
		
		Session s = this.getSession();
		Query query = s.createQuery(hql);

		int maxbh = 0;
		if (query.uniqueResult() != null)
			maxbh = (Integer) query.uniqueResult();
		
		//释放数据库连接！！！
		this.releaseSession(s);
		return maxbh;
	}

	public List<KdtdDO> getTdz(Date d1, Date d2) {
		String hql = "from KdtdDO where dyrq is not null and kddh is not null and kddh !='' and sdrq is null and dyrq>? and dyrq<? order by dyrq";
		List<KdtdDO> kdtdDOs = new ArrayList<KdtdDO>();
		kdtdDOs = getHibernateTemplate().find(hql, d1, d2);
		return kdtdDOs;
	}

	public List<KdtdDO> getYsd(Date d1, Date d2) {
		String hql = "from KdtdDO where dyrq is not null and sdrq is not null and kddh !='' and dyrq>? and dyrq<? order by dyrq";
		List<KdtdDO> kdtdDOs = new ArrayList<KdtdDO>();
		kdtdDOs = getHibernateTemplate().find(hql, d1, d2);
		return kdtdDOs;
	}

	/**
	 * @param qsrq
	 * @param jsrq
	 * @param ah2 
	 * @param sjr 
	 * @param czr 
	 * @return
	 */
	public List<KdtdDO> search(Date d1, Date d2, String czr, String sjr, String ah) {
		String hql = "from KdtdDO where scrq>? and scrq<? and jjrxm like '"+czr+"' and sjrxm like '"+sjr+"' and ah like '"+ah+"'  order by scrq";
		List<KdtdDO> kdtdDOs = new ArrayList<KdtdDO>();
		kdtdDOs = getHibernateTemplate().find(hql, d1, d2);
		return kdtdDOs;
	}
}