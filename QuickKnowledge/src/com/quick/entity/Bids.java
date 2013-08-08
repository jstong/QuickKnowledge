package com.quick.entity;
// default package

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Bids entity. @author MyEclipse Persistence Tools
 */

public class Bids  implements java.io.Serializable {


    // Fields    

     private BigDecimal bidid;
     private Enterprise enterprise;
     private String title;
     private String details;
     private String industry;
     private String contact;
     private String address;
     private String phone;
     private String fax;
     private String email;
     private Date opeaningdate;
     private Date expirationdate;
     private Set bidResponseses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Bids() {
    }

	/** minimal constructor */
    public Bids(BigDecimal bidid, String title, String details, String industry, String contact, String address, String fax, String email) {
        this.bidid = bidid;
        this.title = title;
        this.details = details;
        this.industry = industry;
        this.contact = contact;
        this.address = address;
        this.fax = fax;
        this.email = email;
    }
    
    /** full constructor */
    public Bids(BigDecimal bidid, Enterprise enterprise, String title, String details, String industry, String contact, String address, String phone, String fax, String email, Date opeaningdate, Date expirationdate, Set bidResponseses) {
        this.bidid = bidid;
        this.enterprise = enterprise;
        this.title = title;
        this.details = details;
        this.industry = industry;
        this.contact = contact;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.opeaningdate = opeaningdate;
        this.expirationdate = expirationdate;
        this.bidResponseses = bidResponseses;
    }

   
    // Property accessors

    public BigDecimal getBidid() {
        return this.bidid;
    }
    
    public void setBidid(BigDecimal bidid) {
        this.bidid = bidid;
    }

    public Enterprise getEnterprise() {
        return this.enterprise;
    }
    
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }

    public String getIndustry() {
        return this.industry;
    }
    
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getOpeaningdate() {
        return this.opeaningdate;
    }
    
    public void setOpeaningdate(Date opeaningdate) {
        this.opeaningdate = opeaningdate;
    }

    public Date getExpirationdate() {
        return this.expirationdate;
    }
    
    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public Set getBidResponseses() {
        return this.bidResponseses;
    }
    
    public void setBidResponseses(Set bidResponseses) {
        this.bidResponseses = bidResponseses;
    }
   








}