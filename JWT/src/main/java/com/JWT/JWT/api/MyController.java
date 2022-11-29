package com.JWT.JWT.api;

import com.JWT.JWT.domain.User;
import com.JWT.JWT.dto.LoginRequest;
import com.JWT.JWT.dto.RegistrationRequest;
import com.JWT.JWT.filter.CustomAuthenticationFilter;
import com.JWT.JWT.service.RegistrationService;
import com.JWT.JWT.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/h1")
public class MyController {
    private final RegistrationService registrationService;


    public MyController(RegistrationService registrationService) {
        this.registrationService = registrationService;
//        this.authenticationManager=authenticationManager;
//        this.customAuthenticationFilter=customAuthenticationFilter;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping("/confirm")
    public String confirm(@RequestParam("token") String token) {

        return registrationService.confirmToken(token);
    }




}