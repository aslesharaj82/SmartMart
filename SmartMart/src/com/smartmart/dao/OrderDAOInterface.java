
package com.smartmart.dao;

public interface OrderDAOInterface {

    boolean checkout(int customerId);

    void viewOrderHistory(int customerId);
}
