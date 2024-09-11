package com.lanphan.e_commerce_monolithic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private LocalDateTime createdDate;
    private Customer customer;
    private List<Item> itemList;
}
