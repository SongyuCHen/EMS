package nju.software.ems.data.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import nju.software.ems.service.model.CaseResultModel;

import org.hibernate.connection.ConnectionProvider;
import org.hibernate.engine.SessionFactoryImplementor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class SqlResultDao extends HibernateDaoSupport{
	private static final Logger log = LoggerFactory.getLogger(SqlResultDao.class);

	public List<CaseResultModel> getSqlResult(String sql) throws SQLException {
		ConnectionProvider cp = null;
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		List<CaseResultModel> res = new ArrayList<CaseResultModel>();
		try {
			cp = ((SessionFactoryImplementor) this.getSessionFactory()).getConnectionProvider();
			connection = cp.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			res = new ArrayList<CaseResultModel>();
			while(rs.next()){
				CaseResultModel crm = new CaseResultModel();
				crm.setAjxh(rs.getInt("AJXH"));
				crm.setAh(rs.getString("AH"));
				crm.setAjmc(rs.getString("AJMC"));
				crm.setSpt(rs.getString("BASPT"));
				crm.setXm(rs.getString("XM"));
				crm.setLarq(rs.getString("LARQ"));
				crm.setJasj(rs.getString("JARQ"));
				crm.setSycx(rs.getString("SYCX"));
				crm.setSfcbr(rs.getString("SFCBR"));
				crm.setFg(rs.getString("FG"));
				crm.setAjxz(rs.getString("AJXZ"));
				crm.setSx(rs.getInt("SX"));
				crm.setFjsx(rs.getInt("FJSX"));
				crm.setGdbz(rs.getString("GDBZ"));
				crm.setGdrq(rs.getString("GDRQ"));
				crm.setJafs(rs.getString("JAFS"));
				crm.setPsycy(rs.getString("PSYCY"));
				crm.setSfxess(rs.getString("SFXESS"));
				crm.setSpcx(rs.getString("SPCX"));
				crm.setAjzt(rs.getString("AJZT"));
				crm.setSfzscq(rs.getString("SFZSCQ"));
				crm.setAjwsqk(rs.getString("AJWSQK"));
				res.add(crm);
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
		return res;
	}
}
