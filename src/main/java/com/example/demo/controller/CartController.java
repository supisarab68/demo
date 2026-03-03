package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.MenuItem;
import com.example.demo.model.Cart;
import com.example.demo.repository.MenuItemRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final MenuItemRepository menuItemRepository;

    public CartController(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    @PostMapping("/add")
    public String addToCart(@RequestParam Long id,
                            @RequestParam(defaultValue = "1") int quantity,
                            @RequestParam(required = false) String sweetness,
                            @RequestParam(required = false) String note,
                            HttpSession session) {

        Cart cart = (Cart) session.getAttribute("cart");

        if (cart == null) {
            cart = new Cart();
        }

        MenuItem item = menuItemRepository.findById(id).orElse(null);

        if (item != null) {
            cart.addItem(item, quantity, sweetness, note);
        }

        session.setAttribute("cart", cart);

        return "redirect:/";
    }
    // ✨ โค้ดที่ต้องเพิ่มใหม่: สำหรับล้างตะกร้าตอนกดสั่ง
    @GetMapping("/checkout")
    public String checkoutAndClearCart(HttpSession session) {
        
        // 1. สั่งลบทิ้งข้อมูลตะกร้าที่ค้างอยู่ในความจำ
        session.removeAttribute("cart"); 
        
        // 2. ลบเสร็จให้เซิร์ฟเวอร์บังคับเด้งกลับไปหน้าแรก (/)
        return "redirect:/"; 
    }
}