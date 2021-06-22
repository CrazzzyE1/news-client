package com.litvak.newsclient.services;

import com.litvak.newsclient.entities.NewsItem;

import java.util.List;

public interface NewsService {
    NewsItem getRandomNewsItem();
    List<NewsItem> getAllNews();

}
