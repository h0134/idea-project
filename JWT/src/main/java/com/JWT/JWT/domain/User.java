package com.JWT.JWT.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String username; // email
    private String password;
    @ManyToMany(fetch = FetchType.EAGER) // TO LOAD ALL THE ROLES  WHEN I FETCH THE USERS
    private Set<Role> roles = new HashSet<>();
}
