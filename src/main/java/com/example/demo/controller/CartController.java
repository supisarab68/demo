package com.example.demo.controller;

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
                            @RequestParam int quantity,
                            HttpSession session) {

        Cart cart = (Cart) session.getAttribute("cart");

        if (cart == null) {
            cart = new Cart();
        }

        MenuItem item = menuItemRepository.findById(id).orElse(null);

        if (item != null) {
            cart.addItem(item, quantity);
        }

        session.setAttribute("cart", cart);

        return "redirect:/";
    }
}