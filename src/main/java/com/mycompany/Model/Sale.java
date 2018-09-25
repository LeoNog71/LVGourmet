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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "value")
public class Sale {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable = false)
    private Double value;
    
    @ManyToOne
    private Employee employee;
    
    @ManyToOne
    private Client client;
    
    @Column(nullable = false)
    private String Description;
    
    //contructors
    public Sale(long id, Double value, Employee employee, Client client, String Description) {
        this.id = id;
        this.value = value;
        this.employee = employee;
        this.client = client;
        this.Description = Description;
    }

    public Sale() {
    }
    
    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
