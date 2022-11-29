package com.Ecommerce.Ecommerce.service;

import com.Ecommerce.Ecommerce.dto.RegistrationRequest;
import com.Ecommerce.Ecommerce.entities.Customer;
import com.Ecommerce.Ecommerce.entities.User;
import com.Ecommerce.Ecommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {


    @Autowired
    CustomerRepository customerRepository;
//    @Autowired
//    private final PasswordEncoder passwordEncoder;


    public Customer registerCustomer(RegistrationRequest request) {

//        request.setPassword(request.getPassword());


        String token = UUID.randomUUID().toString();

        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())





//                .password(request.getPassword())
                .build();



//        user.setFirstName(request.getFirstName());
//        user.setLastName(request.getLastName());
//        user.setPassword(request.getPassword());


        Customer customer = Customer.builder()
                .user(user)

                .phone(request.getPhone()) // added
                .build();

        customerRepository.save(customer);
        return customer;

    }

}