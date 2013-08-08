package com.quick.dao.impl;

import java.math.BigDecimal;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.quick.dao.EnterpriseRegisterDao;
import com.quick.entity.Enterprise;

import com.quick.entity.User;

public class EnterpriseRegisterDaoImpl extends HibernateDaoSupport implements EnterpriseRegisterDao {


	public boolean addUser(User user, Enterprise enterprise) {
		// TODO Auto-generated method stub

		BigDecimal a=new BigDecimal(0);
		user.setType(a);
		this.getHibernateTemplate().save(user);
		enterprise.setUser(user);
		this.getHibernateTemplate().save(enterprise);

        return true;
		
	}
}
