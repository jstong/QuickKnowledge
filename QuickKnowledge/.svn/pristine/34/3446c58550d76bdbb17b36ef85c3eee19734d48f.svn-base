package com.quick.action;


import com.quick.entity.Event;

import com.quick.service.EventService;


public class EventAction {
	Event event=new Event();
	EventService eventService;
	public String AddEvent() {
        boolean ret = eventService.addEvent(event);
		if (ret) {
			
			return "registerSucc";
		}
			return "registerError";
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public EventService getEventService() {
		return eventService;
	}
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

}
