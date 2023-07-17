package com.learning.libraryManagement.controller;

import com.learning.libraryManagement.model.Staff;
import com.learning.libraryManagement.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping("/getALlStaffDetails")
    public List<Staff> getAllStaffInfo() {
        return staffService.getAllStaffDetails();
    }

    @PostMapping("/saveAllStaffDetails")

    public List<Staff> saveAllStaffInfo(@RequestBody List<Staff> staffList) {
        return staffService.saveAllStaffDetails(staffList);
    }
}
