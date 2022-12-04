package com.customer.web;

import com.customer.domain.CustomerRequestBody;
import com.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/customer/v1")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public void createCustomer(@RequestBody CustomerRequestBody customerRequestBody){
        customerService.createCustomer(customerRequestBody);
    }
}
