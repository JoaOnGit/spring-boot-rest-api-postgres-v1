package com.customer.service;

import com.customer.domain.Customer;
import com.customer.domain.CustomerRepository;
import com.customer.domain.CustomerRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void createCustomer(CustomerRequestBody customerRequestBody){
        Customer customer = Customer.builder()
                .firstName(customerRequestBody.firstName())
                .lastName(customerRequestBody.lastName())
                .email(customerRequestBody.email())
                .build();
        customerRepository.save(customer);
    }
}
