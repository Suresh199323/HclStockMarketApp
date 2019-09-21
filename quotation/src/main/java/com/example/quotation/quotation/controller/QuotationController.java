package com.example.quotation.quotation.controller;

import com.example.quotation.quotation.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

  @RestController
  @RequestMapping("/quotaion")
   public class QuotationController {

    @Autowired
    QuotationService quotationService;
    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestParam  Integer userId, @RequestParam Integer stockId, @RequestParam Double quantity)
    {
        System.out.println("In Quotation Controller");
        quotationService.saveStockInfo(userId,stockId,quantity);

        return new ResponseEntity<String>(quotationService.saveStockInfo(userId,stockId,quantity), HttpStatus.OK);

    }

}
