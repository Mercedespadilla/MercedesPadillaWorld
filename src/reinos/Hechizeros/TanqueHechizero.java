package reinos.Hechizeros;

public class TanqueHechizero {
    
    private int vida;
    private int ataque;
    private int costo;

    public TanqueHechizero() {
        vida = 150;
        ataque = 700;
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
