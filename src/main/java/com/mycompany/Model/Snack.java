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
public class Snack extends Products{
    
    private FlavorSnack flavorSnack;
    private String descripition;
    private List<AdditionalSnack> additionalSnack;
    
    //constructors

    public Snack(FlavorSnack flavorSnack, String descripition, List<AdditionalSnack> additionalSnack, long id, String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
        super(id, name, brand, type, stockQuantity, salePrice, purchasePrice);
        this.flavorSnack = flavorSnack;
        this.descripition = descripition;
        this.additionalSnack = additionalSnack;
    }

    public Snack() {
    }
    
    //getters and setters

    public FlavorSnack getFlavorSnack() {
        return flavorSnack;
    }

    public void setFlavorSnack(FlavorSnack flavorSnack) {
        this.flavorSnack = flavorSnack;
    }

    public String getdescripition() {
        return descripition;
    }

    public void setdescripition(String descripition) {
        this.descripition = descripition;
    }

    public List<AdditionalSnack> getAdditionalSnack() {
        return additionalSnack;
    }

    public void setAdditionalSnack(List<AdditionalSnack> additionalSnack) {
        this.additionalSnack = additionalSnack;
    }
    

}

