package com.aique.db.jdbc.dao;

import com.aique.db.jdbc.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

     Optional<User> getUser(Long id);

     Optional<User> getUserByName(String name);

     List<User> getUsers(Long id);

     int addUser(User user);

     void updateUser(User user);

     void deleteUser(Long id);
}
