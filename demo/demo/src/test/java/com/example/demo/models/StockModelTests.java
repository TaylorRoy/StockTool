package com.example.demo.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StockModelTests {

    @Test
    public void setShares_WhenNegative_Exception() {
        StockModel stock = new StockModel();
        try {
            stock.setShares(-1);
            Assertions.fail(); // if test doesn't throw illegal arg  
        } catch (IllegalArgumentException e) {
            
        } catch (Exception e) {
            Assertions.fail();
        }
    }

    @Test
    public void setShares_WhenSetto1_Persists1() {
        StockModel stock = new StockModel();
        stock.setShares(1);
        int getShareTest = stock.getShares();
        Assertions.assertEquals(1, getShareTest);
    }
}
