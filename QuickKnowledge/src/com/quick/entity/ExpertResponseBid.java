package com.quick.entity;
// default package



/**
 * ExpertResponseBid entity. @author MyEclipse Persistence Tools
 */

public class ExpertResponseBid  implements java.io.Serializable {


    // Fields    

     private ExpertResponseBidId id;
     private BidResponses bidResponses;
     private Expert expert;


    // Constructors

    /** default constructor */
    public ExpertResponseBid() {
    }

    
    /** full constructor */
    public ExpertResponseBid(ExpertResponseBidId id, BidResponses bidResponses, Expert expert) {
        this.id = id;
        this.bidResponses = bidResponses;
        this.expert = expert;
    }

   
    // Property accessors

    public ExpertResponseBidId getId() {
        return this.id;
    }
    
    public void setId(ExpertResponseBidId id) {
        this.id = id;
    }

    public BidResponses getBidResponses() {
        return this.bidResponses;
    }
    
    public void setBidResponses(BidResponses bidResponses) {
        this.bidResponses = bidResponses;
    }

    public Expert getExpert() {
        return this.expert;
    }
    
    public void setExpert(Expert expert) {
        this.expert = expert;
    }
   








}