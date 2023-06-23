package com.blog_api_java.blog_api_java.Entity;

import java.util.List;

import javax.persistence.Column;
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
public class Users {

    @Id
    @GeneratedValue
    private Integer id;

    private String userName;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    private String password;

    private Integer zipCode;

    // Un user peux avoir plusieurs articles
    // @OneToMany(mappedBy = "articles")
    // private List<Articles> articles;

}