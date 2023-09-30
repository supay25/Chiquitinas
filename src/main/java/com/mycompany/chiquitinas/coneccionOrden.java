/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class coneccionOrden  extends Coneccion{

    public coneccionOrden() {
    }
    public int BuscarID(Cliente c) {
        int ID = 0;
        
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("SELECT ID_Cliente FROM cliente where Nombre = 'Josee'");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ID = rs.getInt("ID_Cliente");
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }

        return ID;
    }

    public void insertar(Orden c, Cliente cl) {
            try {
                PreparedStatement stmt = super.getConexion().prepareStatement("INSERT INTO orden(Fecha, Total,ID_Cliente) VALUES (?,?,?)");
                int idCliente = BuscarID(cl);
                stmt.setString(1,  c.getFecha());
                stmt.setDouble(2, c.getSumaTotal());
                stmt.setInt(3, idCliente);
                stmt.execute();

                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Error al insertar Orden: " + ex.getMessage());
            }
    }   
    public void mostrarOrden(){
        try {
            //PreparedStatement stmt = super.getConexion().prepareStatement("SELECT Fecha FROM Orden where ID_Orden = 41");
            //ResultSet rs = stmt.executeQuery();
            PreparedStatement stmt1 = super.getConexion().prepareStatement("SELECT Cantidad,ID_Orden FROM detallesorden where ID_Orden = 41");
            ResultSet rs1 = stmt1.executeQuery();
            int Cantidad =0;
            int ID_Orden=0;        
            /*
            PreparedStatement stmt2 = super.getConexion().prepareStatement("SELECT Nombre, Correo FROM cliente where ID_Cliente = 23");
            PreparedStatement stmt3 = super.getConexion().prepareStatement("SELECT Nombre FROM producto where Nombre = 'Remolacha'");
            
            
            ResultSet rs2 = stmt2.executeQuery();
            ResultSet rs3 = stmt3.executeQuery();*/

            while (rs1.next()) {
                //String fecha = rs1.getString("Fecha");
                Cantidad = rs1.getInt("Cantidad");
                ID_Orden = rs1.getInt("ID_Orden");
                System.out.println("Cantidad:" + Cantidad);
            System.out.println("Numero de Orden" +ID_Orden);
                /*
                String Nombre = rs2.getString("Nombre");
                String Correo = rs2.getString("Correo");
                String nombreProducto = rs3.getString("Nombre");*/
                //System.out.println(fecha);
                
     
            }
            
            rs1.close();          
            stmt1.close();                 

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }
    public void mostrarFecha(){
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("SELECT Fecha FROM Orden where ID_Orden = 41");
            ResultSet rs = stmt.executeQuery();                          

            while (rs.next()) {
                String fecha = rs.getString("Fecha");             
                System.out.println("Fecha" +fecha);
                
     
            }
            
            rs.close();          
            stmt.close();                 

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
        
    }
    public void mostrarProducto(){
        try {                   
            
            
            PreparedStatement stmt3 = super.getConexion().prepareStatement("SELECT Nombre FROM producto where Nombre = 'Remolacha'");
            
            
            
            ResultSet rs3 = stmt3.executeQuery();

            while (rs3.next()) {
                String nombre = rs3.getString("Nombre");
                System.out.println("Producto" +nombre);
     
            }
            
            rs3.close();          
            stmt3.close();                 

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }
    public void mostrarCliente(){
        try {                   
            
            
           PreparedStatement stmt2 = super.getConexion().prepareStatement("SELECT Nombre, Correo FROM cliente where ID_Cliente = 23");
            
            
            
            ResultSet rs3 = stmt2.executeQuery();

            while (rs3.next()) {
                String nombre = rs3.getString("Nombre");
                String Correo = rs3.getString("Correo");
                System.out.println("Nombre" +nombre);
                System.out.println("Correo" +Correo);
                
     
            }
            
            rs3.close();          
            stmt2.close();                 

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }
    
    
    
}
