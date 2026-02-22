package com.example.demo.controller;

import com.example.demo.entity.MenuItem;
import com.example.demo.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController 
@RequestMapping("/api/menus") 
@CrossOrigin(origins = "*") 
public class MenuController {

    @Autowired
    private MenuItemRepository menuRepository; 
    
    @GetMapping
    public List<MenuItem> getAllMenus() {
        
        return menuRepository.findAll(); 
    }
}