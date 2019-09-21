package com.example.stock.stock.controller;

import com.example.stock.stock.service.StockService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
       @RequestMapping("/stock")
        public class StockController {

         @Autowired
         StockService stockService;

        @GetMapping("/stockprice/{stockId}")
        @ResponseBody
         public Map<String,Double> fetch(@PathVariable Integer stockId)throws JsonParseException, JsonMappingException, IOException {

          //Double d=  stockService.getStockPrice(stockId);
          Map<String,Double> mapPrice=new HashMap<String,Double>();
          mapPrice.put("StockPrice", stockService.getStockPrice(stockId));
          return   mapPrice;
      //   return new ResponseEntity<Double>(stockService.getStockPrice(stockId),HttpStatus.OK);

    }




       }
