/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.familysearchcontrol.model;

/**
 *
 * @author absar
 */
public class Administrator {
    protected int _id;
    protected String _name;
    protected String _email;
    protected String _username;
    protected String _password;
    private boolean _access;
    private String _username_platform;
    private String _password_platform;
    
    public Administrator () {}

    public Administrator(int _id, String _name, String _email, String _username, String _password, boolean _access, String _username_platform, String _password_platform) {
        this._id = _id;
        this._name = _name;
        this._email = _email;
        this._username = _username;
        this._password = _password;
        this._access = _access;
        this._username_platform = _username_platform;
        this._password_platform = _password_platform;
    }

    
    
    
    
    
}
