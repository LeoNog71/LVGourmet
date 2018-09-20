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
public class Permission {

    private long Id;
    private String permission;
    private String description;
    
    //constructors

    public Permission(long Id, String permission, String description) {
        this.Id = Id;
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
