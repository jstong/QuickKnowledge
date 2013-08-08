package com.quick.action;

import com.opensymphony.xwork2.ActionSupport;
import com.quick.entity.Enterprise;
import com.quick.entity.Expert;
import com.quick.service.EnterpriseInfoEditService;
import com.quick.service.ExpertInfoEditService;


public class EnterpriseInfoEditAction extends ActionSupport{

	Enterprise enter;
	EnterpriseInfoEditService exterInfoEditService;
	
	public String expertInfoEdit(){
		exterInfoEditService.exnterInfoEdit(enter);
		return "success";
	}

	public Enterprise getEnter() {
		return enter;
	}

	public void setEnter(Enterprise enter) {
		this.enter = enter;
	}

	public EnterpriseInfoEditService getExterInfoEditService() {
		return exterInfoEditService;
	}

	public void setExterInfoEditService(
			EnterpriseInfoEditService exterInfoEditService) {
		this.exterInfoEditService = exterInfoEditService;
	}




}
