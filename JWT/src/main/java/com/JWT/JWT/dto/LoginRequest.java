package com.JWT.JWT.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequest{
    private String password;
    private String username;
}