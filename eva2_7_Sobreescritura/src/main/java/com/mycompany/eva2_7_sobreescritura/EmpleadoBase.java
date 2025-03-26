/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_sobreescritura;

/**
 *
 * @author nancy
 */
public class EmpleadoBase extends Empleado{
    
    private int numeroEmpleado;
    private double bono;

    public EmpleadoBase() {
       super();
       this.numeroEmpleado = 0;
       this.bono = 0;
    }

    public EmpleadoBase(int numeroEmpleado, double bono, String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        this.numeroEmpleado = numeroEmpleado;
        this.bono = bono;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public double getBono() {
        return bono;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    @Override//Para sobreescribir
    public double calcularSalario(){
        return super.calcularSalario()* (1 + bono);
        
    }
    
    @Override
    public String toString(){
        String cade = super.toString();
        cade = cade + "Numero de empleado: " + numeroEmpleado + "\n" +
                "Bono: " +  bono + "\n" + 
                "Salario total; " + calcularSalario();
        return cade;
    }
}
