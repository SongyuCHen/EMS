package nju.software.ems.data.dao;

import java.util.Date;
import java.util.List;

import nju.software.ems.data.daoobject.SpryDO;
import nju.software.ems.data.daoobject.SpryDOId;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SpryDO entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.SpryDO
 * @author MyEclipse Persistence Tools
 */

public class SpryDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SpryDao.class);
	// property constants
	public static final String FG = "fg";
	public static final String SFCBR = "sfcbr";
	public static final String SFSPZ = "sfspz";
	public static final String SFDLSPY = "sfdlspy";
	public static final String SFRMPSY = "sfrmpsy";
	public static final String XM = "xm";
	public static final String GH = "gh";
	public static final String BGYY = "bgyy";
	public static final String BGFS = "bgfs";

	protected void initDao() {
		// do nothing
	}

	public void save(SpryDO transientInstance) {
		log.debug("saving SpryDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SpryDO persistentInstance) {
		log.debug("deleting SpryDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SpryDO findById(nju.software.ems.data.daoobject.SpryDOId id) {
		log.debug("getting SpryDO instance with id: " + id);
		try {
			SpryDO instance = (SpryDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.SpryDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<SpryDO> findByExample(SpryDO instance) {
		log.debug("finding SpryDO instance by example");
		try {
			List<SpryDO> results = (List<SpryDO>) getHibernateTemplate()
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
		log.debug("finding SpryDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SpryDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<SpryDO> findByFg(Object fg) {
		return findByProperty(FG, fg);
	}

	public List<SpryDO> findBySfcbr(Object sfcbr) {
		return findByProperty(SFCBR, sfcbr);
	}

	public List<SpryDO> findBySfspz(Object sfspz) {
		return findByProperty(SFSPZ, sfspz);
	}

	public List<SpryDO> findBySfdlspy(Object sfdlspy) {
		return findByProperty(SFDLSPY, sfdlspy);
	}

	public List<SpryDO> findBySfrmpsy(Object sfrmpsy) {
		return findByProperty(SFRMPSY, sfrmpsy);
	}

	public List<SpryDO> findByXm(Object xm) {
		return findByProperty(XM, xm);
	}

	public List<SpryDO> findByGh(Object gh) {
		return findByProperty(GH, gh);
	}

	public List<SpryDO> findByBgyy(Object bgyy) {
		return findByProperty(BGYY, bgyy);
	}

	public List<SpryDO> findByBgfs(Object bgfs) {
		return findByProperty(BGFS, bgfs);
	}

	public List findAll() {
		log.debug("finding all SpryDO instances");
		try {
			String queryString = "from SpryDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SpryDO merge(SpryDO detachedInstance) {
		log.debug("merging SpryDO instance");
		try {
			SpryDO result = (SpryDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SpryDO instance) {
		log.debug("attaching dirty SpryDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SpryDO instance) {
		log.debug("attaching clean SpryDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SpryDao getFromApplicationContext(ApplicationContext ctx) {
		return (SpryDao) ctx.getBean("SpryDODAO");
	}
}