package com.learning.libraryManagement.service;

import com.learning.libraryManagement.model.Entertainment;
import com.learning.libraryManagement.repository.EntertainmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntertainmentService {
    @Autowired
    EntertainmentRepository entertainmentRepository;

    public List<Entertainment> saveMultipleEntertainments(List<Entertainment> entertainment){

        entertainmentRepository.saveAll(entertainment);
        return entertainment;
    }

    public List<Entertainment> getEntertainment(){

        return entertainmentRepository.findAll( );


    }



}
