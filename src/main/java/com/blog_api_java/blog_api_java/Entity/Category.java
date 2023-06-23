package com.blog_api_java.blog_api_java.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Category {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    // // Une catégories peut avoir plusieurs articles
    // @OneToMany(mappedBy = "category")
    // private List<Articles> articles;

}