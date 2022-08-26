package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(long id);
    User getUserById(long id);

    User findByUsername(String username);
    void updateUser(User user);

    void addDefaultUser(User user);
}
