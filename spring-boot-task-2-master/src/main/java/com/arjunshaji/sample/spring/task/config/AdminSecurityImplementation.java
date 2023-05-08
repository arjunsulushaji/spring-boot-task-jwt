package com.arjunshaji.sample.spring.task.config;

import com.arjunshaji.sample.spring.task.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class AdminSecurityImplementation implements UserDetailsService {

    @Autowired
    private AdminRepo adminRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return adminRepo.findByUsername(username).map(AdminSecurityConfig::new)
                .orElseThrow(()-> new UsernameNotFoundException("No User Found"));
    }
}
