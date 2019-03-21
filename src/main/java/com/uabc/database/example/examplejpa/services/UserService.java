package com.uabc.database.example.examplejpa.services;

import com.uabc.database.example.examplejpa.entity.User;
import com.uabc.database.example.examplejpa.model.UserModel;

import java.util.List;

public interface UserService {
    public abstract UserModel addUser(UserModel userModel);

    public abstract List<UserModel> listAllUsers();

    public abstract User findUserById(int id);

    public abstract void removeUser(int id);

    public abstract UserModel findUserByIdModel(int id);
}
