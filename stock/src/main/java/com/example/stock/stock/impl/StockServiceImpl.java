package com.example.stock.stock.impl;

import com.example.stock.stock.entity.Stock;
import com.example.stock.stock.repository.StockRepository;
import com.example.stock.stock.service.StockService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    StockRepository stockRepository;


      @Override
       public Double getStockPrice(Integer stockId)throws JsonParseException, JsonMappingException, IOException {
          if(stockId==null){
              throw new RuntimeException("Stock Id is null");
          }

        Stock stock=stockRepository.findByStockId(stockId);
        String stockName= stock.getStockName();

        String url  = "https://financialmodelingprep.com/api/company/real-time-price/";
        if(stock!=null) {
            restTemplate = new RestTemplate();
           // String result = restTemplate.getForObject(url, String.class);
            ResponseEntity<String> response = restTemplate.getForEntity(url + stockName+"?datatype=json", String.class);
            //  assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

            if(response!=null) {
                ObjectMapper mapper=new ObjectMapper();
                JsonNode root = mapper.readTree(response.getBody());
                Double stockPrice=root.path("price").asDouble();
                if(stockPrice!=null)  {
                    return stockPrice;
                }
            }

        }
        return stock.getStockPrice();


    }
}
