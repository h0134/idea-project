package com.JWT.JWT.service;

/* define all of the methods that we need to
have in the application so that to manage the users */

import com.JWT.JWT.domain.Role;
import com.JWT.JWT.domain.User;
import com.JWT.JWT.dto.RegistrationRequest;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();



}
