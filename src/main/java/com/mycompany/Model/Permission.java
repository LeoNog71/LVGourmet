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
@Table(name = "permissions")
public class Permission {
    
    @Id
    @GeneratedValue
    private long Id;
    
    @Column(length = 60, nullable = false)
    private String permission;
    
    @Column(length = 60, nullable = true)
    private String description;
    
    //constructors

    public Permission(long Id, String permission, String description) {
        this.Id = Id;
        this.permission = permission;
        this.description = description;
    }
    public Permission( String permission, String description) {
        
        this.permission = permission;
        this.description = description;
    }

    public Permission() {
    }
    
    
    //getters and setters
    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
