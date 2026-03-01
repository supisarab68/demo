package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.MenuItem;

public class Cart {

    private List<CartItem> items = new ArrayList<>();

    public void addItem(MenuItem menuItem, int quantity, String sweetness, String note) {
        
    CartItem item = new CartItem(menuItem, quantity, sweetness, note);
    items.add(item);
}

    public int getTotalItems() {
        return items.stream()
               .mapToInt(CartItem::getQuantity)
               .sum();
    }

    public double getTotalPrice() {
        return items.stream()
               .mapToDouble(i -> i.getMenuItem().getPrice() * i.getQuantity())
               .sum();
    }

    public List<CartItem> getItems() {
        return items;
    }
}
