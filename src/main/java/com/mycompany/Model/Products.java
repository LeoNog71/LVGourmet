/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

/**
 *
 * @author Leonardo
 */
public class Products {
    
    private long id;
    private String name;
    private String brand;
    private String type;
    private Integer stockQuantity;
    private Double salePrice;
    private Double purchasePrice;
    
    //contructors

    public Products(long id, String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.stockQuantity = stockQuantity;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
    }

    public Products() {
    }
    
    //contructors

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    
}
