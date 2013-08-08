package com.quick.service.impl;

import com.quick.dao.EnerpriseInfoEditDao;
import com.quick.dao.ExpertInfoEditDao;
import com.quick.entity.Enterprise;
import com.quick.entity.Expert;
import com.quick.service.EnterpriseInfoEditService;
import com.quick.service.ExpertInfoEditService;

public class EnterprisetInfoEditSerivceImpl implements EnterpriseInfoEditService {
	private EnerpriseInfoEditDao enterInfoEditDao;


	public Enterprise exnterInfoEdit(Enterprise enter) {
		// TODO Auto-generated method stub
		return enterInfoEditDao.enterInfoEdit(enter);
	}

	

	

	
}
