package com.example.quotation.quotation.entity;

import javax.persistence.*;

@Entity
@Table(name = "quotation")
public class Quotation {

    @Id
    @Column
    @Access(AccessType.FIELD)
    private Integer userID;

    @Column
    @Access(AccessType.FIELD)
    private  Integer stockId;

    @Column
    @Access(AccessType.FIELD)
    private Double unitPrice;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Column
    @Access(AccessType.FIELD)
    private Double quantity;

    @Column
    @Access(AccessType.FIELD)
    private Double totalAmount;



}
