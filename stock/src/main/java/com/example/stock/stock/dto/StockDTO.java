package com.example.stock.stock.dto;

public class StockDTO {

    private Integer stockId;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return stockPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.stockPrice = unitPrice;
    }

    private  String stockName;
    private String description;
    private Double stockPrice;

}
