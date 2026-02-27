package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.MenuCategory;
import com.example.demo.entity.MenuItem;
import com.example.demo.repository.MenuItemRepository;

@Controller 
public class MenuController {

    private final MenuItemRepository menuItemRepository;
   // @Autowired
   // private MenuItemRepository menuRepository; 

   // Constructor Injection
    public MenuController(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }
    
    @GetMapping("/")
public String showMenu(
        @RequestParam(required = false) String category,
        Model model) {

    List<MenuItem> menus;

    if (category != null) {
        MenuCategory selected = MenuCategory.valueOf(category);
        menus = menuItemRepository.findByCategory(selected);
        model.addAttribute("selectedCategory", category);
    } else {
        menus = menuItemRepository.findAll();
        model.addAttribute("selectedCategory", null);
    }

    model.addAttribute("menus", menus);
    

    return "menu";
}

    @GetMapping("/menu/{id}")
    public String showMenuDetail(@PathVariable Long id, Model model) {

        MenuItem item = menuItemRepository.findById(id).orElse(null);

        model.addAttribute("item", item);
        model.addAttribute("category", item.getCategory());

        return "menu-detail";
    }

}