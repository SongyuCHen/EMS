package nju.software.ems.data.daoobject;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


/**
 * DsrDwDO entity. @author MyEclipse Persistence Tools
 */
@Entity
@IdClass(DsrDwDOId.class)
@Table(name="DSR_DW")
public class DsrDwDO  implements java.io.Serializable {


    // Fields    

    private Integer ajxh;
    private Integer dsrbh;

     private String dwmc;
     private String dz;
     private String dh;
     private String yb;
     private String frxz;
     private String gyqygm;
     private String fddbrxm;
     private String fddbrxb;
     private Date csnyr;
     private String whcd;
     private String zzmm;
     private String jb;
     private String zw;
     private String lxdh;
     private String dbrzw;
     private String djzlb;
     private String djzh;


    // Constructors

    /** default constructor */
    public DsrDwDO() {
    }

	/** minimal constructor */
    public DsrDwDO(Integer ajxh, Integer dsrbh) {
        this.ajxh = ajxh;
        this.dsrbh = dsrbh;
    }
    
    /** full constructor */
    public DsrDwDO(Integer ajxh, Integer dsrbh, String dwmc, String dz, String dh, String yb, String frxz, String gyqygm, String fddbrxm, String fddbrxb, Date csnyr, String whcd, String zzmm, String jb, String zw, String lxdh, String dbrzw, String djzlb, String djzh) {
        this.ajxh = ajxh;
        this.dsrbh = dsrbh;
        this.dwmc = dwmc;
        this.dz = dz;
        this.dh = dh;
        this.yb = yb;
        this.frxz = frxz;
        this.gyqygm = gyqygm;
        this.fddbrxm = fddbrxm;
        this.fddbrxb = fddbrxb;
        this.csnyr = csnyr;
        this.whcd = whcd;
        this.zzmm = zzmm;
        this.jb = jb;
        this.zw = zw;
        this.lxdh = lxdh;
        this.dbrzw = dbrzw;
        this.djzlb = djzlb;
        this.djzh = djzh;
    }

   
    // Property accessors
    @Id
    @Column(name="AJXH", nullable=false)
    public Integer getAjxh() {
        return this.ajxh;
    }
    
    public void setAjxh(Integer ajxh) {
        this.ajxh = ajxh;
    }

    @Id
    @Column(name="DSRBH", nullable=false)
    public Integer getDsrbh() {
        return this.dsrbh;
    }
    
    public void setDsrbh(Integer dsrbh) {
        this.dsrbh = dsrbh;
    }
    
    @Column(name="DWMC", length=200)

    public String getDwmc() {
        return this.dwmc;
    }
    
    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }
    
    @Column(name="DZ", length=50)

    public String getDz() {
        return this.dz;
    }
    
    public void setDz(String dz) {
        this.dz = dz;
    }
    
    @Column(name="DH", length=20)

    public String getDh() {
        return this.dh;
    }
    
    public void setDh(String dh) {
        this.dh = dh;
    }
    
    @Column(name="YB", length=10)

    public String getYb() {
        return this.yb;
    }
    
    public void setYb(String yb) {
        this.yb = yb;
    }
    
    @Column(name="FRXZ", length=10)

    public String getFrxz() {
        return this.frxz;
    }
    
    public void setFrxz(String frxz) {
        this.frxz = frxz;
    }
    
    @Column(name="GYQYGM", length=10)

    public String getGyqygm() {
        return this.gyqygm;
    }
    
    public void setGyqygm(String gyqygm) {
        this.gyqygm = gyqygm;
    }
    
    @Column(name="FDDBRXM", length=50)

    public String getFddbrxm() {
        return this.fddbrxm;
    }
    
    public void setFddbrxm(String fddbrxm) {
        this.fddbrxm = fddbrxm;
    }
    
    @Column(name="FDDBRXB", length=10)

    public String getFddbrxb() {
        return this.fddbrxb;
    }
    
    public void setFddbrxb(String fddbrxb) {
        this.fddbrxb = fddbrxb;
    }
    
    @Column(name="CSNYR", length=23)

    public Date getCsnyr() {
        return this.csnyr;
    }
    
    public void setCsnyr(Date csnyr) {
        this.csnyr = csnyr;
    }
    
    @Column(name="WHCD", length=10)

    public String getWhcd() {
        return this.whcd;
    }
    
    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }
    
    @Column(name="ZZMM", length=10)

    public String getZzmm() {
        return this.zzmm;
    }
    
    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }
    
    @Column(name="JB", length=10)

    public String getJb() {
        return this.jb;
    }
    
    public void setJb(String jb) {
        this.jb = jb;
    }
    
    @Column(name="ZW", length=10)

    public String getZw() {
        return this.zw;
    }
    
    public void setZw(String zw) {
        this.zw = zw;
    }
    
    @Column(name="LXDH", length=20)

    public String getLxdh() {
        return this.lxdh;
    }
    
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }
    
    @Column(name="DBRZW", length=40)

    public String getDbrzw() {
        return this.dbrzw;
    }
    
    public void setDbrzw(String dbrzw) {
        this.dbrzw = dbrzw;
    }
    
    @Column(name="DJZLB", length=2)

    public String getDjzlb() {
        return this.djzlb;
    }
    
    public void setDjzlb(String djzlb) {
        this.djzlb = djzlb;
    }
    
    @Column(name="DJZH", length=50)

    public String getDjzh() {
        return this.djzh;
    }
    
    public void setDjzh(String djzh) {
        this.djzh = djzh;
    }
   








}