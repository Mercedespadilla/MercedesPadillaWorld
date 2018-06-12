/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.Hechizeros;

/**
 *
 * @author mercedes padilla
 */
public class Hechizerosconstructores {
    private String tipoConstructor;
    private int duracionHechizeros;

    public Hechizerosconstructores(String tipoConstructor, int duracionHechizeros) {
        this.tipoConstructor = tipoConstructor;
        this.duracionHechizeros = duracionHechizeros;
    }

    public String getTipoConstructor() {
        return tipoConstructor;
    }

    public void setTipoConstructor(String tipoConstructor) {
        this.tipoConstructor = tipoConstructor;
    }

    public int getDuracionHechizeros() {
        return duracionHechizeros;
    }

    public void setDuracionHechizeros(int duracionHechizeros) {
        this.duracionHechizeros = duracionHechizeros;
    }
}
