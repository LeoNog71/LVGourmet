/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.util.List;

/**
 *
 * @author Leonardo
 */
public class Pizza extends Products{
    
    private List<FlavorPizza> flavorPizza;
    private String descripition;
    private List<AdditionalPizza> additionalPizza;
    private String size;
    //contructors

    public Pizza(List<FlavorPizza> flavorPizza, String descripition, List<AdditionalPizza> additionalPizza, String size, long id, String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
        super(id, name, brand, type, stockQuantity, salePrice, purchasePrice);
        this.flavorPizza = flavorPizza;
        this.descripition = descripition;
        this.additionalPizza = additionalPizza;
        this.size = size;
    }

   

    public Pizza() {
    }
    
    //getters and setters
    public List<FlavorPizza> getFlavorPizza() {
        return flavorPizza;
    }

    public void setFlavorPizza(List<FlavorPizza> flavorPizza) {
        this.flavorPizza = flavorPizza;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public List<AdditionalPizza> getAdditionalPizza() {
        return additionalPizza;
    }

    public void setAdditionalPizza(List<AdditionalPizza> additionalPizza) {
        this.additionalPizza = additionalPizza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}
