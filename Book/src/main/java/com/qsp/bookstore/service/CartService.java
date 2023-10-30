package com.qsp.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.criteria.Order;

@Service
public class CartService {
    private List<CartItem> cart = new ArrayList<>();

    public CartItem addToCart(CartItem cartItem) {
        
        cart.add(cartItem);
        return cartItem;
    }

    public List<CartItem> getCartItems() {
        
        return cart;
    }

    public String checkout() {
   
      
        String order = "ORD123";
		return order;
    }
}
