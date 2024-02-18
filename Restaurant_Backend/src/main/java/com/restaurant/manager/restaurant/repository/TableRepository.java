package com.restaurant.manager.restaurant.repository;

import com.restaurant.manager.restaurant.model.TableE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface TableRepository extends JpaRepository<TableE, Long> {
    
}
