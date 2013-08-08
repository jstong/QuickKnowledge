package com.quick.service.impl;

import java.util.List;

import com.quick.dao.NewsDao;

import com.quick.entity.News;

import com.quick.service.NewsService;

public class NewsServiceImpl implements NewsService {

	private NewsDao newsDao;

	public NewsDao getNewsDao() {
		return newsDao;
	}
	/**
	 * ≤È—Ø–¬Œ≈
	 */
	public List<News> queryNews() {
		return newsDao.queryNews();
	}

	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public boolean addNews(News news) {
		// TODO Auto-generated method stub
		return newsDao.addNews(news);
	}

}
