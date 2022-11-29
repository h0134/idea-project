package com.Ecommerce.Ecommerce.dto;


import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    String phone;

    @Email
    private String email;

    @NotNull
    private String password;




}
