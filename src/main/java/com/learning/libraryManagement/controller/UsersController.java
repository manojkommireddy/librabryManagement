package com.learning.libraryManagement.controller;

import com.learning.libraryManagement.model.Users;
import com.learning.libraryManagement.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UsersService usersService;

    @PostMapping("/createMultipleStudents")

    public List<Users> createMultipleUserList(@RequestBody List<Users> createMultiple) {
        return usersService.createMultipleUsers(createMultiple);
    }

    @GetMapping("/getMultipleUsers")
    public List<Users> getMultipleUserList() {
        return usersService.getAllUsers();

    }
}
