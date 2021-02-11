package com.example.demo.data;

import com.example.demo.models.StockModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockModelRepository extends JpaRepository<StockModel, Integer>{
    
}
