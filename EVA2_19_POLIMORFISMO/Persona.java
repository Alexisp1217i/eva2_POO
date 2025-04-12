/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_19_polimorfismo;

/**
 *
 * @author diegi
 */
public abstract class Persona{
    private String Nombre;
    private String Apellido;
    private int Year;

    public Persona(String Nombre, String Apellido, int Year) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Year = Year;
    }

    public Persona() {
        this.Nombre = "Nombre";
        this.Apellido = "Apellido";
        this.Year = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    
   public void imprimirDatos(){
       System.out.println("Nombre: " + Nombre);
       System.out.println("Apellido: " + Apellido);
       System.out.println("Edad: " + Year);
   }
}
