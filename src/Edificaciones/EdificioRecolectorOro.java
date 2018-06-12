/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

/**
 *
 * @author zero_
 */
public class EdificioRecolectorOro {
    private int numOro;
    private int numEdificaciones;
    private int porcentaje;

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public EdificioRecolectorOro(int numOro, int numEdificaciones, int porcentaje) {
        this.numOro = numOro;
        this.numEdificaciones = numEdificaciones;
        this.porcentaje= porcentaje;
    }

    public int getNumOro() {
        return numOro;
    }

    public void setNumOro(int numOro) {
        this.numOro = numOro;
    }

    public int getNumEdificaciones() {
        return numEdificaciones;
    }

    public void setNumEdificaciones(int numEdificaciones) {
        this.numEdificaciones = numEdificaciones;
    }
    
    
}
