package com.example.usermanager.service;

import com.example.usermanager.model.User;
import com.example.usermanager.repository.IUserRepository;
import com.example.usermanager.repository.UserRepository;

import java.util.Collections;
import java.util.List;

public class UserService implements IUserService {

    private IUserRepository userRepository=new UserRepository();
    @Override
    public void save(User user) {
        //
        userRepository.save(user);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean delete(int id) {
        return userRepository.delete(id);
    }

    @Override
    public boolean update(User user) {
        return userRepository.update(user);
    }
}
