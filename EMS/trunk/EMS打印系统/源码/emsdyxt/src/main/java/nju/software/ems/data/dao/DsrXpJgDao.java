package nju.software.ems.data.dao;

import java.util.List;

import nju.software.ems.data.daoobject.DsrDwDO;
import nju.software.ems.data.daoobject.DsrXpJgDO;
import nju.software.ems.data.daoobject.DsrXpJgDOId;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DsrXpJgDO entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.DsrXpJgDO
 * @author MyEclipse Persistence Tools
 */

public class DsrXpJgDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(DsrXpJgDao.class);
	// property constants
	public static final String JGMC = "jgmc";
	public static final String XZJGXZ = "xzjgxz";
	public static final String SFFY = "sffy";
	public static final String SFPC = "sfpc";
	public static final String DH = "dh";
	public static final String DZ = "dz";
	public static final String YB = "yb";
	public static final String FDDBRXM = "fddbrxm";
	public static final String DJZLB = "djzlb";
	public static final String DJZH = "djzh";

	protected void initDao() {
		// do nothing
	}

	public void save(DsrXpJgDO transientInstance) {
		log.debug("saving DsrXpJgDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DsrXpJgDO persistentInstance) {
		log.debug("deleting DsrXpJgDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DsrXpJgDO findById(nju.software.ems.data.daoobject.DsrXpJgDOId id) {
		log.debug("getting DsrXpJgDO instance with id: " + id);
		try {
			DsrXpJgDO instance = (DsrXpJgDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.DsrXpJgDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<DsrXpJgDO> findByExample(DsrXpJgDO instance) {
		log.debug("finding DsrXpJgDO instance by example");
		try {
			List<DsrXpJgDO> results = (List<DsrXpJgDO>) getHibernateTemplate()
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
		log.debug("finding DsrXpJgDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DsrXpJgDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<DsrXpJgDO> findByJgmc(Object jgmc) {
		return findByProperty(JGMC, jgmc);
	}

	public List<DsrXpJgDO> findByXzjgxz(Object xzjgxz) {
		return findByProperty(XZJGXZ, xzjgxz);
	}

	public List<DsrXpJgDO> findBySffy(Object sffy) {
		return findByProperty(SFFY, sffy);
	}

	public List<DsrXpJgDO> findBySfpc(Object sfpc) {
		return findByProperty(SFPC, sfpc);
	}

	public List<DsrXpJgDO> findByDh(Object dh) {
		return findByProperty(DH, dh);
	}

	public List<DsrXpJgDO> findByDz(Object dz) {
		return findByProperty(DZ, dz);
	}

	public List<DsrXpJgDO> findByYb(Object yb) {
		return findByProperty(YB, yb);
	}

	public List<DsrXpJgDO> findByFddbrxm(Object fddbrxm) {
		return findByProperty(FDDBRXM, fddbrxm);
	}

	public List<DsrXpJgDO> findByDjzlb(Object djzlb) {
		return findByProperty(DJZLB, djzlb);
	}

	public List<DsrXpJgDO> findByDjzh(Object djzh) {
		return findByProperty(DJZH, djzh);
	}

	public List findAll() {
		log.debug("finding all DsrXpJgDO instances");
		try {
			String queryString = "from DsrXpJgDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DsrXpJgDO merge(DsrXpJgDO detachedInstance) {
		log.debug("merging DsrXpJgDO instance");
		try {
			DsrXpJgDO result = (DsrXpJgDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DsrXpJgDO instance) {
		log.debug("attaching dirty DsrXpJgDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DsrXpJgDO instance) {
		log.debug("attaching clean DsrXpJgDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DsrXpJgDao getFromApplicationContext(ApplicationContext ctx) {
		return (DsrXpJgDao) ctx.getBean("DsrXpJgDODAO");
	}
	
	/**
	 * 根据ID获取当事人信息
	 * @param ajxh 案件序号
	 * @param dsrbh 当事人编号
	 * @return
	 */
	public DsrXpJgDO findById(int ajxh , int dsrbh)
	{
		String hql = "from DsrXpJgDO where ajxh = " + ajxh + " and dsrbh = " + dsrbh;
		try {
			List<DsrXpJgDO> dsrXpJgDOs = getHibernateTemplate().find(hql);
			return dsrXpJgDOs.size() > 0 ? dsrXpJgDOs.get(0) : null;
		} catch (RuntimeException re) {
			log.error("getDsrbyAjxh failed", re);
			throw re;
		}
	}
}