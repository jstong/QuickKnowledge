package com.quick.service.impl;

import com.quick.dao.EnterpriseRegisterDao;
import com.quick.entity.Enterprise;

import com.quick.entity.User;
import com.quick.service.EnterpriseRegisterService;


public class EnterpriseRegisterServiceImpl implements EnterpriseRegisterService {
	
	private EnterpriseRegisterDao registerDao;
	
	public EnterpriseRegisterDao getRegisterDao() {
		return registerDao;
	}

	public void setRegisterDao(EnterpriseRegisterDao registerDao) {
		this.registerDao = registerDao;
	}

	public boolean addUser(User user, Enterprise enterprise) {
		// TODO Auto-generated method stub
		return registerDao.addUser(user,enterprise);
	}


}
