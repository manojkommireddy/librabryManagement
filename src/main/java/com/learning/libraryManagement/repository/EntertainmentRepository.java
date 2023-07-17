package com.learning.libraryManagement.repository;

import com.learning.libraryManagement.model.Entertainment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntertainmentRepository extends JpaRepository<Entertainment,Integer > {
}
