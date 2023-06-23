package com.blog_api_java.blog_api_java.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_api_java.blog_api_java.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    // List<Category> findAllByName();
}