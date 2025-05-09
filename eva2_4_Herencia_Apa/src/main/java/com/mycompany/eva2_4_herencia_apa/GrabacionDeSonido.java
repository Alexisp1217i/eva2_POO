/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_herencia_apa;

/**
 *
 * @author Alexis
 */
public class GrabacionDeSonido extends FichaApa{
   
  private String director;
  private String interprete;
  private String ciudad;
  private String estado;
  private String region;

  public GrabacionDeSonido(){
    super();//llamando al constructor de la super clase
    interprete = " FICHA GRABACION";
   }
  public GrabacionDeSonido(String autor, String titulo, int year, String interprete){
      super(autor, titulo, year);
      this.interprete = interprete;
  }
  //this. --> palabra reservada que da acceso a todo en la clase
  
//Metodos Get
    public String getDirector() {
        return director;
    }

    public String getInterprete() {
        return interprete;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getRegion() {
        return region;
    }
//Metodos Set
    public void setDirector(String director) {
        this.director = director;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRegion(String region) {
        this.region = region;
    }
  

    
    
}