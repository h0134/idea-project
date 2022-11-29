package com.Ecommerce.Ecommerce.Controller;

import com.Ecommerce.Ecommerce.dto.RegistrationRequest;
import com.Ecommerce.Ecommerce.entities.Customer;
import com.Ecommerce.Ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/registration")

public class CustomerController {

    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /*Api to register a customer */
    @PostMapping("/register")
    public Customer createCustomer(@RequestBody RegistrationRequest request) {
        return customerService.registerCustomer(request);
    }
}
