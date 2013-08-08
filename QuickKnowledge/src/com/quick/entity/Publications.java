package com.quick.entity;
// default package

import java.math.BigDecimal;
import java.util.Date;


/**
 * Publications entity. @author MyEclipse Persistence Tools
 */

public class Publications  implements java.io.Serializable {


    // Fields    

     private BigDecimal publicationid;
     private BigDecimal expertid;
     private String title;
     private String author;
     private BigDecimal type;
     private String introduce;
     private Date pubdate;
     private Double price;
     private BigDecimal ctr;


    // Constructors

    /** default constructor */
    public Publications() {
    }

	/** minimal constructor */
    public Publications(BigDecimal publicationid, String title, String author, BigDecimal type, String introduce, Date pubdate, Double price, BigDecimal ctr) {
        this.publicationid = publicationid;
        this.title = title;
        this.author = author;
        this.type = type;
        this.introduce = introduce;
        this.pubdate = pubdate;
        this.price = price;
        this.ctr = ctr;
    }
    
    /** full constructor */
    public Publications(BigDecimal publicationid, BigDecimal expertid, String title, String author, BigDecimal type, String introduce, Date pubdate, Double price, BigDecimal ctr) {
        this.publicationid = publicationid;
        this.expertid = expertid;
        this.title = title;
        this.author = author;
        this.type = type;
        this.introduce = introduce;
        this.pubdate = pubdate;
        this.price = price;
        this.ctr = ctr;
    }

   
    // Property accessors

    public BigDecimal getPublicationid() {
        return this.publicationid;
    }
    
    public void setPublicationid(BigDecimal publicationid) {
        this.publicationid = publicationid;
    }

    public BigDecimal getExpertid() {
        return this.expertid;
    }
    
    public void setExpertid(BigDecimal expertid) {
        this.expertid = expertid;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getType() {
        return this.type;
    }
    
    public void setType(BigDecimal type) {
        this.type = type;
    }

    public String getIntroduce() {
        return this.introduce;
    }
    
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Date getPubdate() {
        return this.pubdate;
    }
    
    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public BigDecimal getCtr() {
        return this.ctr;
    }
    
    public void setCtr(BigDecimal ctr) {
        this.ctr = ctr;
    }
   








}