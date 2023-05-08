package com.arjunshaji.sample.spring.task.controller;

import com.arjunshaji.sample.spring.task.entity.Admin;
import com.arjunshaji.sample.spring.task.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    public Object saveAdmin(@RequestBody Admin admin){
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/get/{username}")
    public Optional<Admin> getAdminByUsername(@PathVariable String username){
        return adminService.getAdminByUsername(username);
    }
}
