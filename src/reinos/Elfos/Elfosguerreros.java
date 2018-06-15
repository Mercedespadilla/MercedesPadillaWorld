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
public class Elfosguerreros {
    private int puntosAtkElfos;
    private int puntosvida;
    private int numtropas;
    //constructor

    public Elfosguerreros() {
        puntosAtkElfos = 50;
        puntosvida = 50;
        numtropas = 5;
    }
    // set y get

    public int getPuntosAtkElfos() {
        return puntosAtkElfos;
    }

    public int getPuntosvida() {
        return puntosvida;
    }

    public int getNumtropas() {
        return numtropas;
    }

    public void setPuntosAtkElfos(int puntosAtkElfos) {
        this.puntosAtkElfos = puntosAtkElfos;
    }

    public void setPuntosvida(int puntosvida) {
        this.puntosvida = puntosvida;
    }

    public void setNumtropas(int numtropas) {
        this.numtropas = numtropas;
    }
}
