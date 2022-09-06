package com.customer.Api.services.impl;

import com.customer.Api.dto.Customer;
import com.customer.Api.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Override
    public Customer getCustomer(UUID id) {
        return new Customer(id,"Basant");
    }
}
