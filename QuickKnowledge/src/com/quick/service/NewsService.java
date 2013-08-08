package com.quick.service;



import java.util.List;

import com.quick.entity.News;




public interface NewsService {

	public boolean addNews(News news);
	public List<News> queryNews();
}
