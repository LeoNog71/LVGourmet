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
public class FlavorSnack {
    
    private long id;
    private String name;
    private Boolean disponible;
    
    //contructors

    public FlavorSnack(long id, String name, Boolean disponible) {
        this.id = id;
        this.name = name;
        this.disponible = disponible;
    }

    public FlavorSnack() {
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
