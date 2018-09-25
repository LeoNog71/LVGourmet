/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "cashiers")
public class Cashier {
    
    @Id
    @GeneratedValue
    private long id;
    
    @ManyToMany
    private List<Sale> sales;
    
    @Column(nullable = false)
    private Date startDate;
    
    @Column(nullable = false)
    private Date endDate;
    
    @Column(nullable = false)
    private Double total;
    
    @Column(nullable = false)
    private Double push;
    
    //contructors

    public Cashier(long id, List<Sale> sales, Date startDate, Date endDate, Double total, Double push) {
        this.id = id;
        this.sales = sales;
        this.startDate = startDate;
        this.endDate = endDate;
        this.total = total;
        this.push = push;
    }

    public Cashier(List<Sale> sales, Date startDate, Date endDate, Double total, Double push) {
        this.sales = sales;
        this.startDate = startDate;
        this.endDate = endDate;
        this.total = total;
        this.push = push;
    }
    

    public Cashier() {
    }
    
    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getPush() {
        return push;
    }

    public void setPush(Double push) {
        this.push = push;
    }
    
}
