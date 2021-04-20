package com.vastika.uim.service;

import com.vastika.uim.model.Role;
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
        Role role = new Role();
        role.setId(2);
        role.setRoleName("Role_User");
        user.setRole(role);
        userRepository.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        Role role = new Role();
        role.setId(2);
        role.setRoleName("Role_User");
        user.setRole(role);
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

    @Override
    public User searchUserByEmail(String email) {
        return userRepository.searchUserByEmail(email);
    }
}
