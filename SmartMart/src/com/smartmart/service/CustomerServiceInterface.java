
package com.smartmart.service;

import com.smartmart.model.Customer;

public interface CustomerServiceInterface {

    boolean registerCustomer(Customer customer);

    Customer loginCustomer(String email, String password);
}
