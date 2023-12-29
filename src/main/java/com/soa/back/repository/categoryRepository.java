package com.soa.back.repository;

import com.soa.back.model.Category;
import com.soa.back.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface categoryRepository extends JpaRepository<Category, Integer> {
}
