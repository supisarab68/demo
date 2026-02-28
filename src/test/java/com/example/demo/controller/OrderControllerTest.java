package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(OrderController.class)
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc; 

    @Test
    public void testCalculateOrderTotal_ShouldReturnCorrectTotalPrice() throws Exception {
        
        
        String jsonRequest = """
                {
                  "items": [
                    { "menuName": "Cocoa (Cold)", "quantity": 2, "price": 40.0 },
                    { "menuName": "CheeseCake", "quantity": 1, "price": 45.0 }
                  ]
                }
                """;

        
        mockMvc.perform(post("/api/orders")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonRequest))
                
                // 3. ตรวจข้อสอบ! (Assert)
                .andExpect(status().isOk()) 
                .andExpect(jsonPath("$.totalPrice").value(185.0));
    }
}