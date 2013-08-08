package com.quick.service.impl;

import com.quick.dao.ExpertInfoEditDao;
import com.quick.entity.Expert;
import com.quick.service.ExpertInfoEditService;

public class ExpertInfoEditSerivceImpl implements ExpertInfoEditService {
	private ExpertInfoEditDao expertInfoEditDao;

	public Expert expertInfoEdit(Expert expert) {
		return expertInfoEditDao.expertInfoEdit(expert);
	}

	public ExpertInfoEditDao getExpertInfoEditDao() {
		return expertInfoEditDao;
	}

	public void setExpertInfoEditDao(ExpertInfoEditDao expertInfoEditDao) {
		this.expertInfoEditDao = expertInfoEditDao;
	}

	

	

	
}
