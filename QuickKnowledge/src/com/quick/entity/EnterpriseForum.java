package com.quick.entity;
// default package

import java.math.BigDecimal;
import java.util.Date;


/**
 * EnterpriseForum entity. @author MyEclipse Persistence Tools
 */

public class EnterpriseForum  implements java.io.Serializable {


    // Fields    

     private BigDecimal pid;
     private BigDecimal enterpriseid;
     private String title;
     private String content;
     private Date posted;


    // Constructors

    /** default constructor */
    public EnterpriseForum() {
    }

	/** minimal constructor */
    public EnterpriseForum(BigDecimal pid, String title, String content, Date posted) {
        this.pid = pid;
        this.title = title;
        this.content = content;
        this.posted = posted;
    }
    
    /** full constructor */
    public EnterpriseForum(BigDecimal pid, BigDecimal enterpriseid, String title, String content, Date posted) {
        this.pid = pid;
        this.enterpriseid = enterpriseid;
        this.title = title;
        this.content = content;
        this.posted = posted;
    }

   
    // Property accessors

    public BigDecimal getPid() {
        return this.pid;
    }
    
    public void setPid(BigDecimal pid) {
        this.pid = pid;
    }

    public BigDecimal getEnterpriseid() {
        return this.enterpriseid;
    }
    
    public void setEnterpriseid(BigDecimal enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosted() {
        return this.posted;
    }
    
    public void setPosted(Date posted) {
        this.posted = posted;
    }
   








}