
package com.smartmart.dao;

public interface CartDAOInterface {

    boolean addToCart(int customerId, int productId, int quantity);

    void viewCart(int customerId);

    boolean updateCart(int customerId, int productId, int quantity);

    boolean removeFromCart(int customerId, int productId);
}
