/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.CriaturasMagicas;

/**
 *
 * @author mercedespadilla
 */
public class CriaturaConstructor {
    private String tipoConstructor;
    private int duracionCriatura;
    private int costo;

    //Constructor
    public CriaturaConstructor(String tipoConstructor, int duracionCriatura) {
        this.tipoConstructor = tipoConstructor;
        this.duracionCriatura = duracionCriatura;
        costo = 200;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public CriaturaConstructor(String tipoConstructor, int duracionCriatura, int costo) {
        this.tipoConstructor = tipoConstructor;
        this.duracionCriatura = duracionCriatura;
        this.costo = costo;
    }

    public CriaturaConstructor() {
    }

    //Setter y getter
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
    
    
    
    
}
