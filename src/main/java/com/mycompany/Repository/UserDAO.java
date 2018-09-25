/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Repository;

import com.mycompany.LVGourmet.SaveBean;
import com.mycompany.Model.Permission;
import com.mycompany.Model.User;
import com.mycompany.Repository.Conection.ConexaoHibernate;
import com.mycompany.Repository.Interfaces.IUserDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class UserDAO implements IUserDAO{

    //private Session session;
    private EntityManager manager;
    
    public UserDAO() {
        this.manager = ConexaoHibernate.getInstance();
        //this.manager.getTransaction().begin();
    }
     public void setSession(Session session) {
        //this.session = session;
    }
    
    public void setManager(EntityManager manager) {
        this.manager = manager;
    }
    
    @Override
    public void save(User user) {
        //this.session.save(usuario);
        this.manager.getTransaction().begin();
        this.manager.persist(user);
        this.manager.flush();
        this.manager.getTransaction().commit();
//        new SaveBean().showMessage();
    }

    @Override
    public void update(User user) {
        this.manager.getTransaction().begin();
        this.manager.persist(user);
        this.manager.flush();
        this.manager.getTransaction().commit();
    }

    @Override
    public void delete(User user) {
        //this.session.delete(usuario);
        this.manager.getTransaction().begin();
        this.manager.remove(user);
        this.manager.flush();
        this.manager.getTransaction().commit();
    }

    @Override
    public User load(Integer code) {
        return (User) this.manager.find(User.class, code);
    }

    @Override
    public User findPerLogin(String login) {
        String hql = "select u from users u where u.login = :login";
        javax.persistence.Query consulta = this.manager.createQuery(hql);
        consulta.setParameter("login", login);
        return (User) consulta.getSingleResult();
    }

    @Override
    public List<User> listAll() {
        TypedQuery<User> query = this.manager.createQuery("from User U ", User.class);
        List<User> objects = query.getResultList();
        return objects;
        
    }

    @Override
    public List<User> listPerPermisson(Permission permission) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
