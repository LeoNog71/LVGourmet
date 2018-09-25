/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Repository.Interfaces;

import com.mycompany.Model.Employee;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface IEmployee {
    public void save(Employee employee);
    public void update(Employee employee);
    public void delete(Employee employee);
    public Employee load(Integer code);
    public Employee findPerName(String name);
    public List<Employee> listAll();
}
