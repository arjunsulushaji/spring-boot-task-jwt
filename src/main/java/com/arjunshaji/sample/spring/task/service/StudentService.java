package com.arjunshaji.sample.spring.task.service;

import com.arjunshaji.sample.spring.task.entity.Student;
import com.arjunshaji.sample.spring.task.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    public Object getStudentById(Long id) {
        Optional<Student> student = studentRepo.findById(id);
        if(student.isPresent()){
            return studentRepo.findById(id);
        } else {
            return "Student not found in the given ID.........";
        }
    }

    public Object updateStudentById(Long id, Student student) {
        Optional<Student> student1 = studentRepo.findById(id);
        if(student1.isPresent()){

            if (Objects.nonNull(student.getName()) && !"".equalsIgnoreCase(student.getName())) {
                student1.get().setName(student.getName());
            }
            if (Objects.nonNull(student.getAge()) && !"".equalsIgnoreCase(student.getAge())) {
                student1.get().setAge(student.getAge());
            }
            if (Objects.nonNull(student.getDepartment()) && !"".equalsIgnoreCase(student.getDepartment())) {
                student1.get().setDepartment(student.getDepartment());
            }
            if (Objects.nonNull(student.getMark()) && !"".equalsIgnoreCase(student.getMark())) {
                student1.get().setMark(student.getMark());
            }
            Student student2 = student1.get();
            return studentRepo.save(student2);
        } else {
            return "Student not found in the given ID.........";
        }
    }

    public String deleteStudentById(Long id) {
        Optional<Student> student = studentRepo.findById(id);
        if(student.isPresent()){
            studentRepo.deleteById(id);
            return "Student deleted successfully........";
        } else {
            return "Student not found in the given ID.........";
        }
    }
}
