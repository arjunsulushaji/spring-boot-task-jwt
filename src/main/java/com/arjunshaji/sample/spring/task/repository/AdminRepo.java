package com.arjunshaji.sample.spring.task.repository;

import com.arjunshaji.sample.spring.task.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.DoubleStream;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {
    Optional<Admin> findByUsername(String username);
}
