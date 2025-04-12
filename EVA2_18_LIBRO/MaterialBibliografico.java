/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_18_libro;

/**
 *
 * @author diegi
 */
public class MaterialBibliografico {
    String titulo;
    int anoPublicacion;
    private Libro libro;

    public MaterialBibliografico(String titulo, int anoPublicacion) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.libro=new Libro();
    }

    public MaterialBibliografico() {
        this.titulo = "-----------";
        this.anoPublicacion = 0;
        this.libro=new Libro();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    @Override
    public String toString(){
        return "Datos del Material Bibliografico: \n" +
                "Marca: " + anoPublicacion + "\n" +
                "Potencia: " + libro.getAutor()+ "\n" +
                "Gasolina: " + libro.getGenero()+ "\n";
}
}