package com.quick.action;

import com.opensymphony.xwork2.ActionContext;
import com.quick.common.Constant;
import com.quick.entity.Enterprise;

import com.quick.entity.User;

import com.quick.service.EnterpriseRegisterService;


public class EnterpriseRegisterAction {
	User user=new User();
	Enterprise enterprise = new Enterprise();
	EnterpriseRegisterService registerService;
	public String register() {
        System.out.println(user.getUsername()+"---"+enterprise.getAdress()+"--"+enterprise.getEnterprisename());	
        boolean ret = registerService.addUser(user,enterprise);
		if (ret) {
			ActionContext.getContext().getSession().put(Constant.UserName,
					user.getUsername());
			return "registerSucc";
		}
			return "registerError";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public EnterpriseRegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(EnterpriseRegisterService registerService) {
		this.registerService = registerService;
	}
}
