package com.quick.entity;
// default package

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private BigDecimal userid;
     private String username;
     private String password;
     private BigDecimal type;
     private Set enterprises = new HashSet(0);
     private Set commonSites = new HashSet(0);
     private Set experts = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(BigDecimal userid, String username, String password, BigDecimal type) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.type = type;
    }
    
    /** full constructor */
    public User(BigDecimal userid, String username, String password, BigDecimal type, Set enterprises, Set commonSites, Set experts) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.type = type;
        this.enterprises = enterprises;
        this.commonSites = commonSites;
        this.experts = experts;
    }

   
    // Property accessors

    public BigDecimal getUserid() {
        return this.userid;
    }
    
    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getType() {
        return this.type;
    }
    
    public void setType(BigDecimal type) {
        this.type = type;
    }

    public Set getEnterprises() {
        return this.enterprises;
    }
    
    public void setEnterprises(Set enterprises) {
        this.enterprises = enterprises;
    }

    public Set getCommonSites() {
        return this.commonSites;
    }
    
    public void setCommonSites(Set commonSites) {
        this.commonSites = commonSites;
    }

    public Set getExperts() {
        return this.experts;
    }
    
    public void setExperts(Set experts) {
        this.experts = experts;
    }
   








}