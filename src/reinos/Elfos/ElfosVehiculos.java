/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.Elfos;

/**
 *
 * @author mercedespadilla
 */
public class ElfosVehiculos {
    private String tipovehiculo;
    private int numTropasElfos;
    private int puntosAtkElfos;
    
    //constructores

    public ElfosVehiculos(String tipovehiculo, int numTropasElfos, int puntosAtkElfos) {
        this.tipovehiculo = tipovehiculo;
        this.numTropasElfos = numTropasElfos;
        this.puntosAtkElfos = puntosAtkElfos;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public int getNumTropasElfos() {
        return numTropasElfos;
    }

    public int getPuntosAtkElfos() {
        return puntosAtkElfos;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public void setNumTropasElfos(int numTropasElfos) {
        this.numTropasElfos = numTropasElfos;
    }

    public void setPuntosAtkElfos(int puntosAtkElfos) {
        this.puntosAtkElfos = puntosAtkElfos;
    }
    
    
}
