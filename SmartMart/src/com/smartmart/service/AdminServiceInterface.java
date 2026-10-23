
package com.smartmart.service;

import com.smartmart.model.Product;

public interface AdminServiceInterface {

    boolean login(String username, String password);

    boolean addProduct(Product product);

    void viewProducts();

    boolean updateProduct(Product product);

    boolean deleteProduct(int productId);
}
