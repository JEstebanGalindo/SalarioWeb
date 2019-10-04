/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.salarioempleados.controlador;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *Controlador clase Cuenta
 * @author julian esteban vallejo galindo
 */
@Named(value = "cuenta")
@RequestScoped
public class Cuenta{

    private String nombre;
    private String apellido;
    private String genero;
    private String ubicacion;
    private int dias;    
    private String profesion;  
    private String[] idioma;
    
    public Cuenta() {
    }
    
    public String irRecibo(){
        return "recibo";
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

}
