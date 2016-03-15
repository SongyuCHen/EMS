package nju.software.ems.data.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nju.software.ems.data.daoobject.AjJbDO;
import nju.software.ems.service.model.CaseResultModel;

import org.hibernate.LockMode;
import org.hibernate.connection.ConnectionProvider;
import org.hibernate.engine.SessionFactoryImplementor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AjJbDO entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.ems.data.daoobject.AjJbDO
 * @author MyEclipse Persistence Tools
 */

public class AjJbDao extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(AjJbDao.class);
	// property constants
	public static final String AH = "ah";
	public static final String AJMC = "ajmc";
	public static final String AJXZ = "ajxz";
	public static final String AJLY = "ajly";
	public static final String SPCX = "spcx";
	public static final String SPCXDZ = "spcxdz";
	public static final String SYCX = "sycx";
	public static final String SFYS = "sfys";
	public static final String SFZDAJ = "sfzdaj";
	public static final String SFJBAJ = "sfjbaj";
	public static final String SFFHCS = "sffhcs";
	public static final String SFWDYJ = "sfwdyj";
	public static final String SX = "sx";
	public static final String FJSX = "fjsx";
	public static final String LYDQ = "lydq";
	public static final String BASPT = "baspt";
	public static final String JYAQ = "jyaq";
	public static final String LAR = "lar";
	public static final String BAFY = "bafy";
	public static final String GKSJG = "gksjg";
	public static final String CBRYJ = "cbryj";
	public static final String HYTYJ = "hytyj";
	public static final String TZHYJ = "tzhyj";
	public static final String YZHYJ = "yzhyj";
	public static final String SWHYJ = "swhyj";
	public static final String JAFS = "jafs";
	public static final String JAYY = "jayy";
	public static final String JAYYDM = "jayydm";
	public static final String BZ = "bz";
	public static final String GDBZ = "gdbz";
	public static final String AJZT = "ajzt";
	public static final String BYCXDZ = "bycxdz";
	public static final String AJWSQK = "ajwsqk";
	public static final String GDXLH = "gdxlh";
	public static final String JAR = "jar";
	public static final String SLQK = "slqk";
	public static final String SSLX = "sslx";
	public static final String SFGS = "sfgs";
	public static final String FHCSYY = "fhcsyy";
	public static final String GPYY = "gpyy";
	public static final String SFZSCQ = "sfzscq";
	public static final String SWLX = "swlx";
	public static final String MODFLAG = "modflag";
	public static final String TRANSFLAG = "transflag";
	public static final String PSYCY = "psycy";
	public static final String MSAJTJS = "msajtjs";
	public static final String MSAJTJSSS = "msajtjsss";
	public static final String SHWDFXPG = "shwdfxpg";
	public static final String SFSQSFQR = "sfsqsfqr";
	public static final String SFJGYLA = "sfjgyla";
	public static final String SFYYFFA = "sfyyffa";
	public static final String YFFA = "yffa";
	public static final String SFHJ = "sfhj";
	public static final String FXHJCS = "fxhjcs";
	public static final String YSFYSFFCZS = "ysfysffczs";
	public static final String SFKTSL = "sfktsl";
	public static final String PJSFFDJFNR = "pjsffdjfnr";
	public static final String SFTZ = "sftz";
	public static final String SFDTPJ = "sfdtpj";
	public static final String ZYTJ = "zytj";
	public static final String SFXESS = "sfxess";
	public static final String AJDJCS = "ajdjcs";

	protected void initDao() {
		// do nothing
	}

	public void save(AjJbDO transientInstance) {
		log.debug("saving AjJbDO instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AjJbDO persistentInstance) {
		log.debug("deleting AjJbDO instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AjJbDO findById(java.lang.Integer id) {
		log.debug("getting AjJbDO instance with id: " + id);
		try {
			AjJbDO instance = (AjJbDO) getHibernateTemplate().get(
					"nju.software.ems.data.daoobject.AjJbDO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<AjJbDO> findByExample(AjJbDO instance) {
		log.debug("finding AjJbDO instance by example");
		try {
			List<AjJbDO> results = (List<AjJbDO>) getHibernateTemplate()
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
		log.debug("finding AjJbDO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AjJbDO as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<AjJbDO> findByAh(Object ah) {
		return findByProperty(AH, ah);
	}

	public List<AjJbDO> findByAjmc(Object ajmc) {
		return findByProperty(AJMC, ajmc);
	}

	public List<AjJbDO> findByAjxz(Object ajxz) {
		return findByProperty(AJXZ, ajxz);
	}

	public List<AjJbDO> findByAjly(Object ajly) {
		return findByProperty(AJLY, ajly);
	}

	public List<AjJbDO> findBySpcx(Object spcx) {
		return findByProperty(SPCX, spcx);
	}

	public List<AjJbDO> findBySpcxdz(Object spcxdz) {
		return findByProperty(SPCXDZ, spcxdz);
	}

	public List<AjJbDO> findBySycx(Object sycx) {
		return findByProperty(SYCX, sycx);
	}

	public List<AjJbDO> findBySfys(Object sfys) {
		return findByProperty(SFYS, sfys);
	}

	public List<AjJbDO> findBySfzdaj(Object sfzdaj) {
		return findByProperty(SFZDAJ, sfzdaj);
	}

	public List<AjJbDO> findBySfjbaj(Object sfjbaj) {
		return findByProperty(SFJBAJ, sfjbaj);
	}

	public List<AjJbDO> findBySffhcs(Object sffhcs) {
		return findByProperty(SFFHCS, sffhcs);
	}

	public List<AjJbDO> findBySfwdyj(Object sfwdyj) {
		return findByProperty(SFWDYJ, sfwdyj);
	}

	public List<AjJbDO> findBySx(Object sx) {
		return findByProperty(SX, sx);
	}

	public List<AjJbDO> findByFjsx(Object fjsx) {
		return findByProperty(FJSX, fjsx);
	}

	public List<AjJbDO> findByLydq(Object lydq) {
		return findByProperty(LYDQ, lydq);
	}

	public List<AjJbDO> findByBaspt(Object baspt) {
		return findByProperty(BASPT, baspt);
	}

	public List<AjJbDO> findByJyaq(Object jyaq) {
		return findByProperty(JYAQ, jyaq);
	}

	public List<AjJbDO> findByLar(Object lar) {
		return findByProperty(LAR, lar);
	}

	public List<AjJbDO> findByBafy(Object bafy) {
		return findByProperty(BAFY, bafy);
	}

	public List<AjJbDO> findByGksjg(Object gksjg) {
		return findByProperty(GKSJG, gksjg);
	}

	public List<AjJbDO> findByCbryj(Object cbryj) {
		return findByProperty(CBRYJ, cbryj);
	}

	public List<AjJbDO> findByHytyj(Object hytyj) {
		return findByProperty(HYTYJ, hytyj);
	}

	public List<AjJbDO> findByTzhyj(Object tzhyj) {
		return findByProperty(TZHYJ, tzhyj);
	}

	public List<AjJbDO> findByYzhyj(Object yzhyj) {
		return findByProperty(YZHYJ, yzhyj);
	}

	public List<AjJbDO> findBySwhyj(Object swhyj) {
		return findByProperty(SWHYJ, swhyj);
	}

	public List<AjJbDO> findByJafs(Object jafs) {
		return findByProperty(JAFS, jafs);
	}

	public List<AjJbDO> findByJayy(Object jayy) {
		return findByProperty(JAYY, jayy);
	}

	public List<AjJbDO> findByJayydm(Object jayydm) {
		return findByProperty(JAYYDM, jayydm);
	}

	public List<AjJbDO> findByBz(Object bz) {
		return findByProperty(BZ, bz);
	}

	public List<AjJbDO> findByGdbz(Object gdbz) {
		return findByProperty(GDBZ, gdbz);
	}

	public List<AjJbDO> findByAjzt(Object ajzt) {
		return findByProperty(AJZT, ajzt);
	}

	public List<AjJbDO> findByBycxdz(Object bycxdz) {
		return findByProperty(BYCXDZ, bycxdz);
	}

	public List<AjJbDO> findByAjwsqk(Object ajwsqk) {
		return findByProperty(AJWSQK, ajwsqk);
	}

	public List<AjJbDO> findByGdxlh(Object gdxlh) {
		return findByProperty(GDXLH, gdxlh);
	}

	public List<AjJbDO> findByJar(Object jar) {
		return findByProperty(JAR, jar);
	}

	public List<AjJbDO> findBySlqk(Object slqk) {
		return findByProperty(SLQK, slqk);
	}

	public List<AjJbDO> findBySslx(Object sslx) {
		return findByProperty(SSLX, sslx);
	}

	public List<AjJbDO> findBySfgs(Object sfgs) {
		return findByProperty(SFGS, sfgs);
	}

	public List<AjJbDO> findByFhcsyy(Object fhcsyy) {
		return findByProperty(FHCSYY, fhcsyy);
	}

	public List<AjJbDO> findByGpyy(Object gpyy) {
		return findByProperty(GPYY, gpyy);
	}

	public List<AjJbDO> findBySfzscq(Object sfzscq) {
		return findByProperty(SFZSCQ, sfzscq);
	}

	public List<AjJbDO> findBySwlx(Object swlx) {
		return findByProperty(SWLX, swlx);
	}

	public List<AjJbDO> findByModflag(Object modflag) {
		return findByProperty(MODFLAG, modflag);
	}

	public List<AjJbDO> findByTransflag(Object transflag) {
		return findByProperty(TRANSFLAG, transflag);
	}

	public List<AjJbDO> findByPsycy(Object psycy) {
		return findByProperty(PSYCY, psycy);
	}

	public List<AjJbDO> findByMsajtjs(Object msajtjs) {
		return findByProperty(MSAJTJS, msajtjs);
	}

	public List<AjJbDO> findByMsajtjsss(Object msajtjsss) {
		return findByProperty(MSAJTJSSS, msajtjsss);
	}

	public List<AjJbDO> findByShwdfxpg(Object shwdfxpg) {
		return findByProperty(SHWDFXPG, shwdfxpg);
	}

	public List<AjJbDO> findBySfsqsfqr(Object sfsqsfqr) {
		return findByProperty(SFSQSFQR, sfsqsfqr);
	}

	public List<AjJbDO> findBySfjgyla(Object sfjgyla) {
		return findByProperty(SFJGYLA, sfjgyla);
	}

	public List<AjJbDO> findBySfyyffa(Object sfyyffa) {
		return findByProperty(SFYYFFA, sfyyffa);
	}

	public List<AjJbDO> findByYffa(Object yffa) {
		return findByProperty(YFFA, yffa);
	}

	public List<AjJbDO> findBySfhj(Object sfhj) {
		return findByProperty(SFHJ, sfhj);
	}

	public List<AjJbDO> findByFxhjcs(Object fxhjcs) {
		return findByProperty(FXHJCS, fxhjcs);
	}

	public List<AjJbDO> findByYsfysffczs(Object ysfysffczs) {
		return findByProperty(YSFYSFFCZS, ysfysffczs);
	}

	public List<AjJbDO> findBySfktsl(Object sfktsl) {
		return findByProperty(SFKTSL, sfktsl);
	}

	public List<AjJbDO> findByPjsffdjfnr(Object pjsffdjfnr) {
		return findByProperty(PJSFFDJFNR, pjsffdjfnr);
	}

	public List<AjJbDO> findBySftz(Object sftz) {
		return findByProperty(SFTZ, sftz);
	}

	public List<AjJbDO> findBySfdtpj(Object sfdtpj) {
		return findByProperty(SFDTPJ, sfdtpj);
	}

	public List<AjJbDO> findByZytj(Object zytj) {
		return findByProperty(ZYTJ, zytj);
	}

	public List<AjJbDO> findBySfxess(Object sfxess) {
		return findByProperty(SFXESS, sfxess);
	}

	public List<AjJbDO> findByAjdjcs(Object ajdjcs) {
		return findByProperty(AJDJCS, ajdjcs);
	}

	public List findAll() {
		log.debug("finding all AjJbDO instances");
		try {
			String queryString = "from AjJbDO";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AjJbDO merge(AjJbDO detachedInstance) {
		log.debug("merging AjJbDO instance");
		try {
			AjJbDO result = (AjJbDO) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AjJbDO instance) {
		log.debug("attaching dirty AjJbDO instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AjJbDO instance) {
		log.debug("attaching clean AjJbDO instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AjJbDao getFromApplicationContext(ApplicationContext ctx) {
		return (AjJbDao) ctx.getBean("AjJbDODAO");
	}
	
	public AjJbDO findByAjxh(Integer id) {
		ConnectionProvider cp = null;
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		AjJbDO ajJbDO = null;
		String sql = "SELECT AJXH , AH , AJMC , AJXZ , AJLY , SPCX FROM PUB_AJ_JB WHERE AJXH = " + id;
		try {
			cp = ((SessionFactoryImplementor) this.getSessionFactory()).getConnectionProvider();
			connection = cp.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()){
				ajJbDO = new AjJbDO();
				ajJbDO.setAjxh(rs.getInt("AJXH"));
				ajJbDO.setAh(rs.getString("AH"));
				ajJbDO.setAjmc(rs.getString("AJMC"));
//				crm.setSpt(rs.getString("BASPT"));
//				crm.setXm(rs.getString("XM"));
//				crm.setLarq(rs.getString("LARQ"));
//				crm.setJasj(rs.getString("JARQ"));
//				crm.setSycx(rs.getString("SYCX"));
//				crm.setSfcbr(rs.getString("SFCBR"));
//				crm.setFg(rs.getString("FG"));
//				crm.setAjxz(rs.getString("AJXZ"));
//				crm.setSx(rs.getInt("SX"));
//				crm.setFjsx(rs.getInt("FJSX"));
//				crm.setGdbz(rs.getString("GDBZ"));
//				crm.setGdrq(rs.getString("GDRQ"));
//				crm.setJafs(rs.getString("JAFS"));
//				crm.setPsycy(rs.getString("PSYCY"));
//				crm.setSfxess(rs.getString("SFXESS"));
//				crm.setSpcx(rs.getString("SPCX"));
//				crm.setAjzt(rs.getString("AJZT"));
//				crm.setSfzscq(rs.getString("SFZSCQ"));
//				crm.setAjwsqk(rs.getString("AJWSQK"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (statement != null)
					statement.close();
				if (cp != null)
					cp.closeConnection(connection);
			} catch (SQLException e) {
				log.error("关闭数据库连接出错。",e);
			}
		}
		return ajJbDO;
	}
}