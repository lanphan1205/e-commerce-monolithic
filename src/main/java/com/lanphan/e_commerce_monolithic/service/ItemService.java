package com.lanphan.e_commerce_monolithic.service;

import com.lanphan.e_commerce_monolithic.model.Item;

import java.util.List;

public interface ItemService {
    Item saveItemToCart(Item item, Long customerId);
    List<Item> saveItemListToOrder(List<Item> items, Long customer);
}
