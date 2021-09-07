package com.aique.springbootdemo.service;

import com.aique.springbootdemo.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUser(Long id);

    boolean saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(Long id);
}
