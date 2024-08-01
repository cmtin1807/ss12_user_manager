package com.example.usermanager.repository;

import com.example.usermanager.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    public void save(User user);

    public User findById(int id);

    public List<User> findAll();

    public boolean delete(int id);

    public boolean update(User user);
}
