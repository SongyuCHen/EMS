package nju.software.appraisal.data.DAO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nju.software.appraisal.data.dataobject.PubAjJb;
import nju.software.appraisal.service.model.SearchConditionForDzda;
import nju.software.appraisal.util.StringUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PubAjJb entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.dzda.data.dataobject.PubAjJb
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings(value = { "unchecked" })
public class PubAjJbDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(PubAjJbDAO.class);

	public static PubAjJbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PubAjJbDAO) ctx.getBean("PubAjJbDAO");
	}

	public PubAjJb getAjJbByAjxh(int ajxh) {
		log.debug("getAjJbByAjxh with ajxh:" + ajxh);
		String hql = "from PubAjJb where 	AJXH=" + ajxh;
		Session s = this.getSession();
		Query query = s.createQuery(hql);
		List<PubAjJb> PubAjJbList = (List<PubAjJb>) query.list();
		if (PubAjJbList == null || PubAjJbList.isEmpty())
			return null;
		return PubAjJbList.get(0);
	}

	public PubAjJb getAjjbByAjxh(int ajxh) {
		log.debug("getAjjbByAjxh with ajxh:" + ajxh);
		String hql = "from PubAjJb where 	AJXH=?";
		List<PubAjJb> pubAjJbList = (List<PubAjJb>)getHibernateTemplate().find(hql, ajxh);
		if (pubAjJbList == null || pubAjJbList.size() == 0) {
			return null;
		} else {
			PubAjJb pubAjJb = pubAjJbList.get(0);
			return pubAjJb;
		}
	}
	
	public PubAjJb getAjjbByAh(String ah){
		log.debug("getAjjbByAh with ajxh:" + ah);
		String hql = "from PubAjJb where AH=?";
		List<PubAjJb> pubAjJbList = (List<PubAjJb>)getHibernateTemplate().find(hql, ah);
		if(pubAjJbList == null || pubAjJbList.size() == 0){
			return null;
		} else {
			PubAjJb pubAjJb = pubAjJbList.get(0);
			return pubAjJb;
		}
	}
	public List<PubAjJb> getAllDzdaList() {
		// TODO Auto-generated method stub
		String hql="from PubAjJb";
		List<PubAjJb> pubAjJbList = (List<PubAjJb>)getHibernateTemplate().find(hql);
		if(pubAjJbList==null||pubAjJbList.size()==0){
		return null;
		}else{
			return pubAjJbList;
		}
	}
	

	public List<PubAjJb> getByContion(SearchConditionForDzda condition) {
		String ah = condition.getAh();
		String ajmc = condition.getAjmc();
		String ajxz = condition.getAjxz();
		Date jaBeginTime = condition.getJa_begin_time();
		Date jaEndTime = condition.getJa_end_time();
		Date laEndTime = condition.getLa_end_time();
		Date laBeginTime = condition.getLa_begin_time();
		String baspt = condition.getSpt();
		String cbr = condition.getCbr();
		Date gdrq = condition.getGdrq();
		StringBuffer hql = new StringBuffer();
		StringBuffer table = new StringBuffer();
		StringBuffer tiaojian = new StringBuffer();
		hql.append("SELECT a  FROM  PubAjJb a ");
		int flag = 0;
		if (!StringUtil.isBlank(cbr)) {
			flag++;
			table.append(",PubSpry d ");
			tiaojian.append(" a.gdrq is not null AND a.gdxlh is not null AND a.ajxh=d.ajxh AND d.sfcbr='Y' AND d.xm='" + cbr
					+ "'" + " and");
		}
		if (!StringUtil.isBlank(ah)) {
			flag++;
			tiaojian.append(" a.ah like '%" + ah + "%'" + " and");
		}
		if (!StringUtil.isBlank(ajmc)) {	
				flag++;
				tiaojian.append(" a.ajmc like '%" + ajmc + "%'" + " and");			
		}
		if (!StringUtil.isBlank(ajxz)) {
			flag++;
			tiaojian.append(" a.ajxz='" + ajxz + "'" + " and");
		}
		if (laBeginTime != null) {		
			flag++;
			SimpleDateFormat sdt= new SimpleDateFormat ("yyyy/MM/dd");
			String larq_b=sdt.format(laBeginTime);
			tiaojian.append(" a.larq >'" + larq_b+ "'" + " and");
		}
		if (laEndTime != null) {			
			flag++;
			SimpleDateFormat sdt= new SimpleDateFormat ("yyyy/MM/dd");
			String larq_e=sdt.format(laEndTime);
			tiaojian.append(" a.larq <'" + larq_e+ "'" + " and");
		}
		if (jaBeginTime != null) {
			flag++;
			SimpleDateFormat sdt= new SimpleDateFormat ("yyyy/MM/dd");
			String jarq_b=sdt.format(jaBeginTime);
			tiaojian.append(" a.jarq >'" + jarq_b + "'" + " and");			
		}
		if (jaEndTime != null) {			
			flag++;
			SimpleDateFormat sdt= new SimpleDateFormat ("yyyy/MM/dd");
			String Jarq_e=sdt.format(jaEndTime);
			tiaojian.append(" a.larq <'" + Jarq_e+ "'" + " and");
		}
		if (!StringUtil.isBlank(baspt)) {			
			flag++;
			tiaojian.append(" a.baspt='" + baspt + "'" + " and");
		}
		if (gdrq != null) {			
			SimpleDateFormat sdt= new SimpleDateFormat ("yyyy/MM/dd");
			String gdrq_s=sdt.format(gdrq);
			table.append(", DaSusong b,DaCard c");
			tiaojian.append(" a.ah=b.anhao AND b.xlh=c.xlh AND c.gdrq='"
					+ gdrq_s + "'  AND c.ygd='1'" + " and");
		}
		tiaojian.append(" 0 < (select count(ajid) from DzdaWdAjOld where ah=a.ah) and");
		hql.append(table + " where" + tiaojian);		
		int length = hql.length();
		String hql1 = "";
		if (flag != 0)
			hql1 = hql.substring(0, length - 3);
		else
			hql1 = hql.toString();
		List<PubAjJb> list = (List<PubAjJb>) (getHibernateTemplate().find(hql1));		
		if (list.isEmpty()) {
			return null;
		} else {
			return list;
		}
	}

	/**
	 * 根据sql获取案件列表
	 * @param sql
	 * @return
	 */
	public List<Object[]> getAjListBySql(String sql){
		log.debug("getAjListBySql with sql:"+sql);
		List<Object[]> result=(List<Object[]>)getHibernateTemplate().find(sql);
		if(result==null || result.isEmpty())
			return new ArrayList<Object[]>();
		return result;
	}

	
}