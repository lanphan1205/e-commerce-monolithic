package com.lanphan.e_commerce_monolithic.service;

import com.lanphan.e_commerce_monolithic.model.Cart;

public interface CartService {
    Cart saveCart(Cart cart);
    Cart getCartById(Long id);
}
