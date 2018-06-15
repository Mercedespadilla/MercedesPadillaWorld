package reinos.Hechizeros;


public class BallestaHechizero {
    private int vida;
    private int ataque;
    private int costo;

    public BallestaHechizero() {
        vida = 50;
        ataque = 700;
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
