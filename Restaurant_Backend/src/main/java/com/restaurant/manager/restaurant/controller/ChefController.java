package com.restaurant.manager.restaurant.controller;
import com.restaurant.manager.restaurant.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.restaurant.manager.restaurant.model.*;
import com.restaurant.manager.restaurant.service.FoodService;
import com.restaurant.manager.restaurant.service.dto.FoodDTO;

@RestController
@RequestMapping("/api")
public class ChefController {
    @Autowired
    private ChefService ChefService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/get-chef")
    public List<Chef> getAllChef(){
        return ChefService.getAllChef();
    }

    @CrossOrigin("http://localhost:4200")
    @PostMapping ("/add-chef")
    public ResponseEntity<Chef> addChef(@RequestBody Chef Chef){
        System.out.println(Chef);
        return ResponseEntity.ok().body(this.ChefService.addChef(Chef)) ;
    }

    @CrossOrigin("http://localhost:4200")
    @PutMapping("/update-chef")
    public Chef updateChef(@RequestBody Chef Chef){
        return ChefService.updateChef(Chef);
    }

    @CrossOrigin("http://localhost:4200")
    @DeleteMapping("/delete-chef/{id}")
    public String deleteChef(@PathVariable Long id){
        return ChefService.deleteChef(id);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/find-chef-by-name/{name}")
    public List<Chef> findChefByName(@PathVariable String name){
        return ChefService.findChefByName(name);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/get-chef-by-id/{id}")
    public Chef getChefById(@PathVariable Long id){
        return ChefService.getChefById(id);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/filter-chef-by-status/{status}")
    public  List <Chef> filterChefByStatus(@PathVariable String status){
        return ChefService.filterChefByStatus(status);
    }
}