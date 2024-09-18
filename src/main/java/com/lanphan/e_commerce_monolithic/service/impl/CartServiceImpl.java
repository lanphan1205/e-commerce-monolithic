package com.lanphan.e_commerce_monolithic.service.impl;

import com.lanphan.e_commerce_monolithic.model.Cart;
import com.lanphan.e_commerce_monolithic.repository.CartRepository;
import com.lanphan.e_commerce_monolithic.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;
    @Override
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart getCartById(Long id) {
        return cartRepository.findById(id).get();
    }

}
