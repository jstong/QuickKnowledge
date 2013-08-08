package com.quick.dao.impl;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.quick.dao.ExpertInfoEditDao;
import com.quick.entity.Enterprise;
import com.quick.entity.Expert;
import com.quick.entity.User;
import com.quick.service.EnterpriseInfoEditService;


public class EnterpriseInfoDaopImpl extends HibernateDaoSupport implements EnterpriseInfoEditService{

	

	public Enterprise exnterInfoEdit(Enterprise enter) {
		//�����û��޸ĵ���Ϣ
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		BigDecimal userid  =new BigDecimal(1);
		User user = (User) this.getHibernateTemplate().get(User.class,userid);
		//todo Ӧ�ø����û���¼����޸���Ϣ
		Enterprise expert1 =(Enterprise) this.getHibernateTemplate().get(Enterprise.class,userid);
		expert1.setAdress(enter.getAdress());
		
		 this.getHibernateTemplate().save(expert1);
		 return enter;
	}

	

}
