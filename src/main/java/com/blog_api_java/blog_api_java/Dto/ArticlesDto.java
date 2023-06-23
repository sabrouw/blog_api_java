package com.blog_api_java.blog_api_java.Dto;

import java.time.LocalDateTime;

import com.blog_api_java.blog_api_java.Entity.Articles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ArticlesDto {

    private String title;

    private LocalDateTime createdAt;

    private String content;

    public static ArticlesDto fromEntity(Articles articles) {
        return ArticlesDto.builder()
                .title(articles.getTitle())
                .createdAt(articles.getCreatedAt())
                .content(articles.getContent())
                .build();
    }

    public static Articles toEntity(ArticlesDto articles) {
        return Articles.builder()
                .title(articles.getTitle())
                .createdAt(articles.getCreatedAt())
                .content(articles.getContent())
                .build();
    }
}