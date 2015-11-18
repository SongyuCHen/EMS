package nju.software.appraisal.data.DAO;

import java.util.ArrayList;
import java.util.List;

import nju.software.appraisal.data.dataobject.PubSpry;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PubSpry entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.dzda.data.dataobject.PubSpry
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings(value={"unchecked","rawtypes"})
public class PubSpryDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(PubSpryDAO.class);
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

	public void save(PubSpry transientInstance) {
		log.debug("saving PubSpry instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PubSpry persistentInstance) {
		log.debug("deleting PubSpry instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PubSpry findById(nju.software.appraisal.data.dataobject.PubSpryId id) {
		log.debug("getting PubSpry instance with id: " + id);
		try {
			PubSpry instance = (PubSpry) getHibernateTemplate().get(
					"nju.software.dzda.data.dataobject.PubSpry", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<PubSpry> findByExample(PubSpry instance) {
		log.debug("finding PubSpry instance by example");
		try {
			List<PubSpry> results = (List<PubSpry>) getHibernateTemplate()
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
		log.debug("finding PubSpry instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PubSpry as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<PubSpry> findByFg(Object fg) {
		return findByProperty(FG, fg);
	}

	public List<PubSpry> findBySfcbr(Object sfcbr) {
		return findByProperty(SFCBR, sfcbr);
	}

	public List<PubSpry> findBySfspz(Object sfspz) {
		return findByProperty(SFSPZ, sfspz);
	}

	public List<PubSpry> findBySfdlspy(Object sfdlspy) {
		return findByProperty(SFDLSPY, sfdlspy);
	}

	public List<PubSpry> findBySfrmpsy(Object sfrmpsy) {
		return findByProperty(SFRMPSY, sfrmpsy);
	}

	public List<PubSpry> findByXm(Object xm) {
		return findByProperty(XM, xm);
	}

	public List<PubSpry> findByGh(Object gh) {
		return findByProperty(GH, gh);
	}

	public List<PubSpry> findByBgyy(Object bgyy) {
		return findByProperty(BGYY, bgyy);
	}

	public List<PubSpry> findByBgfs(Object bgfs) {
		return findByProperty(BGFS, bgfs);
	}

	public List findAll() {
		log.debug("finding all PubSpry instances");
		try {
			String queryString = "from PubSpry";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PubSpry merge(PubSpry detachedInstance) {
		log.debug("merging PubSpry instance");
		try {
			PubSpry result = (PubSpry) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PubSpry instance) {
		log.debug("attaching dirty PubSpry instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PubSpry instance) {
		log.debug("attaching clean PubSpry instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PubSpryDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PubSpryDAO) ctx.getBean("PubSpryDAO");
	}
	public PubSpry getAjjbByAjxh(int ajxh) {
		log.debug("getAjjbByAjxh with ajxh:"+ajxh);
		String hql = "from PubSpry where 	AJXH=?";
		List<PubSpry> PubSpryList = (List<PubSpry>)getHibernateTemplate().find(hql, ajxh);
		if (PubSpryList == null || PubSpryList.size() == 0) {
			return null;
		} else {
			PubSpry pubSpry = PubSpryList.get(0);
			return pubSpry;
		}
	}
	/**
	 * 通过案件序号列表获取承办人列表
	 * @param ajxhList
	 * @return
	 */
	public List<PubSpry> getCbrListByAjList(List<Integer> ajxhList){
		log.debug("getCbrListByAjList");
		String sql="from PubSpry where sfcbr='Y' and ajxh in(";
		for(int ajxh:ajxhList){
			sql+=ajxh+",";
		}
		sql=sql.substring(0,sql.length()-1);
		sql+=")";
		List<PubSpry> result=(List<PubSpry>)getHibernateTemplate().find(sql);
		return result==null?new ArrayList<PubSpry>():result;
	}
	
	/**
	 * 获取案件相关的所有审判人员
	 * @param ajxh
	 * @return
	 */
	public List<PubSpry> getAllSpryByAjxh(Integer ajxh){
		log.debug("getAllSpryByAjxh with ajxh:"+ajxh);
		String hql="from PubSpry where ajxh = "+ajxh;
		List<PubSpry> result=(List<PubSpry>)getHibernateTemplate().find(hql);
		return result==null?new ArrayList<PubSpry>():result;
	}
}