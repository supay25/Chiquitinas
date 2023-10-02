/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chiquitinas;

import java.sql.SQLException;
import java.util.Date;

//Intergrantes 
//Luis Arturo Diaz Uceda
//Jose Manuel Cardozo Quintero
public class Chiquitinas {

    public static void main(String[] args) throws SQLException {
       
       
        
            
        ConeccionCliente c = new ConeccionCliente();
        ConeccionProducto p = new ConeccionProducto();
        coneccionOrden o = new coneccionOrden();
        Cliente cliente = new PersonaFisica(); 
        coneccionItem i = new coneccionItem();
        
 
        Cliente cliente1 = new PersonaFisica();     
        cliente.setNombre("Josee");
        cliente.setDireccion("San Jose");
        cliente.setCorreo("jmcardozo.q@gmail.com"); 
       // c.insertar(cliente);
        
         Orden orden = new Orden();
         orden.setCliente(cliente);
         orden.setFecha("2023-03-02");       
         //o.insertar(orden,cliente);
         
         Producto producto = new Remolacha();
         
        Item item = new Item(1, 5, producto);
        Item item2 = new Item(2, 4, producto);
        Item item3 = new Item(3, 6, producto);
        Item item4 = new Item(4, 3, producto);
        //i.insertar(producto, item);
       // i.insertar(producto, item2);
       // i.insertar(producto, item3);
       // i.insertar(producto, item4);
        
        o.mostrarOrden();
        o.mostrarCliente();
        o.mostrarFecha();
        System.out.print("Total a pagar: " + o.mostrarProducto());
           
        /*Cliente cliente = new PersonaFisica();
            cliente.setId(1);
            cliente.setNombre("Bernalito");
            cliente.setDireccion("Cartago");
            cliente.setCorreo("info@gmail.com");
            
            Orden orden = new Orden();
            orden.setId(100);
            orden.setFecha(new Date());
            orden.setCliente(cliente);
            
            
            
            Producto producto2 = new Chayote();
            producto2.setId(1);
            producto2.setNombre("Chayote");
            producto2.setPrecio(500.00);
            
            Producto producto3 = new Remolacha();
            producto3.setId(1);
            producto3.setNombre("Remolacha");
            producto3.setPrecio(540.00);
            
            Producto producto4 = new Chayote();
            producto4.setId(1);
            producto4.setNombre("Chayote");
            producto4.setPrecio(234.00);
            
            
            
            
            
            
            
            System.out.println(orden);*/
            
            
            
    }
}
