package com.vastika.uim.service;

import com.vastika.uim.model.User;
import com.vastika.uim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    @Override
    public User searchUserById(int id) {
        return userRepository.searchUserById(id);
    }

    @Override
    public List<User> getAllUser() {
       return userRepository.getAllUser();

    }
}
