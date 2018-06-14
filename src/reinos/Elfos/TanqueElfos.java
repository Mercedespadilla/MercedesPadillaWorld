package reinos.Elfos;

public class TanqueElfos {
    
    private int vida;
    private int ataque;
    private int costo;

    public TanqueElfos(int ataque) {
        vida = 150;
        this.ataque = 550+ataque;
        costo = 100;
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
