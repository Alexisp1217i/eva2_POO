/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_19_polimorfismo;

/**
 *
 * @author diegi
 */
public class Empleado extends Persona{
    private String ClavedeEmpleado;

    public Empleado(String ClavedeEmpleado, String Nombre, String Apeliido, int Year) {
        super(Nombre, Apeliido, Year);
        this.ClavedeEmpleado = ClavedeEmpleado;
    }

    public Empleado() {
        super();
        this.ClavedeEmpleado = "-------------";
    }

    public String getClavedeEmpleado() {
        return ClavedeEmpleado;
    }

    public void setClavedeEmpleado(String ClavedeEmpleado) {
        this.ClavedeEmpleado = ClavedeEmpleado;
    }
    
    @Override
    public void imprimirDatos(){
   super.imprimirDatos();
        System.out.println("Clave: " + ClavedeEmpleado);
}

    }
