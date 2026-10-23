
package com.smartmart.service;

import com.smartmart.dao.OrderDAO;
import com.smartmart.dao.OrderDAOInterface;

public class OrderService implements OrderServiceInterface {

    private OrderDAOInterface orderDAO;

    public OrderService() {
        this.orderDAO = new OrderDAO();
    }

    public OrderService(OrderDAOInterface orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    public boolean checkout(int customerId) {
        return orderDAO.checkout(customerId);
    }

    @Override
    public void viewOrderHistory(int customerId) {
        orderDAO.viewOrderHistory(customerId);
    }
}
