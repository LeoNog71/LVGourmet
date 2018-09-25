/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.BusinessObject;

import com.mycompany.LVGourmet.UserBean;
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class UserBO {
    
    public String encrypted(String pwd){
        MessageDigest algorithm;
       
        try {
            algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(pwd.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
              hexString.append(String.format("%02X", 0xFF & b));
            }
            String pwdHex = hexString.toString();
            return pwdHex;
        } catch (Exception ex) {
            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
