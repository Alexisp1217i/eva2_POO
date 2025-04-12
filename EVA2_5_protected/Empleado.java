/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_protected;

/**
 *
 * @author diegi
 */
public class Empleado extends Persona{
    
private int clave;


public Empleado(){
    super();
}
public Empleado(String nombre, String apellido, int edad){
   super(nombre, apellidos, edad);
   clave= clave;
}

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }


public void imprimirDatos(){
    System.out.println("DATOS DEL EMPLEADO: ");
    System.out.println("Clave: " + clave);
    System.out.println("Nombre: " + super.nombre);
    System.out.println("Apellido: " + apellidos);
    System.out.println("Edad: " + edad);
}
}
