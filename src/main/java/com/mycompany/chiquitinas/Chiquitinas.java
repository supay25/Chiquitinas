/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chiquitinas;

import java.util.Date;

//Intergrantes 
//Luis Arturo Diaz Uceda
//Jose Manuel Cardozo Quintero
public class Chiquitinas {

    public static void main(String[] args) {
       Cliente cliente = new PersonaFisica();
            cliente.setId(1);
            cliente.setNombre("Bernalito");
            cliente.setDireccion("Cartago");
            cliente.setCorreo("info@gmail.com");
            
            Orden orden = new Orden();
            orden.setId(100);
            orden.setFecha(new Date());
            orden.setCliente(cliente);
            
            Producto producto = new Remolacha();
            producto.setId(1);
            producto.setNombre("Remolacha");
            producto.setPrecio(100.00);
            
            Producto producto2 = new Chayote();
            producto2.setId(1);
            producto2.setNombre("Chayote");
            producto2.setPrecio(500.00);
            
            Producto producto3 = new Remolacha();
            producto3.setId(1);
            producto3.setNombre("Remolachaaa");
            producto3.setPrecio(540.00);
            
            Producto producto4 = new Chayote();
            producto4.setId(1);
            producto4.setNombre("Chayote");
            producto4.setPrecio(234.00);
            
            Item item = new Item(1, 5, producto);
            Item item2 = new Item(2, 4, producto2);
            Item item3 = new Item(3, 6, producto3);
            Item item4 = new Item(4, 3, producto4);
            orden.agregarItem(item);
            orden.agregarItem(item2);
            orden.agregarItem(item3);
            orden.agregarItem(item4);
            
            
            System.out.println(orden);
            
            
            
    }
}
