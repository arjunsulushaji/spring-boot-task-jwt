package com.arjunshaji.sample.spring.task.config.JWT;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class JWTAuthenticationRequest {
    private String username;
    private String password;
}
