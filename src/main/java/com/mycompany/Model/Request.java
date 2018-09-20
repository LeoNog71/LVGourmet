/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class Request {
    
    private long id;
    private Double total;
    private Date orderTime;
    private Boolean status;
    private List<Products> produtos;
    
    //contructors

    public Request(long id, Double total, Date orderTime, Boolean status, List<Products> produtos) {
        this.id = id;
        this.total = total;
        this.orderTime = orderTime;
        this.status = status;
        this.produtos = produtos;
    }

    public Request() {
    }
    
    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Products> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Products> produtos) {
        this.produtos = produtos;
    }
    
}
