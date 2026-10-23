
package com.smartmart.dao;

import com.smartmart.model.Product;

public interface ProductDAOInterface {

    boolean addProduct(Product product);

    void viewProducts();

    boolean updateProduct(Product product);

    boolean deleteProduct(int productId);
}
