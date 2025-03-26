/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_herencia_apa;

/**
 *
 * @author Alexis
 */
public class Libro extends FichaApa{
    
   private String ciudad; 
   private String editorial; 

    public Libro(String ciudad, String editorial) {
        this.ciudad = ciudad;
        this.editorial = editorial;
    }

    public Libro(String autor, String titulo, int year,String ciudad, String editorial) {
       super(autor, titulo, year);
       this.ciudad = ciudad;
       this.editorial = editorial;
    }
   
   

    public String getCiudad() {
        return ciudad;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
   
   
   
            
}