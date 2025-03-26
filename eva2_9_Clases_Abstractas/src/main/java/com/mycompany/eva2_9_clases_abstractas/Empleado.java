/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_clases_abstractas;

/**
 *
 * @author nancy
 */
public class Empleado extends Persona{
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimirDatos() {
 System.out.println("Empleado");
                System.out.println("Nombre: " + getNombre());
            System.out.println("Apellido: " + getApellido());
            System.out.println("Edad: " + getEdad());
            System.out.println("Salario: " + salario);    }
    
    
    
}
