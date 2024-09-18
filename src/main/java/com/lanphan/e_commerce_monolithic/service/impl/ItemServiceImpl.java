package com.lanphan.e_commerce_monolithic.service.impl;

import com.lanphan.e_commerce_monolithic.model.Cart;
import com.lanphan.e_commerce_monolithic.model.Item;
import com.lanphan.e_commerce_monolithic.model.Order;
import com.lanphan.e_commerce_monolithic.repository.CartRepository;
import com.lanphan.e_commerce_monolithic.repository.ItemRepository;
import com.lanphan.e_commerce_monolithic.repository.OrderRepository;
import com.lanphan.e_commerce_monolithic.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ItemServiceImpl implements ItemService {
    @Autowired
    public ItemRepository itemRepository;

    @Autowired
    public OrderRepository orderRepository;

    @Autowired
    public CartRepository cartRepository;

    @Override
    public Item saveItemToCart(Item item, Long customerId) {
        Cart savedCart;
        if (item.getCartId() == null) {
            savedCart = cartRepository.save(new Cart(null, customerId, LocalDateTime.now()));
        } else {
            savedCart = cartRepository.findById(item.getCartId()).get();
        }
        item.setCartId(savedCart.getId());
        return itemRepository.save(item);
    }

    @Override
    public List<Item> saveItemListToOrder(List<Item> items, Long customerId) {
        // TODO: Clear cart
        List<Item> savedItems = new ArrayList<>();
        // Save Order
        Order savedOrder = orderRepository.save(new Order(null, LocalDateTime.now(), customerId, "CREATED"));
        for(Item item: items) {
            item.setOrderId(savedOrder.getId());
            savedItems.add(itemRepository.save(item));
        }
        return savedItems;
    }
}
