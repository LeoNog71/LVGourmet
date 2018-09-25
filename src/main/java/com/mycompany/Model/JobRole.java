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
@Table(name = "job_roles")
public class JobRole {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable = false)
    private String jobRole;
    
    @Column(nullable = false)
    private String description;
    
    //contructors

    public JobRole(long id, String jobRole, String description) {
        this.id = id;
        this.jobRole = jobRole;
        this.description = description;
    }

    public JobRole(String jobRole, String description) {
        this.jobRole = jobRole;
        this.description = description;
    }
    
    public JobRole() {
    }
    
    //geters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
