package nju.software.appraisal.data.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nju.software.appraisal.data.dataobject.PubAyDmb;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PubAyDmb entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see nju.software.dzda.data.dataobject.PubAyDmb
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings(value = { "unchecked" })
public class PubAyDmbDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(PubAyDmbDAO.class);

	public static PubAyDmbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PubAyDmbDAO) ctx.getBean("PubAyDmbDAO");
	}

	public PubAyDmb getAyDmByAybh(String dmbh) {
		log.debug("getAyDmByAybh with dmbh:" + dmbh);
		String hql = " from PubAyDmb where DMBH='" + dmbh + "'";
		Session s = this.getSession();
		Query query = s.createQuery(hql);
		List<PubAyDmb> pubAyDmbList = (List<PubAyDmb>) query.list();

		if (pubAyDmbList == null || pubAyDmbList.size() == 0) {
			return null;
		} else {
			PubAyDmb pubAyDmb = pubAyDmbList.get(0);
			return pubAyDmb;
		}
	}

	public List<PubAyDmb> getPubAyDmbByAyList(List<String> ayList) {
		log.debug("find ay in:" + ayList);
		String hql = "select a from PubAyDmb a where a.dmbh in (:list)";
		Session s = this.getSession();
		Query query = s.createQuery(hql).setParameterList("list",
				ayList.toArray());
		List<PubAyDmb> results = (List<PubAyDmb>) query.list();
		return results;
	}

	public Map<String, PubAyDmb> getPubAyDmbMapByAyList(List<String> ayList) {
		log.debug("find ay in:" + ayList);
		int limit = 2000;
		Map<String, PubAyDmb> map = new HashMap<String, PubAyDmb>();
		for(int i = 0; i < ayList.size(); i += limit){
			List<String> tmpList = ayList.subList(i, i+limit > ayList.size() ? ayList.size() : i + limit);
			
			String hql = "select a from PubAyDmb a where a.dmbh in (:list)";
			Session s = this.getSession();
			Query query = s.createQuery(hql).setParameterList("list",
					tmpList.toArray());
			List<PubAyDmb> results = (List<PubAyDmb>) query.list();

			for (PubAyDmb ay : results) {
				map.put(ay.getDmbh(), ay);
			}
		}
		
		
		System.out.println(map);
		return map;
	}

}