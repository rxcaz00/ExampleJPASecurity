package com.uabc.database.example.examplejpa.components;

import com.uabc.database.example.examplejpa.entity.UserRole;
import com.uabc.database.example.examplejpa.model.UserRoleModel;
import org.springframework.stereotype.Component;

@Component("userRoleConverter")
public class UserRoleConverter {
    public UserRole convertUserRoleModel2UserRole(UserRoleModel userRoleModel) {
        UserRole userRole = new UserRole();
        userRole.setRole(userRoleModel.getRole());
        userRole.setUser(userRoleModel.getUser());
        userRole.setUserRoleId(userRoleModel.getUserRoleId());
        return userRole;
    }

    public UserRoleModel convertUserRole2UserRoleModel(UserRole userRole) {
        UserRoleModel userRoleModel = new UserRoleModel();
        userRoleModel.setRole(userRole.getRole());
        userRoleModel.setUser(userRole.getUser());
        userRoleModel.setUserRoleId(userRole.getUserRoleId());
        return userRoleModel;
    }
}
