/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_sobreescritura;

/**
 *
 * @author nancy
 */
public class EmpleadoTemporal extends Empleado{
    private int numeroDeContrato;
    private int horas;

    public EmpleadoTemporal() {
        super();
        this.numeroDeContrato = 0;
        this.horas = 0;
    }

    public EmpleadoTemporal(int numeroDeContrato, int horas, int numeroEmpleado, double bono, String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        this.numeroDeContrato = numeroDeContrato;
        this.horas = horas;
    }

    public int getNumeroDeContrato() {
        return numeroDeContrato;
    }

    public int getHoras() {
        return horas;
    }

    public void setNumeroDeContrato(int numeroDeContrato) {
        this.numeroDeContrato = numeroDeContrato;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    @Override
    public double calcularSalario(){
       return super.calcularSalario() * horas;
       
    }
    
     
    @Override
    public String toString(){
        String cade = super.toString();
        cade = cade + "Numero de contrato: " + numeroDeContrato + "\n" +
                "Horas : " +  horas + "\n" + 
                "Salario real; " + calcularSalario();
        return cade;
 }    
}
