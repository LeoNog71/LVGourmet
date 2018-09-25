/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "tables")
public class Tables {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable = false)
    private Integer number;
    
    @Column(nullable = false)
    private Boolean status;
    
    @Column(nullable = false)
    private Double total;
    
    @ManyToOne
    private Client client;
    
    @ManyToOne
    private Employee employee;
    
    @ManyToMany
    private List<Request> requests;
    
    //contructors

    public Tables(long id, Integer number, Boolean status, Double total, Client client, Employee employee, List<Request> requests) {
        this.id = id;
        this.number = number;
        this.status = status;
        this.total = total;
        this.client = client;
        this.employee = employee;
        this.requests = requests;
    }

    
    public Tables() {
    }
    
    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }
           
    
    
}
