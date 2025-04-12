/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_composicion_vehiculo;

/**
 *
 * @author diegi
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private Motor motor;
    
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.motor=new Motor();
    }

    public Vehiculo() {
        this.marca = "...........";
        this.modelo = "------------";
        this.año = 0;
        this.motor=new Motor();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    @Override
    public String toString(){
        return"Datos del Vehiculo: \n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año: " + año + "\n" +
                "Potencia: " + motor.getPotencia() + "\n" +
                "Gasolina: " + motor.getTipoGasofa() + "\n";
    }
}
