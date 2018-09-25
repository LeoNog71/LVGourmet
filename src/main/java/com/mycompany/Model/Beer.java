/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "beers")
public class Beer extends Products{
    
    @Column(nullable = false)
    private Double volume;
    
    //constructors
    public Beer(Double volume, long id, String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
        super(id, name, brand, type, stockQuantity, salePrice, purchasePrice);
        this.volume = volume;
    }

    public Beer(Double volume, String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
        super(name, brand, type, stockQuantity, salePrice, purchasePrice);
        this.volume = volume;
    }
    

    public Beer() {
        
    }
    
    //getters and setters
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
    
    
}
