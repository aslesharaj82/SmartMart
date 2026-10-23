
package com.smartmart.service;

import com.smartmart.dao.CartDAO;
import com.smartmart.dao.CartDAOInterface;

public class CartService implements CartServiceInterface {

    private CartDAOInterface cartDAO;

    public CartService() {
        this.cartDAO = new CartDAO();
    }

    public CartService(CartDAOInterface cartDAO) {
        this.cartDAO = cartDAO;
    }

    @Override
    public boolean addToCart(int customerId, int productId, int quantity) {
        return cartDAO.addToCart(customerId, productId, quantity);
    }

    @Override
    public void viewCart(int customerId) {
        cartDAO.viewCart(customerId);
    }

    @Override
    public boolean updateCart(int customerId, int productId, int quantity) {
        return cartDAO.updateCart(customerId, productId, quantity);
    }

    @Override
    public boolean removeFromCart(int customerId, int productId) {
        return cartDAO.removeFromCart(customerId, productId);
    }
}
