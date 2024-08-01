package com.example.usermanager.service;

import com.example.usermanager.model.User;

import java.util.List;

public interface IUserService {
    public void save(User user);

    public User findById(int id);

    public List<User> findAll();

    public boolean delete(int id);

    public boolean update(User user);
}
