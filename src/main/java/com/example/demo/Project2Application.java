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

            MenuItem iced_green_tea = new MenuItem();
            iced_green_tea.setName("Iced Green Tea");
            iced_green_tea.setPrice(55.0);
            iced_green_tea.setCategory(MenuCategory.COLD_BEVERAGE);

            MenuItem thai_tea = new MenuItem();
            thai_tea.setName("Thai Milk Tea");
            thai_tea.setPrice(45.0);
            thai_tea.setCategory(MenuCategory.COLD_BEVERAGE);

            MenuItem espresso = new MenuItem();
            espresso.setName("Espresso (Cold)");
            espresso.setPrice(45.0);
            espresso.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(espresso);

            MenuItem americano = new MenuItem();
            americano.setName("Americano (Cold)");
            americano.setPrice(45.0);
            americano.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(americano);

            MenuItem cappuccino = new MenuItem();
            cappuccino.setName("Cappuccino (Cold)");
            cappuccino.setPrice(45.0);
            cappuccino.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(cappuccino);

            MenuItem flat_white = new MenuItem();
            flat_white.setName("Flat_white (Cold)");
            flat_white.setPrice(40.0);
            flat_white.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(flat_white);

            MenuItem iced_latte = new MenuItem();
            iced_latte.setName("Latte (Cold)");
            iced_latte.setPrice(45.0);
            iced_latte.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(iced_latte);

            MenuItem iced_mocha = new MenuItem();
            iced_mocha.setName("Mocha (Cold)");
            iced_mocha.setPrice(45.0);
            iced_mocha.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(iced_mocha);

            MenuItem lemonade = new MenuItem();
            lemonade.setName("Lemonade  (Cold)");
            lemonade.setPrice(35.0);
            lemonade.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(lemonade);

            MenuItem iced_peach = new MenuItem();
            iced_peach.setName("Peach Tea (Cold)");
            iced_peach.setPrice(55.0);
            iced_peach.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(iced_peach);
       
            MenuItem pink_milk = new MenuItem();
            pink_milk.setName("Pink Milk (Cold)");
            pink_milk.setPrice(40.0);
            pink_milk.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(pink_milk);

            MenuItem cola = new MenuItem();
            cola.setName("cola");
            cola.setPrice(35.0);
            cola.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(cola);

            MenuItem orange_coffee = new MenuItem();
            orange_coffee.setName("Orange_cofee");
            orange_coffee.setPrice(40.0);
            orange_coffee.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(orange_coffee);

            MenuItem frappe_coffee = new MenuItem();
            frappe_coffee.setName("Frappé coffee");
            frappe_coffee.setPrice(60.0);
            frappe_coffee.setCategory(MenuCategory.COLD_BEVERAGE);
            repository.save(frappe_coffee);



            /*-----*/

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
            repository.save(iced_green_tea);
            repository.save(thai_tea);
        };
    }
}
