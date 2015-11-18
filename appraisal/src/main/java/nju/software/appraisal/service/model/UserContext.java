package nju.software.appraisal.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author zym
 *
 */
public class UserContext implements Serializable{

	
	private static final long serialVersionUID = 3781213350527130400L;
	//用户编号
	private int yhbh;
	//用户姓名	
	private String name;
	//用户密码
	private String password;
	//用户评查角色
	private String role;
	//用户身份
	private String yhsf;
	//部门编号
	private String bmbh;
	//部门名称
	private String bmmc;
	//登录IP
	private String loginIp;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYhbh() {
		return yhbh;
	}
	public void setYhbh(int yhbh) {
		this.yhbh = yhbh;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getYhsf() {
		return yhsf;
	}
	public void setYhsf(String yhsf) {
		this.yhsf = yhsf;
	}
	public String getBmbh() {
		return bmbh;
	}
	public void setBmbh(String bmbh) {
		this.bmbh = bmbh;
	}
	public String getBmmc() {
		return bmmc;
	}
	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
}
