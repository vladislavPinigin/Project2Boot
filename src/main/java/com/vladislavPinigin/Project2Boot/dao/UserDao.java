package com.vladislavPinigin.Project2Boot.dao;


import com.vladislavPinigin.Project2Boot.model.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserDao {

    void addUser(User user);

    User getUser(long id);

    List<User> getUsers();

    void updateUser(User user);

    void deleteUser(long id);
}
