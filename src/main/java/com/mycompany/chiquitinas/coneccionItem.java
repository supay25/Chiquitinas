/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jose
 */
public class coneccionItem extends Coneccion {

    public coneccionItem() {
    }
    public int BuscarID(Producto c) {
        int ID = 0;
        
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("SELECT ID_Producto FROM producto where Precio =  100");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ID = rs.getInt("ID_Producto");
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }

        return ID;
    }
    public int BuscarIDOrden(Item c) {
        int ID = 0;
        
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("SELECT ID_Orden FROM chiquitinas.orden where ID_Orden = 41");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ID = rs.getInt("ID_Orden");               
            }
            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }

        return ID;
    }
    
    public void insertar(Producto c, Item cl) {
            try {
                PreparedStatement stmt = super.getConexion().prepareStatement("INSERT INTO detallesorden(Cantidad, ID_Orden,ID_Producto) VALUES (?,?,?)");
                int idProducto = BuscarID(c);
                int idOrden = BuscarIDOrden(cl);
                stmt.setInt(1, (int) cl.getCantidad());
                stmt.setInt(2, idOrden);
                stmt.setInt(3, idProducto);
                stmt.execute();

                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Error al insertar Orden: " + ex.getMessage());
            }
    }  
    
}
