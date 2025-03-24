/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.familysearchcontrol.model;

/**
 *
 * @author absar
 */
public class User extends Administrator{

    public User() {
    }

    public User(int _id, String _name, String _email, String _username, String _password, boolean _access, String _username_platform, String _password_platform) {
        super(_id, _name, _email, _username, _password, false, "", "");
    }

    
      
}
