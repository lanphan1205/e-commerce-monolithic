package com.lanphan.e_commerce_monolithic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Float price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "products_categories",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id")
    )
    private List<Category> categoryList;

    @OneToMany(
            mappedBy = "product",
            orphanRemoval = true,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
            )
    private List<Item> itemList;
    private String description;
    private String imageUrl;

}
