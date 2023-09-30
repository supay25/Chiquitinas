/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConeccionProducto extends Coneccion{
 
    public ConeccionProducto() {
    }
    public List<Producto> lista() {
        List<Producto> listaRetornoP = new ArrayList<Producto>();
        
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("SELECT id, nombre, precio FROM producto ORDER BY id");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                Double precio = rs.getDouble("correo");
                
                Producto p = new Producto(id, nombre, precio);
                listaRetornoP.add(p);
            }
            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }

        return listaRetornoP;
    }
    
     public void insertar(Producto p) {
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("INSERT INTO producto(Nombre,Precio) VALUES (?,?)");

            stmt.setString(1, p.getNombre());
            stmt.setDouble(2, p.getPrecio());
            stmt.execute();
        
            stmt.execute();

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar producto: " + ex.getMessage());
        }
        
      
    
    
     } 
    
    
}
