package web.service;

import java.util.List;

import web.models.User;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);

    void delete(int id);

    void edit(int id, User editUser);

    User getById(int id);
}

