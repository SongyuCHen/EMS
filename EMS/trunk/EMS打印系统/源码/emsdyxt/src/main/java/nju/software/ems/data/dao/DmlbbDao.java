package nju.software.ems.data.dao;

import java.util.List;

import nju.software.ems.data.daoobject.DmlbbDO;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DmlbbDO entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.DmlbbDO
 * @author MyEclipse Persistence Tools
 */

public class DmlbbDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DmlbbDao.class);
	// property constants
	public static final String LBDL = "lbdl";
	public static final String LBXL = "lbxl";
	public static final String LBMS = "lbms";
	public static final String DMCD = "dmcd";
	public static final String BZ = "bz";

	protected void initDao() {
		// do nothing
	}

	public void save(DmlbbDO transientInstance) {
		log.debug("saving DmlbbDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DmlbbDO persistentInstance) {
		log.debug("deleting DmlbbDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DmlbbDO findById(java.lang.String id) {
		log.debug("getting DmlbbDO instance with id: " + id);
		try {
			DmlbbDO instance = (DmlbbDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.DmlbbDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<DmlbbDO> findByExample(DmlbbDO instance) {
		log.debug("finding DmlbbDO instance by example");
		try {
			List<DmlbbDO> results = (List<DmlbbDO>) getHibernateTemplate()
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
		log.debug("finding DmlbbDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DmlbbDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<DmlbbDO> findByLbdl(Object lbdl) {
		return findByProperty(LBDL, lbdl);
	}

	public List<DmlbbDO> findByLbxl(Object lbxl) {
		return findByProperty(LBXL, lbxl);
	}

	public List<DmlbbDO> findByLbms(Object lbms) {
		return findByProperty(LBMS, lbms);
	}

	public List<DmlbbDO> findByDmcd(Object dmcd) {
		return findByProperty(DMCD, dmcd);
	}

	public List<DmlbbDO> findByBz(Object bz) {
		return findByProperty(BZ, bz);
	}

	public List findAll() {
		log.debug("finding all DmlbbDO instances");
		try {
			String queryString = "from DmlbbDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DmlbbDO merge(DmlbbDO detachedInstance) {
		log.debug("merging DmlbbDO instance");
		try {
			DmlbbDO result = (DmlbbDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DmlbbDO instance) {
		log.debug("attaching dirty DmlbbDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DmlbbDO instance) {
		log.debug("attaching clean DmlbbDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DmlbbDao getFromApplicationContext(ApplicationContext ctx) {
		return (DmlbbDao) ctx.getBean("DmlbbDODAO");
	}
}