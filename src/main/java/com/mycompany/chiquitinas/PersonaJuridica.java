/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chiquitinas;

/**
 *
 * @author luisd
 */
public class PersonaJuridica extends Cliente {
    private String Contacto;

    public PersonaJuridica() {
    }

    public PersonaJuridica(String Contacto) {
        this.Contacto = Contacto;
    }

    public PersonaJuridica(String Contacto, int id, String nombre, String direccion, String correo) {
        super(id, nombre, direccion, correo);
        this.Contacto = Contacto;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }
    
}
