package com.customer.Api.services;

import com.customer.Api.dto.Customer;


import java.util.UUID;


public interface CustomerService {

    Customer getCustomer(UUID id);
}
