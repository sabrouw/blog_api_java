package com.blog_api_java.blog_api_java.Services.Implementations;

import org.springframework.stereotype.Service;

import com.blog_api_java.blog_api_java.Repository.ArticlesRepository;
import com.blog_api_java.blog_api_java.Services.ArticlesService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticlesServiceImpl implements ArticlesService {
    private final ArticlesRepository repository;
}