/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_sobreescritura;

/**
 *
 * @author nancy
 */
public class Eva2_7_Sobreescritura {

    public static void main(String[] args) {
        Empleado emple = new Empleado("Jesus Alexis", "Jimenez Aldaba", 1500);
        EmpleadoBase emplea = new EmpleadoBase(700, .15, "nancy", "Aldaba", 1500);
        EmpleadoTemporal empleaT = new EmpleadoTemporal(701, 5, 5454, .15, "Antonio", "Santes", 1500);
        
        System.out.println(emple);
        System.out.println(emplea);
        System.out.println(empleaT);
         
    }
}
