package com.example.demo.controllers;

import com.example.demo.data.StockModelRepository;
import com.example.demo.models.StockModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class StockController {

    @Autowired
    StockModelRepository stockModelRepository;

    @PostMapping("/stock")
    public void stockBuy(@RequestBody StockModel stockModel) {
        StockModel entity = stockModelRepository.save(stockModel);
    }

    @GetMapping(value = "/allstocks")
    public Iterable<StockModel> getAllStocks() {
        return stockModelRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    void deleteStockById(@PathVariable int id) {
        stockModelRepository.deleteById(id);
    }

    @GetMapping("/stock/{id}")
    StockModel getStockByID(@PathVariable int id) {
        StockModel findEntity = stockModelRepository.findById(id).get();
        return findEntity;
    }

}
