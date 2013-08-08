package com.quick.dao;

import com.quick.entity.Enterprise;
import com.quick.entity.User;



public interface EnterpriseRegisterDao {
	public boolean addUser(User user,Enterprise enterprise);
}
