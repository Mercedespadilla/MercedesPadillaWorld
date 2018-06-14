/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.CriaturasMagicas;

/**
 *
 * @author padilla
 */
public class CriaturaConstructor {
    private String tipoConstructor;
    private int duracionCriatura;

    public String getTipoConstructor() {
        return tipoConstructor;
    }

    public void setTipoConstructor(String tipoConstructor) {
        this.tipoConstructor = tipoConstructor;
    }

    public int getDuracionCriatura() {
        return duracionCriatura;
    }

    public void setDuracionCriatura(int duracionCriatura) {
        this.duracionCriatura = duracionCriatura;
    }

    public CriaturaConstructor(String tipoConstructor, int duracionCriatura) {
        this.tipoConstructor = tipoConstructor;
        this.duracionCriatura = duracionCriatura;
    }
    
}
