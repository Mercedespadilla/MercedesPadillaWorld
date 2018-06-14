package Edificaciones;

public class EdificioRecolectorOro {
    private int porcentaje;
    private int precioMadera;

    public EdificioRecolectorOro() {
        porcentaje = 500; 
        precioMadera = 200;
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
    
}
