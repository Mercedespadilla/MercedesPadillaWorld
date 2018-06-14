package reinos.Hechizeros;


public class BallestaHechizero {
    private int vida;
    private int ataque;
    private int costo;

    public BallestaHechizero(int ataque) {
        vida = 50;
        this.ataque = 500+ataque;
        costo = 80;
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
