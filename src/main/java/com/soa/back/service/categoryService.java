package com.soa.back.service;

import com.soa.back.model.Category;
import com.soa.back.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface categoryService {
    Category addCategory(Category c);

    void deleteCategory(int id);

    Category updateCategory(Category c);

    Category getCategoryById(int id);

    List<Category> getAllCategories();

}
