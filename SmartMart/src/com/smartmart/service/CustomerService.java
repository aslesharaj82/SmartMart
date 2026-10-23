
package com.smartmart.service;

import com.smartmart.dao.CustomerDAO;
import com.smartmart.dao.CustomerDAOInterface;
import com.smartmart.model.Customer;

public class CustomerService implements CustomerServiceInterface {

    private CustomerDAOInterface customerDAO;

    public CustomerService() {
        this.customerDAO = new CustomerDAO();
    }

    public CustomerService(CustomerDAOInterface customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public boolean registerCustomer(Customer customer) {
        return customerDAO.registerCustomer(customer);
    }

    @Override
    public Customer loginCustomer(String email, String password) {
        return customerDAO.loginCustomer(email, password);
    }
}
