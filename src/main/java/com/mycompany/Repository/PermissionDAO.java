/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Repository;


import com.mycompany.Model.Permission;
import com.mycompany.Repository.Conection.ConexaoHibernate;
import com.mycompany.Repository.Interfaces.IPermissionsDAO;
import java.security.Permissions;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Leonardo
 */
public class PermissionDAO implements IPermissionsDAO{

    private EntityManager manager;
   
    public PermissionDAO() {
        this.manager = ConexaoHibernate.getInstance();
    }
   
    
    @Override
    public void save(Permission permission) {
        this.manager.getTransaction().begin();
        this.manager.persist(permission);
        this.manager.flush();
        this.manager.getTransaction().commit();
        this.manager.close();
    }

    @Override
    public List<Permission> listAll() {
        TypedQuery<Permission> query = this.manager.createQuery("from Permissions P ", Permission.class);
        
        return query.getResultList();
    }
    
}
