package com.lanphan.e_commerce_monolithic.repository;

import com.lanphan.e_commerce_monolithic.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query(name = "select * from categories c where c.id = ?1", nativeQuery = true)
    Category getCategoryById(Long id);
}
