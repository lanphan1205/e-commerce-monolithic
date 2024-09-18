package com.lanphan.e_commerce_monolithic.controller;

import com.lanphan.e_commerce_monolithic.model.Cart;
import com.lanphan.e_commerce_monolithic.service.CartService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    public CartService cartService;

    @GetMapping("/cart/{id}")
    @ResponseBody
    public Cart getCartById(@PathParam("id") Long id) {
        return cartService.getCartById(id);
    }
}
