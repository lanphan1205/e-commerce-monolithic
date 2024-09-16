package com.lanphan.e_commerce_monolithic.repository;

import com.lanphan.e_commerce_monolithic.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from Products", nativeQuery = true)
    List<Product> getAllProducts();
    @Query(value = "select * from Products p where p.id = ?1", nativeQuery = true)
    Product getProductById(Long id);
    @Query(value = "select p.id, p.title, p.description, p.quantity, p.price, p.image_url from products p \n" +
            "inner join products_categories pc on p.id = pc.product_id\n" +
            "inner join categories c on pc.category_id = c.id\n" +
            "where c.id = ?1", nativeQuery = true)
    List<Product> getProductByCategoryId(Long id);
    
}
