/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.CriaturasMagicas;

/**
 *
 * @author MERCEDESPADILLA
 */
public class Criaturaguerrera {
    private int puntosAtkCriatura;
    private int puntosvida;
    private int numtropas;
    private int costo;
    
    //constructores
    public Criaturaguerrera() {
        puntosAtkCriatura = 100;
        puntosvida = 50;
        numtropas = 5;
        costo = 50;
    }
    
    //set y get

    public int getPuntosAtkCriatura() {
        return puntosAtkCriatura;
    }

    public int getPuntosvida() {
        return puntosvida;
    }

    public int getNumtropas() {
        return numtropas;
    }

    public void setPuntosAtkCriatura(int puntosAtkCriatura) {
        this.puntosAtkCriatura = puntosAtkCriatura;
    }

    public void setPuntosvida(int puntosvida) {
        this.puntosvida = puntosvida;
    }

    public void setNumtropas(int numtropas) {
        this.numtropas = numtropas;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}
