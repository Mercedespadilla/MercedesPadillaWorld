package Edificaciones;

public class EdificioRecolectorMadera {
    private int porcentaje;
    private int precioOro;

    public EdificioRecolectorMadera() {
        porcentaje= 500;
        precioOro = 200;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPrecioOro() {
        return precioOro;
    }

    public void setPrecioOro(int precioOro) {
        this.precioOro = precioOro;
    }
    
}
