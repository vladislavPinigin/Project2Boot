package com.vladislavPinigin.Project2Boot.service;



import com.vladislavPinigin.Project2Boot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(long id);

    List<User> getUsers();

    void updateUser(User user);

    void deleteUser(long id);
}
