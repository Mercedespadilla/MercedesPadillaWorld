package reinos.CriaturasMagicas;

/**
 *
 * @author mercedes padilla
 */
public class Criaturavehiculo {
    private String tipovehiculo;
    private int numTropasCriatura;
    private int puntosAtkCriatura;
    
    //Constructor
    public Criaturavehiculo(String tipoCriatura, int numTropasCriatura) {
        this.tipovehiculo = tipoCriatura;
        this.numTropasCriatura = numTropasCriatura;
        puntosAtkCriatura = 100;
    }
    
    //Setter y Getter
    public String getTipoCriatura() {
        return tipovehiculo;
    }

    public void setTipoCriatura(String tipoCriatura) {
        this.tipovehiculo = tipoCriatura;
    }

    public int getNumTropasCriatura() {
        return numTropasCriatura;
    }

    public void setNumTropasCriatura(int numTropasCriatura) {
        this.numTropasCriatura = numTropasCriatura;
    }
    
}
