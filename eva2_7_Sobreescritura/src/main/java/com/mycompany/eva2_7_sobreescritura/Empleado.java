/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_sobreescritura;

/**
 *
 * @author nancy
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    public Empleado(String nombre, String apellido, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalario(){
       return salario;  
    }
    
    @Override
    public String toString(){
        String cade = "Nombre: " + nombre + "\n" +
                "Apellido: " +  apellido +  "\n" + 
                "Salario (Sin calculo): " + salario + "\n";
        return cade;
    }
}
