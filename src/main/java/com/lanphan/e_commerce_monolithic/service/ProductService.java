package com.lanphan.e_commerce_monolithic.service;

import com.lanphan.e_commerce_monolithic.model.Product;
import com.lanphan.e_commerce_monolithic.model.dto.ProductDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long Id);
    Product saveProduct(ProductDTO product);
    List<Product> saveAllProducts(List<ProductDTO> products);
    Product updateProduct(Product product);
    List<Product> getProductByCategoryId(Long id);
}
