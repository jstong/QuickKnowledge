package com.quick.entity;
// default package

import java.math.BigDecimal;


/**
 * ExpertResponseBidId entity. @author MyEclipse Persistence Tools
 */

public class ExpertResponseBidId  implements java.io.Serializable {


    // Fields    

     private String resid;
     private BigDecimal expertid;


    // Constructors

    /** default constructor */
    public ExpertResponseBidId() {
    }

    
    /** full constructor */
    public ExpertResponseBidId(String resid, BigDecimal expertid) {
        this.resid = resid;
        this.expertid = expertid;
    }

   
    // Property accessors

    public String getResid() {
        return this.resid;
    }
    
    public void setResid(String resid) {
        this.resid = resid;
    }

    public BigDecimal getExpertid() {
        return this.expertid;
    }
    
    public void setExpertid(BigDecimal expertid) {
        this.expertid = expertid;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ExpertResponseBidId) ) return false;
		 ExpertResponseBidId castOther = ( ExpertResponseBidId ) other; 
         
		 return ( (this.getResid()==castOther.getResid()) || ( this.getResid()!=null && castOther.getResid()!=null && this.getResid().equals(castOther.getResid()) ) )
 && ( (this.getExpertid()==castOther.getExpertid()) || ( this.getExpertid()!=null && castOther.getExpertid()!=null && this.getExpertid().equals(castOther.getExpertid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getResid() == null ? 0 : this.getResid().hashCode() );
         result = 37 * result + ( getExpertid() == null ? 0 : this.getExpertid().hashCode() );
         return result;
   }   





}