package com.learning.libraryManagement.service;

import com.learning.libraryManagement.model.Users;
import com.learning.libraryManagement.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;
    public List<Users> createMultipleUsers(List<Users> multipleUsers){
        return usersRepository.saveAll(multipleUsers);

    }
    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }



}
