package com.blog_api_java.blog_api_java.Dto;

import com.blog_api_java.blog_api_java.Entity.Users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UsersDto {

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Integer zipCode;

    public static UsersDto fromEntity(Users users) {
        return UsersDto.builder()
                .firstName(users.getFirstName())
                .lastName(users.getLastName())
                .email(users.getEmail())
                .password(users.getPassword())
                .build();
    }

    public static Users toEntity(UsersDto users) {
        return Users.builder()
                .firstName(users.getFirstName())
                .lastName(users.getLastName())
                .email(users.getEmail())
                .password(users.getPassword())
                .build();
    }

}