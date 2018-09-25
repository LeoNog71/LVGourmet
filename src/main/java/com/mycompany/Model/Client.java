/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.util.Date;
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
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue
    private long id;
    
    @Column(length = 60, nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String cpf;
    
    @Column(nullable = false)
    private String rg;
    
    @Column(nullable = false)
    private Integer phoneNumber;
    
    @Column(nullable = false)
    private Date dateOfBirth;
    
    
    private Boolean status;
    
    @ManyToOne(optional = false,cascade=CascadeType.PERSIST)
    private Address address;
    
    @Column(nullable = false)
    private String email;
    
    //constructors
    public Client(long id, String name, String cpf, String rg, Integer phoneNumber, Date dateOfBirth, Boolean status, Address address, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.address = address;
        this.email = email;
    }

    public Client() {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
