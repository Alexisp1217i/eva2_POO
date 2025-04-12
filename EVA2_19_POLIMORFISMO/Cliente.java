/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_19_polimorfismo;

/**
 *
 * @author diegi
 */
public class Cliente extends Persona{
    private String rfc;

    public Cliente(String rfc, String Nombre, String Apellido, int Year) {
        super(Nombre, Apellido, Year);
        this.rfc = rfc;
    }

    public Cliente() {
        super();
        this.rfc ="----------";
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
   public void imprimirDatos(){
        System.out.println("RFC: " + rfc);
         super.imprimirDatos();
   }

    
    }
    
      

