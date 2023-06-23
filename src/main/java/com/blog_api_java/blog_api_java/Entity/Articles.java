//dans les entity on reporte tout ce qui a de notre bdd
package com.blog_api_java.blog_api_java.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class Articles {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private LocalDateTime createdAt;

    private String content;

    // un article peut avoir une seule catégorie
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    // Un article ne peut avoir qu'un seul utilsateur
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users user;

}