package com.learning.libraryManagement.repository;
import com.learning.libraryManagement.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
