package com.quick.dao.impl;



import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Property;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.quick.dao.NewsDao;

import com.quick.entity.Expert;
import com.quick.entity.News;

public class NewsDaoImpl extends HibernateDaoSupport implements NewsDao {

	public boolean addNews(News news) {
		BigDecimal a=new BigDecimal(0);
		BigDecimal b=new BigDecimal(4);
		Expert expert=(Expert) this.getHibernateTemplate().get(Expert.class,b);
		System.out.println(expert.getExpertid()+"---");
		news.setExpert(expert);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date posted = sdf.parse(sdf.format(new Date()));
		news.setPosted(posted);
	    news.setCtr(a);
		this.getHibernateTemplate().save(news);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public List<News> queryNews() {
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		System.out.println("session"+session);
		Criteria criteria = session.createCriteria(News.class).
		addOrder(Property.forName("posted").desc());
		session.createSQLQuery("from News");
		List<News> list2 = criteria.list();
		return list2;
		
	}

}
