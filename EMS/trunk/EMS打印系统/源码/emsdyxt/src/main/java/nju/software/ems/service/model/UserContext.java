package nju.software.ems.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author zym
 *
 */
public class UserContext implements Serializable{

	
	private static final long serialVersionUID = 3781213350527130400L;
	
	private int yhbh;
	
	private String bh;
	
	private String name;
	
	private String password;
	
	private String role;
	
	private String yhsf;
	
	private String bmbh;
	
	private String bmmc;
	
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
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
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
}
