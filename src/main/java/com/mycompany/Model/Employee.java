/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.util.Date;

/**
 *
 * @author Leonardo
 */
public class Employee {
    
    private long id;
    private String name;
    private String cpf;
    private String rg;
    private Integer phoneNumber;
    private Date adimissionDate;
    private Date dateOfBirth;
    private Date resignationDate;
    private Boolean status;
    private Address address;
    private JobRole jobRole;
    
    //contructors

    public Employee(long id, String name, String cpf, String rg, Integer phoneNumber, Date adimissionDate, Date dateOfBirth, Date resignationDate, Boolean status, Address address, JobRole jobRole) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.phoneNumber = phoneNumber;
        this.adimissionDate = adimissionDate;
        this.dateOfBirth = dateOfBirth;
        this.resignationDate = resignationDate;
        this.status = status;
        this.address = address;
        this.jobRole = jobRole;
    }

    public Employee() {
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

    public Date getAdimissionDate() {
        return adimissionDate;
    }

    public void setAdimissionDate(Date adimissionDate) {
        this.adimissionDate = adimissionDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getResignationDate() {
        return resignationDate;
    }

    public void setResignationDate(Date resignationDate) {
        this.resignationDate = resignationDate;
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

    public JobRole getJobRole() {
        return jobRole;
    }

    public void setJobRole(JobRole jobRole) {
        this.jobRole = jobRole;
    }
    
    
    
   
}
