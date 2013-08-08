package com.quick.action;

import com.opensymphony.xwork2.ActionContext;
import com.quick.common.Constant;
import com.quick.entity.Expert;

import com.quick.entity.User;


import com.quick.service.ExpertRegisterService;


public class ExpertRegisterAction {
	User user=new User();
	Expert expert = new Expert();
	ExpertRegisterService expertregisterService;
	public String register() {
        boolean ret = expertregisterService.addUser(user,expert);
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

	public Expert getExpert() {
		return expert;
	}

	public void setExpert(Expert expert) {
		this.expert = expert;
	}

	public ExpertRegisterService getExpertregisterService() {
		return expertregisterService;
	}

	public void setExpertregisterService(ExpertRegisterService expertregisterService) {
		this.expertregisterService = expertregisterService;
	}


}
