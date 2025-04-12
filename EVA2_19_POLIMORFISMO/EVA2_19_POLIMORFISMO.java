/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_polimorfismo;

/**
 *
 * @author diegi
 */
public class EVA2_19_POLIMORFISMO {

    public static void main(String[] args) {
        Empleado[] empleado = new Empleado [5];
        empleado[0] = new Empleado("wewe2323", "puñetas", "ñññ", 10);
        empleado[1] = new Empleado("dsfdfdsfwewe", "q", "Apeliid2", 12);
        empleado[2] = new Empleado("32432fdsfsdf", "koko", "Quezadilla", 11);
        empleado[3] = new Empleado("fdsfdsfds3232", "Mendigo", "pedr", 23);
        empleado[4] = new Empleado("fdef241342", "Diego", "Salas", 30);
        
        Cliente [] cliente = new Cliente[5];
        cliente[0] = new Cliente ("wewe2323", "puñetas", "ñññ", 10);
        cliente[1] = new Cliente ("32432fdsfsdf", "koko", "Quezadilla", 11);
        cliente[2] = new Cliente ("fdef241342", "Diego", "Salas", 30);
        cliente[3] = new Cliente ("fdsfdsfds3232", "Mendigo", "pedr", 23);
        cliente[4] = new Cliente ("dsfdfdsfwewe", "q", "Apeliid2", 12);
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("EMPLEADOS----------------------");
        generarReporte(empleado);
        System.out.println("CLIENTES.....................");
        generarReporte(cliente);
        System.out.println("--------------------------------------------------");
        
        
        
        for (int i = 0; i < 5; i++) {
        empleado[i].imprimirDatos();    
        }
        for (int i = 0; i < 5; i++) {
        cliente[i].imprimirDatos();
        }
        
    }
    public static void generarReporte(Persona[] Personas){
         for (int i = 0; i < 5; i++) {
        
             Personas[i].imprimirDatos();
        }
    }
}
