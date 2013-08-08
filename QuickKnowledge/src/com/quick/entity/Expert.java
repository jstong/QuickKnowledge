package com.quick.entity;
// default package

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * Expert entity. @author MyEclipse Persistence Tools
 */

public class Expert  implements java.io.Serializable {


    // Fields    

     private BigDecimal expertid;
     private User user;
     private String email;
     private String securityque;
     private String securityans;
     private String firstname;
     private String lastname;
     private String phone;
     private String adress;
     private String city;
     private String proince;
     private String postcode;
     private String introduce;
     private String experttype;
     private Set virtualTeams = new HashSet(0);
     private Set expertResponseBids = new HashSet(0);
     private Set newses = new HashSet(0);
     private Set expertBuiltTeams = new HashSet(0);
     private Set events = new HashSet(0);
     private Set rfpses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Expert() {
    }

	/** minimal constructor */
    public Expert(BigDecimal expertid, String email, String securityque, String securityans, String firstname, String lastname, String phone, String adress, String city, String proince, String postcode,  String introduce) {
        this.expertid = expertid;
        this.email = email;
        this.securityque = securityque;
        this.securityans = securityans;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.adress = adress;
        this.city = city;
        this.proince = proince;
        this.postcode = postcode;
        this.introduce = introduce;
    }
    
    /** full constructor */
    public Expert(BigDecimal expertid, User user, String email, String securityque, String securityans, String firstname, String lastname, String phone, String adress, String city, String proince, String postcode, String introduce, Set virtualTeams, Set expertResponseBids, Set newses, Set expertBuiltTeams, Set events, Set rfpses) {
        this.expertid = expertid;
        this.user = user;
        this.email = email;
        this.securityque = securityque;
        this.securityans = securityans;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.adress = adress;
        this.city = city;
        this.proince = proince;
        this.postcode = postcode;
        
        this.introduce = introduce;
        this.virtualTeams = virtualTeams;
        this.expertResponseBids = expertResponseBids;
        this.newses = newses;
        this.expertBuiltTeams = expertBuiltTeams;
        this.events = events;
        this.rfpses = rfpses;
    }

   
    // Property accessors

    public BigDecimal getExpertid() {
        return this.expertid;
    }
    
    public void setExpertid(BigDecimal expertid) {
        this.expertid = expertid;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecurityque() {
        return this.securityque;
    }
    
    public void setSecurityque(String securityque) {
        this.securityque = securityque;
    }

    public String getSecurityans() {
        return this.securityans;
    }
    
    public void setSecurityans(String securityans) {
        this.securityans = securityans;
    }

    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return this.adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getProince() {
        return this.proince;
    }
    
    public void setProince(String proince) {
        this.proince = proince;
    }

    public String getPostcode() {
        return this.postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    public String getIntroduce() {
        return this.introduce;
    }
    
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Set getVirtualTeams() {
        return this.virtualTeams;
    }
    
    public void setVirtualTeams(Set virtualTeams) {
        this.virtualTeams = virtualTeams;
    }

    public Set getExpertResponseBids() {
        return this.expertResponseBids;
    }
    
    public void setExpertResponseBids(Set expertResponseBids) {
        this.expertResponseBids = expertResponseBids;
    }

    public Set getNewses() {
        return this.newses;
    }
    
    public void setNewses(Set newses) {
        this.newses = newses;
    }

    public Set getExpertBuiltTeams() {
        return this.expertBuiltTeams;
    }
    
    public void setExpertBuiltTeams(Set expertBuiltTeams) {
        this.expertBuiltTeams = expertBuiltTeams;
    }

    public Set getEvents() {
        return this.events;
    }
    
    public void setEvents(Set events) {
        this.events = events;
    }

    public Set getRfpses() {
        return this.rfpses;
    }
    
    public void setRfpses(Set rfpses) {
        this.rfpses = rfpses;
    }

	public String getExperttype() {
		return experttype;
	}

	public void setExperttype(String experttype) {
		this.experttype = experttype;
	}
   








}