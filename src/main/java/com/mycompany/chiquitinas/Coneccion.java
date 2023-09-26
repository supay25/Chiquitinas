/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jose
 */
public class Coneccion {
    private Connection conectar = null;
    private String url = "jdbc:mysql://localhost:3306/coevaluation?serverTimezone=UTC&zeroDateTimeBehavior=CONVERT_TO_NULL"; //Se busca el URL en el server
    private String usuario = "root"; //El usuario del MySQL
    private String password = "JOSMANU18"; // La contraseña del MySQL
    
    //Constructor

    public Coneccion() {
    }
    
    
    public Connection conectarBBDD() throws SQLException {
        conectar = DriverManager.getConnection(url, usuario, password);
        System.out.println("Conexión Exitosa " + conectar);
        return conectar;
    }
    
    public Connection getConexion() throws SQLException
    {
        if (conectar == null)        
            conectarBBDD();    
        return conectar;
    }
    
}
