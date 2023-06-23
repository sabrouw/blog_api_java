package com.blog_api_java.blog_api_java.Services.Implementations;

import org.springframework.stereotype.Service;

import com.blog_api_java.blog_api_java.Repository.UsersRepository;
import com.blog_api_java.blog_api_java.Services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UserService {
    private final UsersRepository repository;
}