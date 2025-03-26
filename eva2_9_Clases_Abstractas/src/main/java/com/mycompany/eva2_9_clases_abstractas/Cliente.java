/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_clases_abstractas;

/**
 *
 * @author nancy
 */
public class Cliente extends Persona{
    private String tipoPersona;

    public Cliente() {
        this.tipoPersona = "-----";
    }

    public Cliente(String tipoPersona, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.tipoPersona = tipoPersona;
    }

    
    
    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    @Override
    public void imprimirDatos() {
            System.out.println("Cliente");
                System.out.println("Nombre: " + getNombre());
            System.out.println("Apellido: " + getApellido());
            System.out.println("Edad: " + getEdad());
            System.out.println("Tipo persona: " + tipoPersona);
    }
    
    
}
