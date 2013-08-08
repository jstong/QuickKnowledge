package com.quick.action;

import java.util.List;

import com.quick.entity.News;

import com.quick.service.NewsService;

public class NewsAction {
	News news = new News();
	NewsService newsService;
	List<News> newsList;// 新闻集合

	public String AddNews() {
		boolean ret = newsService.addNews(news);
		if (ret) {

			return "registerSucc";
		}
		return "registerError";
	}

	public String queryNews() {
		newsList = newsService.queryNews();
		if (newsList != null)
			return "queryNews";
		else
			return "noData";
	}
	public String newsDetails(){
		newsList = newsService.queryNews();
		if(newsList!=null)
			return "newsDetails";
		else
			return "noData";
	}
	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}
}
