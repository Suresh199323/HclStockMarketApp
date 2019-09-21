package com.example.stock.stock.repository;

import com.example.stock.stock.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    Stock findByStockId(Integer stockId);
}
