package reinos.CriaturasMagicas;

public class TanqueCriatura {
    
    private int vida;
    private int ataque;
    private int costo;

    public TanqueCriatura() {
        vida = 150;
        ataque = 550;
        costo = 150;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
}
