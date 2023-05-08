package com.arjunshaji.sample.spring.task.controller;

import com.arjunshaji.sample.spring.task.entity.Student;
import com.arjunshaji.sample.spring.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student added successfully......";
    }

    @GetMapping("/get/{id}")
    public Object getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/update/{id}")
    public Object updateStudentById(@PathVariable Long id,@RequestBody Student student){
        return studentService.updateStudentById(id,student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }
}
