/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.MAIN;

import com.mycompany.Model.Permission;
import com.mycompany.Model.User;
import com.mycompany.Repository.PermissionDAO;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Persistence;

/**
 *
 * @author Leonardo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persistence.createEntityManagerFactory("jsh_gourmet");
        
       
        
        Permission p1 = new Permission("SUPERADMIN", "JSVGOURMET TEAM");
        Permission p2 = new Permission("ADMIN", "TI CLIENT");
        Permission p3 = new Permission("CAIXA", "CAIXA ");
        Permission p4 = new Permission("PEDIDOS", "PEDIDOS");
        Permission p5 = new Permission("COZINHA", "COZINHA");
        
        List<Permission> pl = new ArrayList<>();
        PermissionDAO pdao  = new PermissionDAO();
        pl.add(p1);
        pl.add(p2);
        pl.add(p3);
        pl.add(p4);
        pl.add(p5);
        
        for(Permission p : pl){
            pdao.save(p);
        }
         
        
    }

}
