package com.gojodev.spring_mvc.dao;

import com.gojodev.spring_mvc.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    User getUserById(long id);
    void updateUser(User user);
    void removeUserById(long id);
    List<User> getAllUsers();
}
