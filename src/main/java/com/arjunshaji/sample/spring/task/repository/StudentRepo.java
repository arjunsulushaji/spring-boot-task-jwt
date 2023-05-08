package com.arjunshaji.sample.spring.task.repository;

import com.arjunshaji.sample.spring.task.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
}
