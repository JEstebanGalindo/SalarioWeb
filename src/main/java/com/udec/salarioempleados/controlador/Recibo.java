/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.salarioempleados.controlador;

import com.udec.salarioempleados.modelo.Logica;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * Controlador clase Recibo 
 * @author julian esteban vallejo galindo
 */
@Named(value = "recibo")
@RequestScoped
public class Recibo {

    private String sexo;
    private double sueldo;
    private String idiomasConcatenados;
    
    @Inject
    private Cuenta cuenta;
    
    public Recibo() {
    }
    
    /**
     * Metodo que calcula el sueldo despues del constructor
     */
    @PostConstruct
    public void calculaSueldo() {
        Logica logica = new Logica(cuenta);
        setSexo(logica.getDesicion());
        setSueldo(logica.getSueldo());
        setIdiomasConcatenados(logica.getIdiomas());
    }
    
    
    
    /**
     * getter y setters
     * @return 
     */

    public String getSexo() {
        return sexo;
    }
    

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getIdiomasConcatenados() {
        return idiomasConcatenados;
    }

    public void setIdiomasConcatenados(String idiomasConcatenados) {
        this.idiomasConcatenados = idiomasConcatenados;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
