package com.soa.back.service;

import com.soa.back.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface productService {
    Product addProduct(Product p);

    void deleteProduct(int id);

    Product updateProduct(Product p);

    Product getProductById(int id);

    List<Product> getAllProducts();
}
