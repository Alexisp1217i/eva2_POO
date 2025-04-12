/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_composicion_vehiculo;

/**
 *
 * @author diegi
 */
public class EVA2_17_COMPOSICION_VEHICULO {

    public static void main(String[] args) {
   Vehiculo vehi=new Vehiculo();
        vehi.setMarca("Nissan");
        vehi.setModelo("Platina");
        vehi.setAño(2005);
        System.out.println(vehi);
        Motor motor = new Motor(0, 500);
        vehi.setMotor(motor);
        System.out.println(vehi);
               
    }
}
