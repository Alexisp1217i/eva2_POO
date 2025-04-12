/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_libro;

/**
 *
 * @author diegi
 */
public class EVA2_18_LIBRO {

    public static void main(String[] args) {
    MaterialBibliografico material = new MaterialBibliografico();
    material.setAnoPublicacion(1930);
    material.setTitulo("Los tres mosqueteros");
    
    
    Libro libro=new Libro("Terror", "Diego Salas");
    material.setLibro(libro);
    
    }
}
