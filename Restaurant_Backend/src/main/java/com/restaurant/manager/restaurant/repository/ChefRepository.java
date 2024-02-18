package com.restaurant.manager.restaurant.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurant.manager.restaurant.model.Chef;

import java.util.List;

public interface  ChefRepository extends JpaRepository<Chef, Long>{
    List<Chef> findByStatus(String status);

    List<Chef> findByNameContainingIgnoreCase(String name);
}

