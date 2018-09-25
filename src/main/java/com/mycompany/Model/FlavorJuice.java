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
@Table(name = "flavor_juices")
public class FlavorJuice {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(length = 60, nullable = false)
    private String name;
    
    @Column(nullable = false)
    private Boolean disponible;
    //constructors
    public FlavorJuice(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public FlavorJuice(String name, Boolean disponible) {
        this.name = name;
        this.disponible = disponible;
    }
    

    public FlavorJuice() {
    }
    
    //getters and setters

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

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}
