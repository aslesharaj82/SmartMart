
package com.smartmart.service;

public interface OrderServiceInterface {

    boolean checkout(int customerId);

    void viewOrderHistory(int customerId);
}
