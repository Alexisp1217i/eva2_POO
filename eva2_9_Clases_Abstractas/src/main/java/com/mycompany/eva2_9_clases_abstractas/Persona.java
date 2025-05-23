/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_clases_abstractas;

/**
 *
 * @author nancy
 */
public abstract class  Persona {
    private String nombre;
    private String apellido;
    private int edad;

    
    public Persona() {
        this.nombre = "---";
        this.apellido = "---";
        this.edad = 0;
    }
    
    
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //no tiene metodo para implementar en persona
    public abstract void imprimirDatos();
    
    
}
