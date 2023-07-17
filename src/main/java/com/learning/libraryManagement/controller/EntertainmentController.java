package com.learning.libraryManagement.controller;

import com.learning.libraryManagement.model.Entertainment;
import com.learning.libraryManagement.service.EntertainmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntertainmentController {
    @Autowired

    EntertainmentService entertainmentService;
    @PostMapping("/saveMultipleEntertainments")
    public List<Entertainment> saveMultipleEntertainments(@RequestBody List<Entertainment> entertainment){

        return entertainmentService.saveMultipleEntertainments(entertainment);
    }
    @GetMapping("/getEntertainment")
    public List<Entertainment> getEntertainment(){

        return entertainmentService.getEntertainment();
    }

}
