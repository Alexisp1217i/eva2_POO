/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_18_libro;

/**
 *
 * @author diegi
 */
public class Libro {
    private String genero;
    private String Autor;

    public Libro(String genero, String Autor) {
        this.genero = genero;
        this.Autor = Autor;
    }

    public Libro() {
        this.genero = "-----";
        this.Autor = "-----";
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
}
