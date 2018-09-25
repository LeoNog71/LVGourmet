/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name= "users")
public class User {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(length = 60, nullable = false)
    private String login;
    
    @Column(length = 60, nullable = false)
    private String password;
    
    private Boolean status;
    
    @ManyToOne
    private Permission permisson;
    
    @ManyToOne(cascade=CascadeType.PERSIST)
    private Employee employee;
    
    //constructor
    public User(long id, String login, String password, Boolean status, Permission permisson, Employee employee) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.status = status;
        this.permisson = permisson;
        this.employee = employee;
    }
    public User(){
        
    }
    
    
    //geters and seters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Permission getPermisson() {
        return permisson;
    }

    public void setPermisson(Permission permisson) {
        this.permisson = permisson;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
