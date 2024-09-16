package com.lanphan.e_commerce_monolithic.controller;

import com.lanphan.e_commerce_monolithic.model.Product;
import com.lanphan.e_commerce_monolithic.model.dto.ProductDTO;
import com.lanphan.e_commerce_monolithic.service.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/product/{id}")
    @ResponseBody
    public Product getProductById(@PathParam("id") Long id) {
        return service.getProductById(id);
    }

    @PostMapping("/product/all")
    @ResponseBody
    public List<Product> saveAllProducts(@RequestBody List<ProductDTO> products) {
        return service.saveAllProducts(products);
    }

    @PostMapping("/product")
    @ResponseBody
    public Product saveProduct(@RequestBody ProductDTO productDTO) {
        return service.saveProduct(productDTO);
    }

    @GetMapping("/product")
    @ResponseBody
    public List<Product> getProductByCategoryId(@RequestParam("categoryId") Long id) {
        return service.getProductByCategoryId(id);
    }
}


