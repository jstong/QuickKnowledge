package com.quick.dao.impl;

import java.math.BigDecimal;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.quick.dao.ExpertRegisterDao;

import com.quick.entity.Expert;

import com.quick.entity.User;

public class ExpertRegisterDaoImpl extends HibernateDaoSupport implements ExpertRegisterDao {


	public boolean addUser(User user, Expert expert) {
		// TODO Auto-generated method stub
System.out.println("----");
		BigDecimal a=new BigDecimal(1);
		user.setType(a);
		this.getHibernateTemplate().save(user);
		expert.setUser(user);
		this.getHibernateTemplate().save(expert);
        return true;
		
	}
}
