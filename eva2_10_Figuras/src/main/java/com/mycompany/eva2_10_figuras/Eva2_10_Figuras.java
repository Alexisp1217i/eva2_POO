/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_figuras;

/**
 *
 * @author nancy
 */
public class Eva2_10_Figuras {

    public static void main(String[] args) {
       Circulo circulo = new Circulo(100);
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetrio: " + circulo.calcularPerimetro());
        
        Rectangulo rect = new Rectangulo();
        System.out.println("Base: " + rect.calcularArea());
        System.out.println("Perimetro rectangulo: " + rect.calcularPerimetro());
    }
    
}
