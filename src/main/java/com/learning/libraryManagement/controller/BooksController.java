package com.learning.libraryManagement.controller;


import com.learning.libraryManagement.model.Books;
import com.learning.libraryManagement.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {
    @Autowired
    BooksService booksservice;

    @PostMapping("/saveMultipleBooks")
    public List<Books> createBooks(@RequestBody List<Books> books) {
        return booksservice.createBooks(books);
    }

    @GetMapping("/getAllBooks")
    public List<Books> getBooks() {
        return booksservice.getBooks();
    }


}
