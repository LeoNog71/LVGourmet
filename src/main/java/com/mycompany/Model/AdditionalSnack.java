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
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "additional_snack")
public class AdditionalSnack {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable = false)
    private Double price;
    
    @Column(length = 60, nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String descripition;
    
    @Column(nullable = false)
    private Boolean disponible;
    
    //contructors

    public AdditionalSnack(long id, Double price, String name, String descripition, Boolean disponible) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.descripition = descripition;
        this.disponible = disponible;
    }

    public AdditionalSnack(Double price, String name, String descripition, Boolean disponible) {
        this.price = price;
        this.name = name;
        this.descripition = descripition;
        this.disponible = disponible;
    }
    

    public AdditionalSnack() {
    }
    
    
    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdescripition() {
        return descripition;
    }

    public void setdescripition(String descripition) {
        this.descripition = descripition;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    
}
