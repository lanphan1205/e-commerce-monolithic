package com.lanphan.e_commerce_monolithic.service.impl;

import com.lanphan.e_commerce_monolithic.model.Product;
import com.lanphan.e_commerce_monolithic.model.ProductCategory;
import com.lanphan.e_commerce_monolithic.model.dto.ProductDTO;
import com.lanphan.e_commerce_monolithic.repository.ProductCategoryRepository;
import com.lanphan.e_commerce_monolithic.repository.ProductRepository;
import com.lanphan.e_commerce_monolithic.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }

    @Override
    public Product saveProduct(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);
        Product savedProduct =  productRepository.save(product);
        productCategoryRepository.save(new ProductCategory(null, savedProduct.getId(), productDTO.getCategoryId()));
        return savedProduct;
    }

    @Override
    public List<Product> saveAllProducts(List<ProductDTO> productDTOs) {
        List<Product> products = new ArrayList<>();
        for (ProductDTO productDTO: productDTOs) {
            Product product = new Product();
            BeanUtils.copyProperties(productDTO, product);
            products.add(product);
        }
        List<Product> savedProducts =  productRepository.saveAll(products);
        for(int i=0; i<savedProducts.size(); i++) {
            productCategoryRepository.save(new ProductCategory(null, savedProducts.get(i).getId(), productDTOs.get(i).getCategoryId()));
        }
        return savedProducts;
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProductByCategoryId(Long id) {
        return productRepository.getProductByCategoryId(id);
    }
}
