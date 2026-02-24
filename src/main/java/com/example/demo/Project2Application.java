package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.MenuCategory;
import com.example.demo.entity.MenuItem;
import com.example.demo.repository.MenuItemRepository;

@SpringBootApplication
public class Project2Application { 

    public static void main(String[] args) {
        SpringApplication.run(Project2Application.class, args);
    }

    @Bean
    public CommandLineRunner initData(MenuItemRepository repository) {
        return args -> {
            
            
            MenuItem Cold_cocoa = new MenuItem();
            Cold_cocoa.setName("Cold_cocoa");
            Cold_cocoa.setPrice(40.0); 
            Cold_cocoa.setCategory(MenuCategory.COLD_BEVERAGE);

            MenuItem Hot_cocoa = new MenuItem();
            Hot_cocoa.setName("Hot_cocoa");
            Hot_cocoa.setPrice(35.0); 
            Hot_cocoa.setCategory(MenuCategory.COLD_BEVERAGE);

            
            MenuItem cheesecake = new MenuItem();
            cheesecake.setName("CheeseCake");
            cheesecake.setPrice(45.0);
            cheesecake.setCategory(MenuCategory.DESSERT);

            MenuItem stawberrycake = new MenuItem();
            stawberrycake.setName("stawberryCake");
            stawberrycake.setPrice(45.0);
            stawberrycake.setCategory(MenuCategory.DESSERT);

            
            repository.save(Cold_cocoa);
            repository.save(Hot_cocoa);
            repository.save(cheesecake);
            repository.save(stawberrycake);
        };
    }
}
