
package com.smartmart.service;

public interface CartServiceInterface {

    boolean addToCart(int customerId, int productId, int quantity);

    void viewCart(int customerId);

    boolean updateCart(int customerId, int productId, int quantity);

    boolean removeFromCart(int customerId, int productId);
}
