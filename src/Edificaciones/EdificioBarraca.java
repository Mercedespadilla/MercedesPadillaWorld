package Edificaciones;

public class EdificioBarraca {
    private int numtropas;
    private int porcentaje;
    private int numEdificio;
    private int precioMadera;
    private int precioOro;
    

    public EdificioBarraca(int numtropas, int porcentaje, int numEdificio) {
        this.numtropas = numtropas;
        porcentaje = 500;
        this.numEdificio = numEdificio;
        precioMadera = 300;
        precioOro = 200;
        
    }

    public int getNumtropas() {
        return numtropas;
    }

    public void setNumtropas(int numtropas) {
        this.numtropas = numtropas;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getNumEdificio() {
        return numEdificio;
    }

    public void setNumEdificio(int numEdificio) {
        this.numEdificio = numEdificio;
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
