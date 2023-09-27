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

public class ConeccionCliente extends Coneccion {
    
     public ConeccionCliente() {
    }

    public List<Cliente> lista() {
        List<Cliente> listaRetorno = new ArrayList<Cliente>();
        
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("SELECT id, nombre, direccion, correo FROM cliente ORDER BY id");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                
                Cliente c = new Cliente(id, nombre, direccion,correo);
                listaRetorno.add(c);
            }
            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }

        return listaRetorno;
    }
    
        public Cliente Buscar(int idParam) {
        Cliente c = null;
        
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("SELECT id, nombre, direccion, correo FROM cliente WHERE id=? ORDER BY id");
            stmt.setInt(1, idParam);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                
                c = new Cliente(id, nombre, direccion, correo);
            }
            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }

        return c;
    }
    

    public void insertar(Cliente c) {
        try {
            PreparedStatement stmt = super.getConexion().prepareStatement("INSERT INTO cliente(nombre, direccion, correo) VALUES (?,?,?)");

            stmt.setString(1, c.getNombre());
            stmt.setString(2, c.getDireccion());
            stmt.setString(3, c.getCorreo());

            stmt.execute();

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar cliente: " + ex.getMessage());
        }

    }

    
    public void eliminar(int idCliente) {
    try {
        PreparedStatement stmt = super.getConexion().prepareStatement("DELETE FROM cliente WHERE id = ?");
        stmt.setInt(1, idCliente);
        stmt.execute();
        stmt.close();
    } catch (SQLException ex) {
        System.out.println("Error al eliminar cliente: " + ex.getMessage());
    }
}
    
    
}
