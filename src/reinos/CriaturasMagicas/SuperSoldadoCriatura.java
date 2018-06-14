/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.CriaturasMagicas;

/**
 *
 * @author zero_
 */
public class SuperSoldadoCriatura {
    private int vida;
    private int ataque;
    private int costo;
    // constructor

    public SuperSoldadoCriatura(int vida, int ataque, int costo) {
        vida = 200;
        ataque = 600;
        costo = 80;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
