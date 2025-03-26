/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_10_figuras;

/**
 *
 * @author nancy
 */
public class Rectangulo extends Figura{
    
    public double base;
    public double altura;

    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   
    
    @Override
    public double calcularArea() {
      return  base * altura;
    }

    @Override
    public double calcularPerimetro() {
     return base * 2 + altura * 2;
    }
    
    
}
