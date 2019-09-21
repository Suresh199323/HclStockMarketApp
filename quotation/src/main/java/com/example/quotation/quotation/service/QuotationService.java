package com.example.quotation.quotation.service;

import javafx.beans.binding.DoubleExpression;

public interface QuotationService {

String saveStockInfo(Integer userId, Integer stockId, Double quantity);
Double totalStockAmount(Double stockPrice, Double quantity);

}
