
package com.smartmart.dao;

import com.smartmart.model.Customer;

public interface CustomerDAOInterface {

    boolean registerCustomer(Customer customer);

    Customer loginCustomer(String email, String password);
}
