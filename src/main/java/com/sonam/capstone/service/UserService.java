package com.sonam.capstone.service;

import com.sonam.capstone.model.User;

public interface UserService {

 public User findUserByEmail(String email);

 public void saveUser(User user);
}