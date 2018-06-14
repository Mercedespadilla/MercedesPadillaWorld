package Edificaciones;

public class EdificioBarraca {
    private int numtropas;
    private int porcentaje;
    private int numEdificio;
    private int precioMadera;
    private int precioOro;
    

    public EdificioBarraca() {
        porcentaje = 500;
        precioMadera = 300;
        precioOro = 200; 
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPrecioMadera() {
        return precioMadera;
    }

    public void setPrecioMadera(int precioMadera) {
        this.precioMadera = precioMadera;
    }

    public int getPrecioOro() {
        return precioOro;
    }

    public void setPrecioOro(int precioOro) {
        this.precioOro = precioOro;
    }
    
}
