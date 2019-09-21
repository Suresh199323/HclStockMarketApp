package com.example.stock.stock.service;

import com.example.stock.stock.entity.Stock;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;

public interface StockService {
    /*Stock findStockName(Integer stockId);*/

    Double getStockPrice(Integer stockId) throws JsonParseException, JsonMappingException, IOException;
}
