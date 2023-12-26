package com.soa.back.controller;

import com.soa.back.model.Product;
import com.soa.back.service.productService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class productController {

    private final productService prodService;

    public productController(productService prodService) {
        this.prodService = prodService;
    }

    @GetMapping("/products")
    public @ResponseBody List<Product> getProducts(){
        return prodService.getAllProducts();
    }

    @PostMapping("/addProduct")
    public @ResponseBody Product addCategory(@RequestBody Product product){
        return prodService.addProduct(product);
    }

    @GetMapping("/product/{id}")
    public @ResponseBody Product getCategoryById(@PathVariable int id){
        return prodService.getProductById(id);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public @ResponseBody void deleteCategory(@PathVariable int id){
        prodService.deleteProduct(id);
    }

    @PutMapping("/updateProduct")
    public @ResponseBody Product updateCategory(@RequestBody Product product){
        return prodService.updateProduct(product);
    }
}
