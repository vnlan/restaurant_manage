package com.restaurant.manager.restaurant.service;

import com.restaurant.manager.restaurant.repository.ChefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.restaurant.manager.restaurant.model.*;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

@Service

public class ChefService {

    @Autowired
    private ChefRepository ChefRepository;
    public List<Chef> getAllChef(){
        return ChefRepository.findAll();
    }
    public Chef addChef(Chef Chef){
        return ChefRepository.save(Chef);
    }
    public Chef updateChef(Chef Chef){
        Chef existedChef = ChefRepository.findById(Chef.getId()).orElse(null);
        existedChef.setName(Chef.getName());
        existedChef.setSex(Chef.getSex());
        existedChef.setDateofbirth(Chef.getDateofbirth());
        existedChef.setWorkingyears(Chef.getWorkingyears());
        existedChef.setSalary(Chef.getSalary());
        existedChef.setDescription(Chef.getDescription());
        existedChef.setStatus(Chef.getStatus());
        return ChefRepository.save(existedChef);
    }
    public String deleteChef(long id){
        ChefRepository.deleteById(id);
        return "Đầu bếp đã xoá với ID: "+ id;
    }
    public List<Chef> findChefByName(String name){
        ChefRepository.findByNameContainingIgnoreCase(name);
        return ChefRepository.findByNameContainingIgnoreCase(name);
    }
    public Chef getChefById (Long id){
        return ChefRepository.findById(id).orElse(null);
    }
    public List<Chef> filterChefByStatus (String status){
        return ChefRepository.findByStatus(status);
    }
}