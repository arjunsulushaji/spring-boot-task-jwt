package com.arjunshaji.sample.spring.task.service;

import com.arjunshaji.sample.spring.task.entity.Admin;
import com.arjunshaji.sample.spring.task.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Object saveAdmin(Admin admin) {
        Optional<Admin> admin1 = adminRepo.findByUsername(admin.getUsername());
        if(admin1.isPresent()){
            return "Admin is already registered........";
        } else {
            admin.setPassword(passwordEncoder.encode(admin.getPassword()));
            adminRepo.save(admin);
            return "Admin registered successful.......";
        }
    }

    public Optional<Admin> getAdminByUsername(String username) {
        return adminRepo.findByUsername(username);
    }
}
