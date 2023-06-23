package com.blog_api_java.blog_api_java.Services.Implementations;

import org.springframework.stereotype.Service;

import com.blog_api_java.blog_api_java.Repository.CategoryRepository;
import com.blog_api_java.blog_api_java.Services.CategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;
}