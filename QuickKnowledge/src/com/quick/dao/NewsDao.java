package com.quick.dao;

import java.util.List;
import com.quick.entity.News;


public interface NewsDao {
	public boolean addNews(News news);
	public List<News> queryNews();//��ѯ�����б�
}
