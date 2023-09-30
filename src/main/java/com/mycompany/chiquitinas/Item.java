/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas;

/**
 *
 * @author luisd
 */
public class Item {
    private int consecutivo;
    private int cantidad;
    private Producto producto;

    public Item() {
    }

    public Item(int consecutivo, int cantidad, Producto producto) {
        this.consecutivo = consecutivo;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
