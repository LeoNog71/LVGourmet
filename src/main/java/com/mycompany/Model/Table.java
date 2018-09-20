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
public class Table {
    
    private long id;
    private Integer number;
    private Boolean status;
    private Double total;
    private Client client;
    private Employee employee;
    private List<Request> requests;
    
    //contructors

    public Table(long id, Integer number, Boolean status, Double total, Client client, Employee employee, List<Request> requests) {
        this.id = id;
        this.number = number;
        this.status = status;
        this.total = total;
        this.client = client;
        this.employee = employee;
        this.requests = requests;
    }

    
    public Table() {
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
