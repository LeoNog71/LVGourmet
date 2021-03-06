/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */

@Entity
@Table(name = "portions")
public class Portion extends Products{
    
    @ManyToOne
    private FlavorPortion flavorPortion;
    
    @Column(length = 60,nullable = false)
    private String descripition;
    
    @ManyToMany
    private List<AddtionalPortion> additionalPortion;
    
    //contructors

    public Portion(FlavorPortion flavorPortion, String descripition, List<AddtionalPortion> additionalPortion, long id, String name, String brand, String type, Integer stockQuantity, Double salePrice, Double purchasePrice) {
        super(id, name, brand, type, stockQuantity, salePrice, purchasePrice);
        this.flavorPortion = flavorPortion;
        this.descripition = descripition;
        this.additionalPortion = additionalPortion;
    }

    public Portion() {
    }
    
    //getters and setters

    public FlavorPortion getFlavorPortion() {
        return flavorPortion;
    }

    public void setFlavorPortion(FlavorPortion flavorPortion) {
        this.flavorPortion = flavorPortion;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public List<AddtionalPortion> getAdditionalPortion() {
        return additionalPortion;
    }

    public void setAdditionalPortion(List<AddtionalPortion> additionalPortion) {
        this.additionalPortion = additionalPortion;
    }
    
}
