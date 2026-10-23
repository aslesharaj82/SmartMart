
package com.smartmart.service;

import com.smartmart.dao.AdminDAO;
import com.smartmart.dao.AdminDAOInterface;
import com.smartmart.dao.ProductDAO;
import com.smartmart.dao.ProductDAOInterface;
import com.smartmart.model.Product;

public class AdminService implements AdminServiceInterface {

    private AdminDAOInterface adminDAO;
    private ProductDAOInterface productDAO;

    public AdminService() {
        this.adminDAO = new AdminDAO();
        this.productDAO = new ProductDAO();
    }

    public AdminService(AdminDAOInterface adminDAO,
                        ProductDAOInterface productDAO) {
        this.adminDAO = adminDAO;
        this.productDAO = productDAO;
    }

    @Override
    public boolean login(String username, String password) {
        return adminDAO.login(username, password);
    }

    @Override
    public boolean addProduct(Product product) {
        return productDAO.addProduct(product);
    }

    @Override
    public void viewProducts() {
        productDAO.viewProducts();
    }

    @Override
    public boolean updateProduct(Product product) {
        return productDAO.updateProduct(product);
    }

    @Override
    public boolean deleteProduct(int productId) {
        return productDAO.deleteProduct(productId);
    }
}
