package com.ab7ec.backend;

import io.javalin.Javalin;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author absar
 */
public class Backend {

    public static void main(String[] args) {
        Javalin app_port = Javalin.create(config -> {
        }).start(7000);
        UserController.registerEndpoints(app);
    }
}
