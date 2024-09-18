package com.lanphan.e_commerce_monolithic.controller;

import com.lanphan.e_commerce_monolithic.model.Item;
import com.lanphan.e_commerce_monolithic.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/item/cart")
    public Item saveItemToCart(@RequestBody Item item, @RequestParam("customerId") Long customerId) {
        return itemService.saveItemToCart(item, customerId);
    }

    @PostMapping("/item/order")
    public List<Item> saveItemToOrder(@RequestBody List<Item> items, @RequestParam("customerId") Long customerId) {
        return itemService.saveItemListToOrder(items, customerId);
    }


}
