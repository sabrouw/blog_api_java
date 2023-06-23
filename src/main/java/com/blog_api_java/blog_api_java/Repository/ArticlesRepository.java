package com.blog_api_java.blog_api_java.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_api_java.blog_api_java.Entity.Articles;

public interface ArticlesRepository extends JpaRepository<Articles, Integer> {
    // List<Articles> findAllByTitle();
}