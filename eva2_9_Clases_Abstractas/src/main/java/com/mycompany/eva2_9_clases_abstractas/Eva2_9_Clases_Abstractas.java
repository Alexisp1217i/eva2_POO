/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_clases_abstractas;

/**
 *
 * @author nancy
 */
public class Eva2_9_Clases_Abstractas {

    public static void main(String[] args) {
      Cliente client = new Cliente("Moral", "Alexis", "Jimenez", 18);
      Empleado emple = new Empleado("Alexis", "Aldaba", 18);
// Persona per = new Persona();
        client.imprimirDatos();
        emple.imprimirDatos();
        
    }
}
