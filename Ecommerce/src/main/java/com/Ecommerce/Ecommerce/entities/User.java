package com.Ecommerce.Ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /* common attributes of customers and sellers are kept here */

            Long id;
    String email;
    String firstName;
    String lastName;

    @JsonIgnore
    String password;
    String address1;
    String address2;
    String address3;
    /*
        The field verificationCode stores a random, unique String which is generated in
        the registration process and will be used in the verification process.
        Once registered, the enabled status of a user is false (disabled) so the user
        can’t login if he has not activated account
        by checking email and click on the verification link embedded in the email.
        private String verificationCode; */

    @Column(name = "verification_code", length = 64, updatable = false)
    private String verificationCode;
    private boolean isEnabled;


}

