package com.quick.entity;
// default package

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * VirtualTeam entity. @author MyEclipse Persistence Tools
 */

public class VirtualTeam  implements java.io.Serializable {


    // Fields    

     private BigDecimal teamid;
     private Expert expert;
     private String teamname;
     private String note;
     private Date builtdate;
     private Set expertBuiltTeams = new HashSet(0);


    // Constructors

    /** default constructor */
    public VirtualTeam() {
    }

	/** minimal constructor */
    public VirtualTeam(BigDecimal teamid, String teamname, String note, Date builtdate) {
        this.teamid = teamid;
        this.teamname = teamname;
        this.note = note;
        this.builtdate = builtdate;
    }
    
    /** full constructor */
    public VirtualTeam(BigDecimal teamid, Expert expert, String teamname, String note, Date builtdate, Set expertBuiltTeams) {
        this.teamid = teamid;
        this.expert = expert;
        this.teamname = teamname;
        this.note = note;
        this.builtdate = builtdate;
        this.expertBuiltTeams = expertBuiltTeams;
    }

   
    // Property accessors

    public BigDecimal getTeamid() {
        return this.teamid;
    }
    
    public void setTeamid(BigDecimal teamid) {
        this.teamid = teamid;
    }

    public Expert getExpert() {
        return this.expert;
    }
    
    public void setExpert(Expert expert) {
        this.expert = expert;
    }

    public String getTeamname() {
        return this.teamname;
    }
    
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Date getBuiltdate() {
        return this.builtdate;
    }
    
    public void setBuiltdate(Date builtdate) {
        this.builtdate = builtdate;
    }

    public Set getExpertBuiltTeams() {
        return this.expertBuiltTeams;
    }
    
    public void setExpertBuiltTeams(Set expertBuiltTeams) {
        this.expertBuiltTeams = expertBuiltTeams;
    }
   








}