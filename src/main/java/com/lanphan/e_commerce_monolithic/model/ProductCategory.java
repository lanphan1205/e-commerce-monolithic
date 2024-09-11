package com.lanphan.e_commerce_monolithic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "products_categories")
public class ProductCategory {
    private Long id;
    private Product product;
    private Category category;
}
