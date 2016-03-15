package nju.software.ems.data.dao;

import java.util.Date;
import java.util.List;

import nju.software.ems.data.daoobject.DsrDwDO;
import nju.software.ems.data.daoobject.DsrDwDOId;
import nju.software.ems.data.daoobject.DsrGrDO;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for DsrDwDO entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see nju.software.ems.data.daoobject.DsrDwDO
  * @author MyEclipse Persistence Tools 
 */

public class DsrDwDao extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(DsrDwDao.class);
		//property constants
	public static final String DWMC = "dwmc";
	public static final String DZ = "dz";
	public static final String DH = "dh";
	public static final String YB = "yb";
	public static final String FRXZ = "frxz";
	public static final String GYQYGM = "gyqygm";
	public static final String FDDBRXM = "fddbrxm";
	public static final String FDDBRXB = "fddbrxb";
	public static final String WHCD = "whcd";
	public static final String ZZMM = "zzmm";
	public static final String JB = "jb";
	public static final String ZW = "zw";
	public static final String LXDH = "lxdh";
	public static final String DBRZW = "dbrzw";
	public static final String DJZLB = "djzlb";
	public static final String DJZH = "djzh";



	protected void initDao() {
		//do nothing
	}
    
    public void save(DsrDwDO transientInstance) {
        log.debug("saving DsrDwDO instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(DsrDwDO persistentInstance) {
        log.debug("deleting DsrDwDO instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public DsrDwDO findById( nju.software.ems.data.daoobject.DsrDwDOId id) {
        log.debug("getting DsrDwDO instance with id: " + id);
        try {
            DsrDwDO instance = (DsrDwDO) getHibernateTemplate()
                    .get("nju.software.ems.data.daoobject.DsrDwDO", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<DsrDwDO> findByExample(DsrDwDO instance) {
        log.debug("finding DsrDwDO instance by example");
        try {
            List<DsrDwDO> results = (List<DsrDwDO>) getHibernateTemplate().findByExample(instance); 
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding DsrDwDO instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from DsrDwDO as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List<DsrDwDO> findByDwmc(Object dwmc
	) {
		return findByProperty(DWMC, dwmc
		);
	}
	
	public List<DsrDwDO> findByDz(Object dz
	) {
		return findByProperty(DZ, dz
		);
	}
	
	public List<DsrDwDO> findByDh(Object dh
	) {
		return findByProperty(DH, dh
		);
	}
	
	public List<DsrDwDO> findByYb(Object yb
	) {
		return findByProperty(YB, yb
		);
	}
	
	public List<DsrDwDO> findByFrxz(Object frxz
	) {
		return findByProperty(FRXZ, frxz
		);
	}
	
	public List<DsrDwDO> findByGyqygm(Object gyqygm
	) {
		return findByProperty(GYQYGM, gyqygm
		);
	}
	
	public List<DsrDwDO> findByFddbrxm(Object fddbrxm
	) {
		return findByProperty(FDDBRXM, fddbrxm
		);
	}
	
	public List<DsrDwDO> findByFddbrxb(Object fddbrxb
	) {
		return findByProperty(FDDBRXB, fddbrxb
		);
	}
	
	public List<DsrDwDO> findByWhcd(Object whcd
	) {
		return findByProperty(WHCD, whcd
		);
	}
	
	public List<DsrDwDO> findByZzmm(Object zzmm
	) {
		return findByProperty(ZZMM, zzmm
		);
	}
	
	public List<DsrDwDO> findByJb(Object jb
	) {
		return findByProperty(JB, jb
		);
	}
	
	public List<DsrDwDO> findByZw(Object zw
	) {
		return findByProperty(ZW, zw
		);
	}
	
	public List<DsrDwDO> findByLxdh(Object lxdh
	) {
		return findByProperty(LXDH, lxdh
		);
	}
	
	public List<DsrDwDO> findByDbrzw(Object dbrzw
	) {
		return findByProperty(DBRZW, dbrzw
		);
	}
	
	public List<DsrDwDO> findByDjzlb(Object djzlb
	) {
		return findByProperty(DJZLB, djzlb
		);
	}
	
	public List<DsrDwDO> findByDjzh(Object djzh
	) {
		return findByProperty(DJZH, djzh
		);
	}
	

	public List findAll() {
		log.debug("finding all DsrDwDO instances");
		try {
			String queryString = "from DsrDwDO";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public DsrDwDO merge(DsrDwDO detachedInstance) {
        log.debug("merging DsrDwDO instance");
        try {
            DsrDwDO result = (DsrDwDO) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(DsrDwDO instance) {
        log.debug("attaching dirty DsrDwDO instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(DsrDwDO instance) {
        log.debug("attaching clean DsrDwDO instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static DsrDwDao getFromApplicationContext(ApplicationContext ctx) {
    	return (DsrDwDao) ctx.getBean("DsrDwDODAO");
	}
	
	/**
	 * 根据ID获取当事人信息
	 * @param ajxh 案件序号
	 * @param dsrbh 当事人编号
	 * @return
	 */
	public DsrDwDO findById(int ajxh , int dsrbh)
	{
		String hql = "from DsrDwDO where ajxh = " + ajxh + " and dsrbh = " + dsrbh;
		try {
			List<DsrDwDO> dsrDwDOs = getHibernateTemplate().find(hql);
			return dsrDwDOs.size() > 0 ? dsrDwDOs.get(0) : null;
		} catch (RuntimeException re) {
			log.error("getDsrbyAjxh failed", re);
			throw re;
		}
	}
}