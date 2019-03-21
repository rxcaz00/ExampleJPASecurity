package com.uabc.database.example.examplejpa.model;

import com.uabc.database.example.examplejpa.entity.User;
import lombok.Data;

@Data
public class UserRoleModel {
    private Integer userRoleId;
    private User user;
    private String role;

    public UserRoleModel(){

    }

    public UserRoleModel(User user, String role) {
        this.user = user;
        this.role = role;
    }
}
