package com.lanphan.e_commerce_monolithic.service.impl;

import com.lanphan.e_commerce_monolithic.model.Category;
import com.lanphan.e_commerce_monolithic.repository.CategoryRepository;
import com.lanphan.e_commerce_monolithic.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> getAllCategory() {
        return repository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return repository.getCategoryById(id);
    }

    @Override
    public Category saveCategory(Category category) {
        return repository.save(category);
    }

    @Override
    public List<Category> saveAllCategory(List<Category> categories) {
        return repository.saveAll(categories);
    }


}
