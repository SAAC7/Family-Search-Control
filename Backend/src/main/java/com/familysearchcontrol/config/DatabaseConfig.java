/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.familysearchcontrol.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author absar
 */
public class DatabaseConfig {
    private static final String DB_URL = "jdbc:sqlite:src/main/resources/db/FamilySearchControl.db";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
}
