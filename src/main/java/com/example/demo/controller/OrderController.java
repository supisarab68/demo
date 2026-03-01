package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    
    @PostMapping
    public Summary processOrder(@RequestBody OrderRequest request) {
        
        double totalPrice = 0.0;

       
        for (OrderItemRequest item : request.getItems()) {
            
            double subTotal = item.getPrice() * item.getQuantity();
            totalPrice += subTotal;
        }

        
        Summary summary = new Summary();
        summary.setOrderedItems(request.getItems()); 
        summary.setTotalPrice(totalPrice);
        
        summary.setMessage("รายการเข้าครัวแล้ว");           

        return summary; 
    }
}


class OrderSummary {

    private String message;

    private List<OrderItemRequest> orderedItems; 
    private Double totalPrice;

    public List<OrderItemRequest> getOrderedItems() { return orderedItems; }
    public void setOrderedItems(List<OrderItemRequest> orderedItems) { this.orderedItems = orderedItems; }

    public Double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(Double totalPrice) { this.totalPrice = totalPrice; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}


class OrderRequest {
    private List<OrderItemRequest> items; 
    public List<OrderItemRequest> getItems() { return items; }
    public void setItems(List<OrderItemRequest> items) { this.items = items; }
}


class OrderItemRequest {
    private String menuName;  
    private Integer quantity; 
    private Double price;     
    
    
    private String note; 

    public String getMenuName() { return menuName; }
    public void setMenuName(String menuName) { this.menuName = menuName; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    
    public String getNote() { return note; }
    public void setNote(String note) { 
    
        if (note != null && note.length() > 20) {
            this.note = note.substring(0, 20);
        } else {
            this.note = note; 
        }
    }
}