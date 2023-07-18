package com.learning.libraryManagement.controller;

import com.learning.libraryManagement.model.Users;
import com.learning.libraryManagement.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class UsersController {
    @Autowired
    UsersService usersService;

    @PostMapping("/createUsers")
    public List<Users> createMultipleUserList(@RequestBody List<Users> userList) {
        return usersService.createUsers(userList);
    }

    @GetMapping("/getallUsers")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteUserById(@PathVariable Long id){
        usersService.deleteByUsersId(id);
    }
}
