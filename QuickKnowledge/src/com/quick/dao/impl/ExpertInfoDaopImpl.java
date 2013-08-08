package com.quick.dao.impl;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.quick.dao.ExpertInfoEditDao;
import com.quick.entity.Expert;
import com.quick.entity.User;


public class ExpertInfoDaopImpl extends HibernateDaoSupport implements ExpertInfoEditDao{

	public Expert expertInfoEdit(Expert expert) {
		//保存用户修改的信息
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		BigDecimal userid  =new BigDecimal(22);
		BigDecimal expertid  =new BigDecimal(21);
		User user = (User) this.getHibernateTemplate().get(User.class,userid);
		Expert expert1 =(Expert) this.getHibernateTemplate().get(Expert.class,userid);
		System.out.println("asfas"+expert1);
		System.out.println("asfas"+expert.getFirstname());
		expert1.setFirstname(expert.getFirstname());
		expert1.setUser(user);
		 this.getHibernateTemplate().save(expert1);
		 return expert;
	}

}
