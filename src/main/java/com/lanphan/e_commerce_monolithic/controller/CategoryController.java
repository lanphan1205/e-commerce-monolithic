package com.lanphan.e_commerce_monolithic.controller;

import com.lanphan.e_commerce_monolithic.model.Category;
import com.lanphan.e_commerce_monolithic.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping("/category/all")
    @ResponseBody
    public List<Category> getAllCategory() {
        return service.getAllCategory();
    }

    @PostMapping("/category/all")
    public List<Category> saveAllCategory(@RequestBody List<Category> categories) {
        return service.saveAllCategory(categories);
    }

}
