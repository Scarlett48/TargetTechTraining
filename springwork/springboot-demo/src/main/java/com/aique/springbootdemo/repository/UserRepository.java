package com.aique.springbootdemo.repository;

import com.aique.springbootdemo.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getUsers();

    User getUser(Long id);

    boolean saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(Long id);
}
