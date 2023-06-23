package com.blog_api_java.blog_api_java.Dto;

import com.blog_api_java.blog_api_java.Entity.Category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CategoryDto {
    private String name;

    public static CategoryDto fromEntity(Category category) {
        return CategoryDto.builder()
                .name(category.getName())
                .build();
    }

    public static Category toEntity(CategoryDto category) {
        return Category.builder()
                .name(category.getName())
                .build();
    }
}