/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas;

/**
 *
 * @author luisd
 */
public class Remolacha extends Producto implements IImpuesto {

    @Override
    public double getImpuesto() {
       return 0.02;
    }
    
}
