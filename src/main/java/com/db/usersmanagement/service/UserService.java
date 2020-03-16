package com.db.usersmanagement.service;

import com.db.usersmanagement.entity.Users;

import java.util.List;

public interface UserService {

    void createUsers(Users users);

    List<Users> findAll();

    Users findById(Long userId);

    List<Users> findAllByName(String name);

    List<Users> findWhereEmailIsGmail();

    List<Users> findWhereNameStartsFromSmith();
}
