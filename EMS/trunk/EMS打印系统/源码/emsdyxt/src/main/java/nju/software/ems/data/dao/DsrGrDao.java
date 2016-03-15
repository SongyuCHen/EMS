package nju.software.ems.data.dao;

import java.util.Date;
import java.util.List;

import nju.software.ems.data.daoobject.DsrGrDO;
import nju.software.ems.data.daoobject.DsrGrDOId;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DsrGrDO entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.DsrGrDO
 * @author MyEclipse Persistence Tools
 */

public class DsrGrDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DsrGrDao.class);
	// property constants
	public static final String XM = "xm";
	public static final String XB = "xb";
	public static final String MZ = "mz";
	public static final String JG = "jg";
	public static final String ZY = "zy";
	public static final String ZW = "zw";
	public static final String WHCD = "whcd";
	public static final String GZDW = "gzdw";
	public static final String ZZMM = "zzmm";
	public static final String JB = "jb";
	public static final String SF = "sf";
	public static final String HYQK = "hyqk";
	public static final String JTQK = "jtqk";
	public static final String JKQK = "jkqk";
	public static final String SSGJ = "ssgj";
	public static final String SFZHM = "sfzhm";
	public static final String YB = "yb";
	public static final String DH = "dh";
	public static final String DZ = "dz";
	public static final String QRJG = "qrjg";
	public static final String QRGC = "qrgc";
	public static final String ZZD = "zzd";
	public static final String ZWZY = "zwzy";
	public static final String ZJLB = "zjlb";

	protected void initDao() {
		// do nothing
	}

	public void save(DsrGrDO transientInstance) {
		log.debug("saving DsrGrDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DsrGrDO persistentInstance) {
		log.debug("deleting DsrGrDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DsrGrDO findById(nju.software.ems.data.daoobject.DsrGrDOId id) {
		log.debug("getting DsrGrDO instance with id: " + id);
		try {
			DsrGrDO instance = (DsrGrDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.DsrGrDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<DsrGrDO> findByExample(DsrGrDO instance) {
		log.debug("finding DsrGrDO instance by example");
		try {
			List<DsrGrDO> results = (List<DsrGrDO>) getHibernateTemplate()
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
		log.debug("finding DsrGrDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DsrGrDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<DsrGrDO> findByXm(Object xm) {
		return findByProperty(XM, xm);
	}

	public List<DsrGrDO> findByXb(Object xb) {
		return findByProperty(XB, xb);
	}

	public List<DsrGrDO> findByMz(Object mz) {
		return findByProperty(MZ, mz);
	}

	public List<DsrGrDO> findByJg(Object jg) {
		return findByProperty(JG, jg);
	}

	public List<DsrGrDO> findByZy(Object zy) {
		return findByProperty(ZY, zy);
	}

	public List<DsrGrDO> findByZw(Object zw) {
		return findByProperty(ZW, zw);
	}

	public List<DsrGrDO> findByWhcd(Object whcd) {
		return findByProperty(WHCD, whcd);
	}

	public List<DsrGrDO> findByGzdw(Object gzdw) {
		return findByProperty(GZDW, gzdw);
	}

	public List<DsrGrDO> findByZzmm(Object zzmm) {
		return findByProperty(ZZMM, zzmm);
	}

	public List<DsrGrDO> findByJb(Object jb) {
		return findByProperty(JB, jb);
	}

	public List<DsrGrDO> findBySf(Object sf) {
		return findByProperty(SF, sf);
	}

	public List<DsrGrDO> findByHyqk(Object hyqk) {
		return findByProperty(HYQK, hyqk);
	}

	public List<DsrGrDO> findByJtqk(Object jtqk) {
		return findByProperty(JTQK, jtqk);
	}

	public List<DsrGrDO> findByJkqk(Object jkqk) {
		return findByProperty(JKQK, jkqk);
	}

	public List<DsrGrDO> findBySsgj(Object ssgj) {
		return findByProperty(SSGJ, ssgj);
	}

	public List<DsrGrDO> findBySfzhm(Object sfzhm) {
		return findByProperty(SFZHM, sfzhm);
	}

	public List<DsrGrDO> findByYb(Object yb) {
		return findByProperty(YB, yb);
	}

	public List<DsrGrDO> findByDh(Object dh) {
		return findByProperty(DH, dh);
	}

	public List<DsrGrDO> findByDz(Object dz) {
		return findByProperty(DZ, dz);
	}

	public List<DsrGrDO> findByQrjg(Object qrjg) {
		return findByProperty(QRJG, qrjg);
	}

	public List<DsrGrDO> findByQrgc(Object qrgc) {
		return findByProperty(QRGC, qrgc);
	}

	public List<DsrGrDO> findByZzd(Object zzd) {
		return findByProperty(ZZD, zzd);
	}

	public List<DsrGrDO> findByZwzy(Object zwzy) {
		return findByProperty(ZWZY, zwzy);
	}

	public List<DsrGrDO> findByZjlb(Object zjlb) {
		return findByProperty(ZJLB, zjlb);
	}

	public List findAll() {
		log.debug("finding all DsrGrDO instances");
		try {
			String queryString = "from DsrGrDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DsrGrDO merge(DsrGrDO detachedInstance) {
		log.debug("merging DsrGrDO instance");
		try {
			DsrGrDO result = (DsrGrDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DsrGrDO instance) {
		log.debug("attaching dirty DsrGrDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DsrGrDO instance) {
		log.debug("attaching clean DsrGrDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DsrGrDao getFromApplicationContext(ApplicationContext ctx) {
		return (DsrGrDao) ctx.getBean("DsrGrDODAO");
	}
	
	
	/**
	 * 根据ID获取当事人信息
	 * @param ajxh 案件序号
	 * @param dsrbh 当事人编号
	 * @return
	 */
	public DsrGrDO findById(int ajxh , int dsrbh)
	{
		String hql = "from DsrGrDO where ajxh = " + ajxh + " and dsrbh = " + dsrbh;
		try {
			List<DsrGrDO> dsrGrDOs = getHibernateTemplate().find(hql);
			return dsrGrDOs.size() > 0 ? dsrGrDOs.get(0) : null;
		} catch (RuntimeException re) {
			log.error("getDsrbyAjxh failed", re);
			throw re;
		}
	}
}