package com.quick.entity;
// default package

import java.math.BigDecimal;
import java.util.Date;


/**
 * RfpResponse entity. @author MyEclipse Persistence Tools
 */

public class RfpResponse  implements java.io.Serializable {


    // Fields    

     private BigDecimal rspid;
     private BigDecimal rfpid;
     private BigDecimal teamid;
     private BigDecimal expertid;
     private String responsetext;
     private Date posted;


    // Constructors

    /** default constructor */
    public RfpResponse() {
    }

	/** minimal constructor */
    public RfpResponse(BigDecimal rspid, String responsetext, Date posted) {
        this.rspid = rspid;
        this.responsetext = responsetext;
        this.posted = posted;
    }
    
    /** full constructor */
    public RfpResponse(BigDecimal rspid, BigDecimal rfpid, BigDecimal teamid, BigDecimal expertid, String responsetext, Date posted) {
        this.rspid = rspid;
        this.rfpid = rfpid;
        this.teamid = teamid;
        this.expertid = expertid;
        this.responsetext = responsetext;
        this.posted = posted;
    }

   
    // Property accessors

    public BigDecimal getRspid() {
        return this.rspid;
    }
    
    public void setRspid(BigDecimal rspid) {
        this.rspid = rspid;
    }

    public BigDecimal getRfpid() {
        return this.rfpid;
    }
    
    public void setRfpid(BigDecimal rfpid) {
        this.rfpid = rfpid;
    }

    public BigDecimal getTeamid() {
        return this.teamid;
    }
    
    public void setTeamid(BigDecimal teamid) {
        this.teamid = teamid;
    }

    public BigDecimal getExpertid() {
        return this.expertid;
    }
    
    public void setExpertid(BigDecimal expertid) {
        this.expertid = expertid;
    }

    public String getResponsetext() {
        return this.responsetext;
    }
    
    public void setResponsetext(String responsetext) {
        this.responsetext = responsetext;
    }

    public Date getPosted() {
        return this.posted;
    }
    
    public void setPosted(Date posted) {
        this.posted = posted;
    }
   








}