package com.lanphan.e_commerce_monolithic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private Long id;

    private Customer customer;
    private Product product;
    private String description;
}
