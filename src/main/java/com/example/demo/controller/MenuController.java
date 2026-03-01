package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.MenuCategory;
import com.example.demo.entity.MenuItem;
import com.example.demo.model.Cart;
import com.example.demo.repository.MenuItemRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class MenuController {

    private final MenuItemRepository menuItemRepository;

    public MenuController(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    
    // MENU
    @GetMapping("/")
    public String showMenu(
            @RequestParam(required = false) String category,
            Model model,
            HttpSession session
    ) {

        List<MenuItem> menus;
        MenuCategory selectedCategory = null;

        // กัน error 
        if (category != null) {
            try {
                selectedCategory = MenuCategory.valueOf(category);
                menus = menuItemRepository.findByCategory(selectedCategory);
            } catch (IllegalArgumentException e) {
                menus = menuItemRepository.findAll();
            }
        } else {
            menus = menuItemRepository.findAll();
        }

        Cart cart = getOrCreateCart(session);

        model.addAttribute("menus", menus);
        model.addAttribute("selectedCategory", selectedCategory);
        model.addAttribute("cartItems", cart.getTotalItems());
        model.addAttribute("cartTotal", cart.getTotalPrice());

        return "menu";
    }

    
    // menu detail
    
    @GetMapping("/menu/{id}")
    public String showMenuDetail(@PathVariable Long id, Model model) {

        MenuItem item = menuItemRepository.findById(id).orElse(null);

        model.addAttribute("item", item);
        model.addAttribute("category", item.getCategory());

        return "menu-detail";
    }

    
    // เหมือนจะไม่ใช้แล้วปุ่มนี้เเล้ว เทสอีกที
    
    @GetMapping("/add-to-cart/{id}")
    public String addToCart(
            @PathVariable Long id,
            @RequestParam(defaultValue = "1") int quantity,
            HttpSession session
    ) {

        Cart cart = getOrCreateCart(session);

        MenuItem item = menuItemRepository.findById(id).orElse(null);

        if (item != null && quantity > 0) {
            cart.addItem(item, quantity, null ,null);
        }

        session.setAttribute("cart", cart);

        return "redirect:/";
    }


    
    // my order 
   
    @GetMapping("/my-order")
    public String showMyOrder(Model model, HttpSession session) {

        Cart cart = getOrCreateCart(session);

        model.addAttribute("cart", cart);
        model.addAttribute("cartItems", cart.getTotalItems());
        model.addAttribute("cartTotal", cart.getTotalPrice());

        return "my-order";
    }

    
    // helper method แอบงงๆยุ
    
    private Cart getOrCreateCart(HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");

        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }

        return cart;
    }
}