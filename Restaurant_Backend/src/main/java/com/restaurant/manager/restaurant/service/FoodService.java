package com.restaurant.manager.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.restaurant.manager.restaurant.repository.FoodRepository;
import com.restaurant.manager.restaurant.service.dto.FoodDTO;
import com.restaurant.manager.restaurant.service.mapper.FoodMapper;

@Service
@Transactional
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private FoodMapper foodMapper;

    @Transactional(readOnly = true)
    public List<FoodDTO> getAllFood(){
        return foodMapper.listFoodMapper(foodRepository.findAll());
    }
}