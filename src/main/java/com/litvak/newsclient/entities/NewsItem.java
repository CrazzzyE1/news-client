package com.litvak.newsclient.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class NewsItem {

    private String title;
    private String description;
    private String url;
    private String urlToImage;

}
