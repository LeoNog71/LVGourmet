/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Repository.Interfaces;

import com.mycompany.Model.Permission;

import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface IPermissionsDAO {
    public void save(Permission permission);
    public List<Permission> listAll();
}
