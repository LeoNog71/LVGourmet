/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "products")
@Inheritance(strategy=InheritanceType.JOINED)
public class Products {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(length = 60, nullable = false)
    private String name;
        
    @Column(length = 60, nullable = false)
    private String brand;
    
    @Column(length = 60, nullable = false)
    private String type;
    
    @Column(nullable = false)
    private Integer stockQuantity;
    
    @Column(nullable = false)
    private Double salePrice;
    
    @Column(nullable = false)
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

    public Products(String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
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
