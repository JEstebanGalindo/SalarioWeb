/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.salarioempleados.modelo;

import com.udec.salarioempleados.controlador.Cuenta;

/**
 *Clase Logica
 * @author julian esteban vallejo galindo
 */
public class Logica {

    private int sueldo;
    private String desicion;
    private String idiomas;
    private int pagoProfesion;
    
    private Cuenta cuenta;

    /**
     * Constructor clase Recibo
     * @param cuenta 
     */
    public Logica(Cuenta cuenta) {
        this.cuenta = cuenta;
        pagoProfesion();
        mostrarIdiomas();
        calculaSueldo();
    }

    /**
     * Metodo que establece el valor de las profesiones
     */    
    public void pagoProfesion() {
        if (cuenta.getProfesion().equals("Ingeniero")) {
            setPagoProfesion(200000);
        }
        if (cuenta.getProfesion().equals("Tecnologo")) {
            setPagoProfesion(150000);
        }
        if (cuenta.getProfesion().equals("Tecnico")) {
            setPagoProfesion(100000);
        }
        if (cuenta.getProfesion().equals("Auxiliar")) {
            setPagoProfesion(50000);
        }
    }
    
    /**
     * Metodo que valida que los dias de trabajo sean mayores a 0
     * @return 
     */
    public boolean validarDiasTrabajados() {
        if (cuenta.getDias()<= 0) {
            setSueldo(0);
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * Metodo que calcula el sueldo del usuario
     */
    public void calculaSueldo() {
        if (validarDiasTrabajados()) {
            int subSueldo = 0;
            subSueldo = getPagoProfesion() * cuenta.getDias();
            for (String s : cuenta.getIdioma()) {
                if(s.equals("Ingles"))
                    subSueldo = subSueldo+250000;
                if(s.equals("Frances"))
                    subSueldo = subSueldo+330000;
                if(s.equals("Aleman"))
                    subSueldo = subSueldo+500000;
            }
            if(cuenta.getUbicacion().equals("Afuera")){
                subSueldo = subSueldo + 80000;
            }
            setSueldo(subSueldo);
        }
    }
    
    /**
     * Metodo que une todos los idiomas digitados
     */
    public void mostrarIdiomas() {
        String subidioma = "";
        for (String s : cuenta.getIdioma()) {
            subidioma = subidioma + s+", ";
        }
        setIdiomas(subidioma);
    }

    /**
     * getters y Setters
     */
    
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getDesicion() {
        return desicion;
    }

    public void setDesicion(String desicion) {
        this.desicion = desicion;
    }

    
    
    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public int getPagoProfesion() {
        return pagoProfesion;
    }

    public void setPagoProfesion(int pagoProfesion) {
        this.pagoProfesion = pagoProfesion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
