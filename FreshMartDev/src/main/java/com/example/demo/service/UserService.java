package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Users;


@Service
public interface UserService {
  void createUser(Users user);
}
