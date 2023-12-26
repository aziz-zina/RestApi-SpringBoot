package com.soa.back.controller;

import com.soa.back.model.Category;
import com.soa.back.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class categoryController {

    private final categoryService catService;

    public categoryController(categoryService catService) {
        this.catService = catService;
    }

    @GetMapping("/categories")
    public @ResponseBody List<Category> getCategories(){
        return catService.getAllCategories();
    }

    @PostMapping("/addCategory")
    public @ResponseBody Category addCategory(@RequestBody Category category){
        return catService.addCategory(category);
    }

    @GetMapping("/category/{id}")
    public @ResponseBody Category getCategoryById(@PathVariable int id){
        return catService.getCategoryById(id);
    }

    @DeleteMapping("/deleteCategory/{id}")
    public @ResponseBody void deleteCategory(@PathVariable int id){
        catService.deleteCategory(id);
    }

    @PutMapping("/updateCategory")
    public @ResponseBody Category updateCategory(@RequestBody Category category){
        return catService.updateCategory(category);
    }
}