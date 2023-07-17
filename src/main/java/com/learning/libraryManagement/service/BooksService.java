package com.learning.libraryManagement.service;


import com.learning.libraryManagement.model.Books;
import com.learning.libraryManagement.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BooksService {
    @Autowired
    BooksRepository booksRepository;
    public List<Books> getBooks(List<Books> books){

       this.booksRepository.saveAll(books);




return books;

    }
}
