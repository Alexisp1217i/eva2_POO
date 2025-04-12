/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_18_libro;

/**
 *
 * @author diegi
 */
public class Autor extends MaterialBibliografico{
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad, String titulo, int anoPublicacion) {
        super(titulo, anoPublicacion);
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Autor() {
        super();
        this.nombre = "---------------";
        this.nacionalidad = "-------------";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void imprimirDatos(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Nacionalidad: " + nacionalidad);
    System.out.println("Año de publicacion: " + super.anoPublicacion);
    System.out.println("Titulo: " + super.titulo);
}
}