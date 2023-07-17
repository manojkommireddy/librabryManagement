package com.learning.libraryManagement.service;
import com.learning.libraryManagement.model.Staff;
import com.learning.libraryManagement.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository;
    public List<Staff> saveAllStaffDetails(List<Staff> staffList) {
        staffRepository.saveAll(staffList);
        return staffList;
    }
    public List<Staff> getAllStaffDetails() {
        return staffRepository.findAll();
    }
}
