package com.quick.entity;
// default package

import java.math.BigDecimal;


/**
 * ExpertBuiltTeamId entity. @author MyEclipse Persistence Tools
 */

public class ExpertBuiltTeamId  implements java.io.Serializable {


    // Fields    

     private BigDecimal expertid;
     private BigDecimal teamid;


    // Constructors

    /** default constructor */
    public ExpertBuiltTeamId() {
    }

    
    /** full constructor */
    public ExpertBuiltTeamId(BigDecimal expertid, BigDecimal teamid) {
        this.expertid = expertid;
        this.teamid = teamid;
    }

   
    // Property accessors

    public BigDecimal getExpertid() {
        return this.expertid;
    }
    
    public void setExpertid(BigDecimal expertid) {
        this.expertid = expertid;
    }

    public BigDecimal getTeamid() {
        return this.teamid;
    }
    
    public void setTeamid(BigDecimal teamid) {
        this.teamid = teamid;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ExpertBuiltTeamId) ) return false;
		 ExpertBuiltTeamId castOther = ( ExpertBuiltTeamId ) other; 
         
		 return ( (this.getExpertid()==castOther.getExpertid()) || ( this.getExpertid()!=null && castOther.getExpertid()!=null && this.getExpertid().equals(castOther.getExpertid()) ) )
 && ( (this.getTeamid()==castOther.getTeamid()) || ( this.getTeamid()!=null && castOther.getTeamid()!=null && this.getTeamid().equals(castOther.getTeamid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getExpertid() == null ? 0 : this.getExpertid().hashCode() );
         result = 37 * result + ( getTeamid() == null ? 0 : this.getTeamid().hashCode() );
         return result;
   }   





}