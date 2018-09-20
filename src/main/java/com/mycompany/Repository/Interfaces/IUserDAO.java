/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Repository.Interfaces;

import com.mycompany.Model.Permission;
import com.mycompany.Model.User;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface IUserDAO {
    public void save(User user);
    public void update(User user);
    public void delete(User user);
    public User load(Integer code);
    public User findPerLogin(String login);
    public List<User> listAll();
    public List<User> listPerPermisson(Permission permission);
}
