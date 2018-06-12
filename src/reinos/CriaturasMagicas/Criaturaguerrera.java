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
    //constructores
    public Criaturaguerrera(int puntosAtkCriatura, String tipovehiculo, int puntosvida, int numtropas) {
        puntosAtkCriatura = 100;
        this.puntosvida = puntosvida;
        this.numtropas = numtropas;
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
    
}
