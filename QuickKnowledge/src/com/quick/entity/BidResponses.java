package com.quick.entity;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * BidResponses entity. @author MyEclipse Persistence Tools
 */

public class BidResponses  implements java.io.Serializable {


    // Fields    

     private String resid;
     private Bids bids;
     private String responsetext;
     private Date posted;
     private String isaccept;
     private Set expertResponseBids = new HashSet(0);


    // Constructors

    /** default constructor */
    public BidResponses() {
    }

	/** minimal constructor */
    public BidResponses(String resid, String responsetext, Date posted) {
        this.resid = resid;
        this.responsetext = responsetext;
        this.posted = posted;
    }
    
    /** full constructor */
    public BidResponses(String resid, Bids bids, String responsetext, Date posted, String isaccept, Set expertResponseBids) {
        this.resid = resid;
        this.bids = bids;
        this.responsetext = responsetext;
        this.posted = posted;
        this.isaccept = isaccept;
        this.expertResponseBids = expertResponseBids;
    }

   
    // Property accessors

    public String getResid() {
        return this.resid;
    }
    
    public void setResid(String resid) {
        this.resid = resid;
    }

    public Bids getBids() {
        return this.bids;
    }
    
    public void setBids(Bids bids) {
        this.bids = bids;
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

    public String getIsaccept() {
        return this.isaccept;
    }
    
    public void setIsaccept(String isaccept) {
        this.isaccept = isaccept;
    }

    public Set getExpertResponseBids() {
        return this.expertResponseBids;
    }
    
    public void setExpertResponseBids(Set expertResponseBids) {
        this.expertResponseBids = expertResponseBids;
    }
   








}