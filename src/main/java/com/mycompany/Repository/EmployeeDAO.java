/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Repository;

import com.mycompany.LVGourmet.SaveBean;
import com.mycompany.Model.Employee;
import com.mycompany.Repository.Conection.ConexaoHibernate;
import com.mycompany.Repository.Interfaces.IEmployee;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Leonardo
 */
public class EmployeeDAO implements IEmployee{
    
    private EntityManager manager;
    
    public EmployeeDAO() {
        this.manager = ConexaoHibernate.getInstance();
        //this.manager.getTransaction().begin();
    }
    
    @Override
    public void save(Employee employee) {
        this.manager.getTransaction().begin();
        this.manager.persist(employee);
        this.manager.flush();
        this.manager.getTransaction().commit();
        this.manager.close();
//        new SaveBean().showMessage();
    }

    @Override
    public void update(Employee employee) {
        this.manager.getTransaction().begin();
        this.manager.persist(employee);
        this.manager.flush();
        this.manager.getTransaction().commit();
    }

    @Override
    public void delete(Employee employee) {
        this.manager.getTransaction().begin();
        this.manager.remove(employee);
        this.manager.flush();
        this.manager.getTransaction().commit();
    }

    @Override
    public Employee load(Integer code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee findPerName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
