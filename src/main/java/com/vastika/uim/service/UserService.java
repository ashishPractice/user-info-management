package com.vastika.uim.service;

import com.vastika.uim.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User searchUserById(int id);

    List<User> getAllUser();
}
