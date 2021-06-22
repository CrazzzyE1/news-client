package com.litvak.newsclient.services;

import com.litvak.newsclient.entities.NewsItem;
import com.litvak.newsclient.utilities.Utilities;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    private List<NewsItem> news = Utilities.getNews();

    public NewsServiceImpl() throws IOException {
    }

    @Override
    public NewsItem getRandomNewsItem() {
        return news.get((int) (Math.random() * (news.size())));
    }

    @Override
    public List<NewsItem> getAllNews() {
        return news;
    }
}
