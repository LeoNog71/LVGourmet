/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "juices")
public class Juice extends Products{
    
    @Column(nullable = false)
    private Double volume;
    
    @ManyToOne
    private FlavorJuice flavorJuice;
    
    //constructors

    public Juice(Double volume, FlavorJuice flavorJuice, long id, String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
        super(id, name, brand, type, stockQuantity, salePrice, purchasePrice);
        this.volume = volume;
        this.flavorJuice = flavorJuice;
    }

    public Juice(Double volume, FlavorJuice flavorJuice, String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
        super(name, brand, type, stockQuantity, salePrice, purchasePrice);
        this.volume = volume;
        this.flavorJuice = flavorJuice;
    }
    
    

    public Juice() {
    }
    
    //getters and setters

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public FlavorJuice getFlavorJuice() {
        return flavorJuice;
    }

    public void setFlavorJuice(FlavorJuice flavorJuice) {
        this.flavorJuice = flavorJuice;
    }
    
}
