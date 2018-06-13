package Menu;

import Edificaciones.EdificioBarraca;
import Edificaciones.EdificioConstructor;
import Edificaciones.EdificioRecolectorMadera;
import Edificaciones.EdificioRecolectorOro;
import java.util.ArrayList;

/**
 *
 * @author ufg
 */
public class Usuario {
    private String jugador;
    private String raza;
    /*ArrayList<EdificioBarraca> nBarracas;
    ArrayList<EdificioConstructor> nConstructor;
    ArrayList<EdificioRecolectorMadera> nMadera;
    ArrayList<EdificioRecolectorOro> nOro;*/

    public Usuario(String jugador, String raza) {
        this.jugador = jugador;
        this.raza = raza;
        /*nBarracas = new ArrayList<>();
        nConstructor = new ArrayList<>();
        nMadera = new ArrayList<>();
        nOro = new ArrayList<>();*/
        
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
/*
    public ArrayList<EdificioBarraca> getnBarracas() {
        return nBarracas;
    }

    public void setnBarracas(ArrayList<EdificioBarraca> nBarracas) {
        this.nBarracas = nBarracas;
    }

    public ArrayList<EdificioConstructor> getnConstructor() {
        return nConstructor;
    }

    public void setnConstructor(ArrayList<EdificioConstructor> nConstructor) {
        this.nConstructor = nConstructor;
    }

    public ArrayList<EdificioRecolectorMadera> getnMadera() {
        return nMadera;
    }

    public void setnMadera(ArrayList<EdificioRecolectorMadera> nMadera) {
        this.nMadera = nMadera;
    }

    public ArrayList<EdificioRecolectorOro> getnOro() {
        return nOro;
    }

    public void setnOro(ArrayList<EdificioRecolectorOro> nOro) {
        this.nOro = nOro;
    }
    */
}
