package com.example.demo.controller;

import java.util.List;

public class Summary {
    
    
    private List<OrderItemRequest> orderedItems; 
    private double totalPrice;                   
    private String message;                      

    
    public List<OrderItemRequest> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<OrderItemRequest> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}