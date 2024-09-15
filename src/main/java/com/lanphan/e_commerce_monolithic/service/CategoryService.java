package com.lanphan.e_commerce_monolithic.service;

import com.lanphan.e_commerce_monolithic.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryService  {
    List<Category> getAllCategory();
    Category getCategoryById(Long id);
    Category saveCategory(Category category);
    List<Category> saveAllCategory(List<Category> categories);
}
