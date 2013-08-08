package com.quick.dao.impl;



import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.quick.dao.EventDao;
import com.quick.entity.Event;
import com.quick.entity.Expert;


public class EventDaoImpl extends HibernateDaoSupport implements EventDao {

	public boolean addEvent(Event event) {
		BigDecimal a=new BigDecimal(0);
		BigDecimal b=new BigDecimal(41);
		Expert expert=(Expert) this.getHibernateTemplate().get(Expert.class,b);
		System.out.println(expert.getExpertid()+"EventDao");
		event.setExpert(expert);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date posted = sdf.parse(sdf.format(new Date()));
			event.setPosted(posted);
			event.setDate(posted);
			event.setCtr(a);
		this.getHibernateTemplate().save(event);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
