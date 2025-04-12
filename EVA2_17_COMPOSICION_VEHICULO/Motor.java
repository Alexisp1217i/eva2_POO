/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_composicion_vehiculo;

/**
 *
 * @author diegi
 */
public class Motor {
    private int tipoGasofa;
    private int potencia;

    public Motor(int tipoGasofa, int potencia) {
        this.tipoGasofa = tipoGasofa;
        this.potencia = potencia;
    }

    public Motor() {
        this.tipoGasofa = 0; //Gasolina
        this.potencia = 0;
    }

    public int getTipoGasofa() {
        return tipoGasofa;
    }

    public void setTipoGasofa(int tipoGasofa) {
        this.tipoGasofa = tipoGasofa;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
