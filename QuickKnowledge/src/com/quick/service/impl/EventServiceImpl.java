package com.quick.service.impl;


import com.quick.dao.EventDao;



import com.quick.entity.Event;



import com.quick.service.EventService;


public class EventServiceImpl implements EventService {

	private EventDao eventDao;




	public EventDao getEventDao() {
		return eventDao;
	}




	public void setEventDao(EventDao eventDao) {
		this.eventDao = eventDao;
	}




	public boolean addEvent(Event event) {
		// TODO Auto-generated method stub
		return eventDao.addEvent(event);
	}

}
