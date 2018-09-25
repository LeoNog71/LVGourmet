/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.LVGourmet;

import com.mycompany.BusinessObject.UserBO;
import com.mycompany.LVGourmet.Interfaces.IUserBean;
import com.mycompany.Model.Permission;
import com.mycompany.Model.User;
import com.mycompany.Repository.UserDAO;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class UserBean implements IUserBean{
    
    private UserDAO userDAO;
    private UserBO userBO;
    
    public UserDAO userRepository(){
        if(this.userDAO == null){
           this.userDAO = new UserDAO(); 
        }
        return this.userDAO;
    }
    public UserBO userBo(){
        if(this.userBO == null){
            this.userBO = new UserBO();
        }
        return this.userBO;
    }
    
    @Override
    public void save(User user) {
        user.setPassword(userBo().encrypted(user.getPassword()));
        userRepository().save(user);
    }

    @Override
    public void update(User user) {
        user.setPassword(userBo().encrypted(user.getPassword()));
        userRepository().update(user);
    }

    @Override
    public void delete(User user) {
        user.setPassword(userBo().encrypted(user.getPassword()));
        userRepository().delete(user);
    }

    @Override
    public User load(Integer code) {
       return userRepository().load(code);
    }

    @Override
    public User findPerLogin(String login) {
        return userRepository().findPerLogin(login);
    }

    @Override
    public List<User> listAll() {
        return userRepository().listAll();
    }

    @Override
    public List<User> listPerPermisson(Permission permission) {
        return userRepository().listPerPermisson(permission);
    }

    @Override
    public Boolean validatyUser(User user) {
        
        user.setPassword(userBo().encrypted(user.getPassword()));
        
        User userBD = findPerLogin(user.getLogin());
        
        return userBD.equals(user);
    }

    
}
