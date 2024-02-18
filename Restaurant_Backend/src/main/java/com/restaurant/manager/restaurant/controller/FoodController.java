package com.restaurant.manager.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.restaurant.manager.restaurant.service.FoodService;
import com.restaurant.manager.restaurant.service.dto.FoodDTO;

@RestController
@RequestMapping("/api")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @GetMapping("/get-food")
    public List<FoodDTO> getAllFood(){
        return foodService.getAllFood();
    }
}