package com.soa.back.service.implementedService;

import com.soa.back.model.Category;
import com.soa.back.repository.categoryRepository;
import com.soa.back.service.categoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryServiceImpl implements categoryService {

    private final categoryRepository catRepository;

    public categoryServiceImpl(categoryRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public Category addCategory(Category c) {
        return catRepository.save(c);
    }

    @Override
    public void deleteCategory(int id) {
        catRepository.deleteById(id);
    }

    @Override
    public Category updateCategory(Category c) {
        return catRepository.save(c);
    }

    @Override
    public Category getCategoryById(int id) {
        return catRepository.findById(id).get();
    }

    @Override
    public List<Category> getAllCategories() {
        return catRepository.findAll();
    }
}
