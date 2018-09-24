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
@Table(name = "adresses")
public class Address {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable = false)
    private String street;
    
    @Column(nullable = false)
    private Integer number;
    
    @Column(nullable = false)
    private String district;
    
    @Column(nullable = false)
    private String State;
    
    @Column(nullable = false)
    private String country;
    
    //contructors
    public Address(long id, String street, Integer number, String district, String State, String country) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.district = district;
        this.State = State;
        this.country = country;
    }

    public Address() {
    }
    
    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
