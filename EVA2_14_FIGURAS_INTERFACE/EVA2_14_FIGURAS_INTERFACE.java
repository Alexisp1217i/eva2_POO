/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_figuras_interface;

/**
 *
 * @author diegi
 */
public class EVA2_14_FIGURAS_INTERFACE {

    public static void main(String[] args) {
  Circulo cir = new Circulo(100);
        System.out.println("Area " + cir.calcularArea());
        System.out.println("Perimetro " + cir.calcularPerimetro());
        
            Rectangulo rec = new Rectangulo();
        System.out.println("Area " + rec.calcularArea());
        System.out.println("Perimetro " + rec.calcularPerimetro());
    }
}
