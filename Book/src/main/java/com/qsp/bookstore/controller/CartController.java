package com.qsp.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.bookstore.service.CartItem;
import com.qsp.bookstore.service.CartService;



@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public CartItem addToCart(@RequestBody CartItem cartItem) {
       
        return cartService.addToCart(cartItem);
    }

    @GetMapping
    public List<CartItem> getCart() {
        
        return cartService.getCartItems();
    }

    @PostMapping("/checkout")
    public String checkout() {
        
        return cartService.checkout();
    }
}
