package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.MenuItem;
import com.example.demo.repository.MenuItemRepository;

@Controller 
public class MenuController {

    @Autowired
    private MenuItemRepository menuRepository; 
    
    @GetMapping("/menu")
public String showMenu(Model model) {

    List<MenuItem> menus = menuRepository.findAll();
    model.addAttribute("menus", menus);

    return "1.1-menu-grid";
}
}