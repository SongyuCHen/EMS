package nju.software.ems.data.dao;

import java.util.Date;
import java.util.List;

import nju.software.ems.data.daoobject.XtglYhbDO;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * XtglYhbDO entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.XtglYhbDO
 * @author MyEclipse Persistence Tools
 */

public class XtglYhbDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XtglYhbDao.class);
	// property constants
	public static final String YHDM = "yhdm";
	public static final String YHMC = "yhmc";
	public static final String YHKL = "yhkl";
	public static final String YHBM = "yhbm";
	public static final String KLTS = "klts";
	public static final String KLDA = "klda";
	public static final String YHSF = "yhsf";
	public static final String QJYY = "qjyy";
	public static final String GRNZB = "grnzb";
	public static final String QTNZB = "qtnzb";
	public static final String FAZT = "fazt";
	public static final String FASL = "fasl";
	public static final String GRBAJS = "grbajs";
	public static final String RYPX = "rypx";
	public static final String PHONENUM = "phonenum";
	public static final String YHZT = "yhzt";
	public static final String FYBH = "fybh";

	protected void initDao() {
		// do nothing
	}

	public void save(XtglYhbDO transientInstance) {
		log.debug("saving XtglYhbDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(XtglYhbDO persistentInstance) {
		log.debug("deleting XtglYhbDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public XtglYhbDO findById(java.lang.Integer id) {
		log.debug("getting XtglYhbDO instance with id: " + id);
		try {
			XtglYhbDO instance = (XtglYhbDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.XtglYhbDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<XtglYhbDO> findByExample(XtglYhbDO instance) {
		log.debug("finding XtglYhbDO instance by example");
		try {
			List<XtglYhbDO> results = (List<XtglYhbDO>) getHibernateTemplate()
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
		log.debug("finding XtglYhbDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from XtglYhbDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<XtglYhbDO> findByYhdm(Object yhdm) {
		return findByProperty(YHDM, yhdm);
	}

	public List<XtglYhbDO> findByYhmc(Object yhmc) {
		return findByProperty(YHMC, yhmc);
	}

	public List<XtglYhbDO> findByYhkl(Object yhkl) {
		return findByProperty(YHKL, yhkl);
	}

	public List<XtglYhbDO> findByYhbm(Object yhbm) {
		return findByProperty(YHBM, yhbm);
	}

	public List<XtglYhbDO> findByKlts(Object klts) {
		return findByProperty(KLTS, klts);
	}

	public List<XtglYhbDO> findByKlda(Object klda) {
		return findByProperty(KLDA, klda);
	}

	public List<XtglYhbDO> findByYhsf(Object yhsf) {
		return findByProperty(YHSF, yhsf);
	}

	public List<XtglYhbDO> findByQjyy(Object qjyy) {
		return findByProperty(QJYY, qjyy);
	}

	public List<XtglYhbDO> findByGrnzb(Object grnzb) {
		return findByProperty(GRNZB, grnzb);
	}

	public List<XtglYhbDO> findByQtnzb(Object qtnzb) {
		return findByProperty(QTNZB, qtnzb);
	}

	public List<XtglYhbDO> findByFazt(Object fazt) {
		return findByProperty(FAZT, fazt);
	}

	public List<XtglYhbDO> findByFasl(Object fasl) {
		return findByProperty(FASL, fasl);
	}

	public List<XtglYhbDO> findByGrbajs(Object grbajs) {
		return findByProperty(GRBAJS, grbajs);
	}

	public List<XtglYhbDO> findByRypx(Object rypx) {
		return findByProperty(RYPX, rypx);
	}

	public List<XtglYhbDO> findByPhonenum(Object phonenum) {
		return findByProperty(PHONENUM, phonenum);
	}

	public List<XtglYhbDO> findByYhzt(Object yhzt) {
		return findByProperty(YHZT, yhzt);
	}

	public List<XtglYhbDO> findByFybh(Object fybh) {
		return findByProperty(FYBH, fybh);
	}

	public List findAll() {
		log.debug("finding all XtglYhbDO instances");
		try {
			String queryString = "from XtglYhbDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public XtglYhbDO merge(XtglYhbDO detachedInstance) {
		log.debug("merging XtglYhbDO instance");
		try {
			XtglYhbDO result = (XtglYhbDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(XtglYhbDO instance) {
		log.debug("attaching dirty XtglYhbDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(XtglYhbDO instance) {
		log.debug("attaching clean XtglYhbDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XtglYhbDao getFromApplicationContext(ApplicationContext ctx) {
		return (XtglYhbDao) ctx.getBean("XtglYhbDODAO");
	}
}