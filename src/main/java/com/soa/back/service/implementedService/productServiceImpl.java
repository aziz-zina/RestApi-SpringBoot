package com.soa.back.service.implementedService;

import com.soa.back.model.Product;
import com.soa.back.repository.productRepository;
import com.soa.back.service.productService;

import java.util.List;

public class productServiceImpl implements productService {

    private productRepository prodRepository;

    @Override
    public Product addProduct(Product p) {
        return prodRepository.save(p);
    }

    @Override
    public void deleteProduct(int id) {
        prodRepository.deleteById(id);
    }

    @Override
    public Product updateProduct(Product p) {
        return prodRepository.save(p);
    }

    @Override
    public Product getProductById(int id) {
        return prodRepository.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return prodRepository.findAll();
    }
}
