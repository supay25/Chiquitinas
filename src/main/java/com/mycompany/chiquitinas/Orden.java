/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Orden extends Cliente{
     private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Item> listaItems = new ArrayList<Item>();

    public Orden() {
    }

    public Orden(int id, Date fecha, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarItem(Item item) {
        this.listaItems.add(item);
    }
    
    
    
    
    
    @Override
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        sb.append("====================================================\n");
        sb.append("==================== CHIQUITINAS ===================\n");
        sb.append("====================================================\n");
        sb.append("Nombre:\t"+this.cliente.getNombre()+"\tNo. Orden: "+this.getId()+"\n");
        sb.append("Dirección:"+this.getCliente().getDireccion()+"\tCorreo: "+this.getCliente().getCorreo()+"\n");
        double pre;
        double post;
        double total;
        List<Double> totales = new ArrayList<>(); 
        sb.append("====================================================\n");
        for (Item item : this.listaItems) {
            double impuesto = 0.0;
            if (item.getProducto() instanceof Remolacha) {
                impuesto = ((Remolacha)item.getProducto()).getImpuesto();
            }
            
            
            pre =(item.getCantidad() * item.getProducto().getPrecio());
            post = pre * impuesto;
            total= pre + post;
            sb.append(item.getConsecutivo() + " - "+ item.getCantidad() + " - "+ item.getProducto().getNombre() + " - " +item.getProducto().getPrecio()+" - "+impuesto+"    "+total +"\n");
            
            totales.add(total);
        }
        double sumaTotal = 0.0;
        for (Double totall : totales) {
            sumaTotal += totall;
        }
        sb.append("====================================================\n");
        sb.append("Total de la orden: " + sumaTotal + "\n");

        return sb.toString() ;
    }
    
}
