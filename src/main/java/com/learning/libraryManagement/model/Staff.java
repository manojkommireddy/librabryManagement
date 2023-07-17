package com.learning.libraryManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity

public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String firstName;
    String lastName;
    String userName;
    String password;
    String email;
    Long phoneNumber;
    String role;
    Double salary;
    Date hireDate;
    Date resignDate;
}
