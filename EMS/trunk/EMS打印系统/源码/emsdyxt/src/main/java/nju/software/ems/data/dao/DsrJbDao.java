package nju.software.ems.data.dao;

import java.util.Date;
import java.util.List;

import nju.software.ems.data.daoobject.DsrJbDO;
import nju.software.ems.data.daoobject.DsrJbDOId;
import nju.software.ems.data.daoobject.DsrXpJgDO;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DsrJbDO entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.DsrJbDO
 * @author MyEclipse Persistence Tools
 */

public class DsrJbDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DsrJbDao.class);
	// property constants
	public static final String DSRSSDW = "dsrssdw";
	public static final String DSRLB = "dsrlb";
	public static final String DSRJC = "dsrjc";
	public static final String SFSSDBR = "sfssdbr";
	public static final String DSRBGFS = "dsrbgfs";
	public static final String DSRBGYY = "dsrbgyy";
	public static final String SFSA = "sfsa";
	public static final String SFSG = "sfsg";
	public static final String SFSQ = "sfsq";
	public static final String SFST = "sfst";
	public static final String SFSW = "sfsw";
	public static final String QQPCJE = "qqpcje";
	public static final String SCBC = "scbc";
	public static final String HPJE = "hpje";

	protected void initDao() {
		// do nothing
	}

	public void save(DsrJbDO transientInstance) {
		log.debug("saving DsrJbDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DsrJbDO persistentInstance) {
		log.debug("deleting DsrJbDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DsrJbDO findById(nju.software.ems.data.daoobject.DsrJbDOId id) {
		log.debug("getting DsrJbDO instance with id: " + id);
		try {
			DsrJbDO instance = (DsrJbDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.DsrJbDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<DsrJbDO> findByExample(DsrJbDO instance) {
		log.debug("finding DsrJbDO instance by example");
		try {
			List<DsrJbDO> results = (List<DsrJbDO>) getHibernateTemplate()
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
		log.debug("finding DsrJbDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DsrJbDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<DsrJbDO> findByDsrssdw(Object dsrssdw) {
		return findByProperty(DSRSSDW, dsrssdw);
	}

	public List<DsrJbDO> findByDsrlb(Object dsrlb) {
		return findByProperty(DSRLB, dsrlb);
	}

	public List<DsrJbDO> findByDsrjc(Object dsrjc) {
		return findByProperty(DSRJC, dsrjc);
	}

	public List<DsrJbDO> findBySfssdbr(Object sfssdbr) {
		return findByProperty(SFSSDBR, sfssdbr);
	}

	public List<DsrJbDO> findByDsrbgfs(Object dsrbgfs) {
		return findByProperty(DSRBGFS, dsrbgfs);
	}

	public List<DsrJbDO> findByDsrbgyy(Object dsrbgyy) {
		return findByProperty(DSRBGYY, dsrbgyy);
	}

	public List<DsrJbDO> findBySfsa(Object sfsa) {
		return findByProperty(SFSA, sfsa);
	}

	public List<DsrJbDO> findBySfsg(Object sfsg) {
		return findByProperty(SFSG, sfsg);
	}

	public List<DsrJbDO> findBySfsq(Object sfsq) {
		return findByProperty(SFSQ, sfsq);
	}

	public List<DsrJbDO> findBySfst(Object sfst) {
		return findByProperty(SFST, sfst);
	}

	public List<DsrJbDO> findBySfsw(Object sfsw) {
		return findByProperty(SFSW, sfsw);
	}

	public List<DsrJbDO> findByQqpcje(Object qqpcje) {
		return findByProperty(QQPCJE, qqpcje);
	}

	public List<DsrJbDO> findByScbc(Object scbc) {
		return findByProperty(SCBC, scbc);
	}

	public List<DsrJbDO> findByHpje(Object hpje) {
		return findByProperty(HPJE, hpje);
	}

	public List findAll() {
		log.debug("finding all DsrJbDO instances");
		try {
			String queryString = "from DsrJbDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DsrJbDO merge(DsrJbDO detachedInstance) {
		log.debug("merging DsrJbDO instance");
		try {
			DsrJbDO result = (DsrJbDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DsrJbDO instance) {
		log.debug("attaching dirty DsrJbDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DsrJbDO instance) {
		log.debug("attaching clean DsrJbDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DsrJbDao getFromApplicationContext(ApplicationContext ctx) {
		return (DsrJbDao) ctx.getBean("DsrJbDODAO");
	}
	
	/**
	 * 根据案件序号获得关于该案件的所有当事人
	 * @param ajxh 案件序号
	 * @return 所有当事人列表
	 */
	public List<DsrJbDO> getDsrByAjxh(int ajxh)
	{
		String hql = "from DsrJbDO where ajxh = " + ajxh + " ORDER BY dsrssdw, dsrbh";
		try {
			log.debug("getDsrbyAjxh successful");
			return getHibernateTemplate().find(hql);
		} catch (RuntimeException re) {
			log.error("getDsrbyAjxh failed", re);
			throw re;
		}
	}
	
	/**
	 * 根据ID获取当事人信息
	 * @param ajxh 案件序号
	 * @param dsrbh 当事人编号
	 * @return
	 */
	public DsrJbDO findById(int ajxh , int dsrbh)
	{
		String hql = "from DsrJbDO where ajxh = " + ajxh + " and dsrbh = " + dsrbh;
		try {
			List<DsrJbDO> dsrJbDOs = getHibernateTemplate().find(hql);
			return dsrJbDOs.size() > 0 ? dsrJbDOs.get(0) : null;
		} catch (RuntimeException re) {
			log.error("getDsrbyAjxh failed", re);
			throw re;
		}
	}
}