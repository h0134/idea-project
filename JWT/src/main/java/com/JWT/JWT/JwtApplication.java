package com.JWT.JWT;

import com.JWT.JWT.domain.Role;
import com.JWT.JWT.domain.User;
import com.JWT.JWT.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {

		SpringApplication.run(JwtApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}



	/* create a bean of type commandline runner */
//	@Bean
//	CommandLineRunner run(UserService userservice){
//		return  args->{
//			userservice.saveRole(new Role(null,"ROLE_USER"));
//			userservice.saveRole(new Role(null,"ROLE_MANAGER"));
//			userservice.saveRole(new Role(null,"ROLE_ADMIN"));
//			userservice.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
//
//			userservice.saveUser(new User(null,"John Travolta","john","1234",new HashSet<>()));
//			userservice.saveUser(new User(null,"Will Smith","will","1234",new HashSet<>()));
//			userservice.saveUser(new User(null,"Jin Carry","jim","1234",new HashSet<>()));
//			userservice.saveUser(new User(null,"Arnold Schwarzenegger","arnold","1234",new HashSet<>()));
//
//			userservice.addRoleToUser("john","ROLE_USER");
//			userservice.addRoleToUser("john","ROLE_MANAGER");
//			userservice.addRoleToUser("will","ROLE_MANAGER");
//			userservice.addRoleToUser("jim","ROLE_ADMIN");
//			userservice.addRoleToUser("arnold","ROLE_SUPER_ADMIN");
//			userservice.addRoleToUser("arnold","ROLE_ADMIN");
//			userservice.addRoleToUser("arnold","ROLE_USER");
//
//		};
//	}
}
