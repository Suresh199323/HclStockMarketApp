package com.example.quotation.quotation.impl;

import com.example.quotation.quotation.entity.Quotation;
import com.example.quotation.quotation.repository.QuotaionRepository;
import com.example.quotation.quotation.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
  @Service
   public class QuotationServiceImpl implements QuotationService {
      public String URL="http://localhost:2222/stock/stockprice/";

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    QuotaionRepository quotaionRepository;

    @Override
    public String saveStockInfo(Integer userId, Integer stockId, Double quantity) {
        //@SuppressWarnings("unchecked")
        Map<String, Double> map=restTemplate.getForObject(URL + stockId, HashMap.class);
        System.out.println("price of stock is "+ map.get("StockPrice"));

//        Double stockPrice = map.get(StockPrice);
        Double stockPrice=221d;


        Double totalAmount=totalStockAmount(stockPrice,quantity);
        Quotation quotation=new Quotation();
        quotation.setStockId(stockId);
        quotation.setUserID(userId);
        quotation.setQuantity(quantity);
        quotation.setUnitPrice(stockPrice);
        quotation.setTotalAmount(totalAmount);

        quotaionRepository.save(quotation);
        return "success";
    }

    @Override
    public Double totalStockAmount(Double stockPrice, Double quantity) {
        double d=stockPrice.doubleValue();
        d=(d*0.5)/100;
        d=d+stockPrice;

        return (Double.valueOf(d))*5;
    }
}
