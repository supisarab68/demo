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

            if (repository.count() > 0 ) {
                return;
            }
            
            /*------------------------------------------------- */
            /*Cold Drinks Menu*/

            MenuItem cold_mocha = new MenuItem();
            cold_mocha.setName("Mocha (Cold)");
            cold_mocha.setPrice(40.0);
            cold_mocha.setCategory(MenuCategory.COLD_BEVERAGE);
            cold_mocha.setImage("/image/cold_mocha.jpg");
            

            MenuItem cold_espresso = new MenuItem();
            cold_espresso.setName("Espresso (Cold)");
            cold_espresso.setPrice(40.0);
            cold_espresso.setCategory(MenuCategory.COLD_BEVERAGE);
            

            MenuItem cold_latte = new MenuItem();
            cold_latte.setName("Latte (Cold)");
            cold_latte.setPrice(40.0);
            cold_latte.setCategory(MenuCategory.COLD_BEVERAGE);
            
            
            MenuItem cold_cappuccino = new MenuItem();
            cold_cappuccino.setName("Cappuccino (Cold)");
            cold_cappuccino.setPrice(40.0);
            cold_cappuccino.setCategory(MenuCategory.COLD_BEVERAGE);
            
            
            MenuItem cold_americano = new MenuItem();
            cold_americano.setName("Americano (Cold)");
            cold_americano.setPrice(40.0);
            cold_americano.setCategory(MenuCategory.COLD_BEVERAGE);
            

            MenuItem cold_cocoa = new MenuItem();
            cold_cocoa.setName("Cocoa (Cold)");
            cold_cocoa.setPrice(40.0); 
            cold_cocoa.setCategory(MenuCategory.COLD_BEVERAGE);
            

            MenuItem cold_green_tea = new MenuItem();
            cold_green_tea.setName("Green Tea (Cold)");
            cold_green_tea.setPrice(30.0);
            cold_green_tea.setCategory(MenuCategory.COLD_BEVERAGE);
            

            MenuItem cold_matcha = new MenuItem();
            cold_matcha.setName("Matcha (Cold)");
            cold_matcha.setPrice(40.0);
            cold_matcha.setCategory(MenuCategory.COLD_BEVERAGE);
            

            MenuItem cold_thai_tea = new MenuItem();
            cold_thai_tea.setName("Thai Milk Tea (Cold)");
            cold_thai_tea.setPrice(30.0);
            cold_thai_tea.setCategory(MenuCategory.COLD_BEVERAGE);
            

            MenuItem cold_lemonade_tea = new MenuItem();
            cold_lemonade_tea.setName("Lemonade tea (Cold)");
            cold_lemonade_tea.setPrice(30.0);
            cold_lemonade_tea.setCategory(MenuCategory.COLD_BEVERAGE);
            

            MenuItem cold_milk = new MenuItem();
            cold_milk.setName("Milk (Cold)");
            cold_milk.setPrice(30.0);
            cold_milk.setCategory(MenuCategory.COLD_BEVERAGE);
            

            MenuItem cold_caramel_milk = new MenuItem();
            cold_caramel_milk.setName("Caramel Milk (Cold)");
            cold_caramel_milk.setPrice(40.0);
            cold_caramel_milk.setCategory(MenuCategory.COLD_BEVERAGE);
            

            /*Cold Drinks Menu*/
            /*------------------------------------------------- */




            /*------------------------------------------------- */
            /*Hot Drinks Menu*/
            
            MenuItem hot_mocha = new MenuItem();
            hot_mocha.setName("Mocha (Hot)");
            hot_mocha.setPrice(35.0);
            hot_mocha.setCategory(MenuCategory.HOT_BEVERAGE);
            
            
            MenuItem hot_espresso = new MenuItem();
            hot_espresso.setName("Espresso (Hot)");
            hot_espresso.setPrice(35.0);
            hot_espresso.setCategory(MenuCategory.HOT_BEVERAGE);
            

            MenuItem hot_latte = new MenuItem();
            hot_latte.setName("Latte (Hot)");
            hot_latte.setPrice(35.0);
            hot_latte.setCategory(MenuCategory.HOT_BEVERAGE);
            

            MenuItem hot_cappuccino = new MenuItem();
            hot_cappuccino.setName("Cappuccino (Hot)");
            hot_cappuccino.setPrice(35.0);
            hot_cappuccino.setCategory(MenuCategory.HOT_BEVERAGE);
            

            MenuItem hot_americano = new MenuItem();
            hot_americano.setName("Americano (Hot)");
            hot_americano.setPrice(35.0);
            hot_americano.setCategory(MenuCategory.HOT_BEVERAGE);
            

            MenuItem hot_cocoa = new MenuItem();
            hot_cocoa.setName("Cocoa (Hot)");
            hot_cocoa.setPrice(30.0); 
            hot_cocoa.setCategory(MenuCategory.HOT_BEVERAGE);
            

            MenuItem hot_green_tea = new MenuItem();
            hot_green_tea.setName("Green Tea (Hot)");
            hot_green_tea.setPrice(25.0);
            hot_green_tea.setCategory(MenuCategory.HOT_BEVERAGE);
            
            
            MenuItem hot_matcha = new MenuItem();
            hot_matcha.setName("Matcha (Hot)");
            hot_matcha.setPrice(35.0);
            hot_matcha.setCategory(MenuCategory.HOT_BEVERAGE);
            

            MenuItem hot_thai_tea = new MenuItem();
            hot_thai_tea.setName("Thai Milk Tea (Hot)");
            hot_thai_tea.setPrice(25.0);
            hot_thai_tea.setCategory(MenuCategory.HOT_BEVERAGE);


            MenuItem hot_lemonade_tea = new MenuItem();
            hot_lemonade_tea.setName("Lemonade tea (Hot)");
            hot_lemonade_tea.setPrice(25.0);
            hot_lemonade_tea.setCategory(MenuCategory.HOT_BEVERAGE);
            
       
            MenuItem hot_milk = new MenuItem();
            hot_milk.setName("Milk (Hot)");
            hot_milk.setPrice(25.0);
            hot_milk.setCategory(MenuCategory.HOT_BEVERAGE);
            
            
            MenuItem hot_caramel_milk = new MenuItem();
            hot_caramel_milk.setName("Caramel Milk (Hot)");
            hot_caramel_milk.setPrice(38.0);
            hot_caramel_milk.setCategory(MenuCategory.HOT_BEVERAGE);
            
            
            /*Hot Drinks Menu*/
            /*------------------------------------------------- */
            
            
            

            /*------------------------------------------------- */
            /*Desert Menu*/
           
            MenuItem cheesecake = new MenuItem();
            cheesecake.setName("CheeseCake");
            cheesecake.setPrice(45.0);
            cheesecake.setCategory(MenuCategory.DESSERT);
            cheesecake.setImage("/image/cheesecake.jpg");

            MenuItem strawberrycake = new MenuItem();
            strawberrycake.setName("StrawberryCake");
            strawberrycake.setPrice(45.0);
            strawberrycake.setCategory(MenuCategory.DESSERT);
            
            
            /*Desert Menu*/
            /*------------------------------------------------- */

            //cold
            repository.save(cold_mocha);
            repository.save(cold_espresso);
            repository.save(cold_cappuccino);
            repository.save(cold_americano);
            repository.save(cold_cocoa);
            repository.save(cold_green_tea);
            repository.save(cold_matcha);
            repository.save(cold_thai_tea);
            repository.save(cold_lemonade_tea);
            repository.save(cold_milk);
            repository.save(cold_caramel_milk);

            //hot
            repository.save(hot_mocha);
            repository.save(hot_espresso);
            repository.save(hot_cappuccino);
            repository.save(hot_americano);
            repository.save(hot_latte);
            repository.save(hot_cocoa);
            repository.save(hot_thai_tea);
            repository.save(hot_lemonade_tea);
            repository.save(hot_milk);
            repository.save(hot_caramel_milk);

            //desert
            repository.save(cheesecake);
            repository.save(strawberrycake);

        };
    }
}
