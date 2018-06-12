package Edificaciones;

public class EdificioBarraca {
    private int numtropas;
    private int porcentaje;
    private int numEdificio;
    

    public EdificioBarraca(int numtropas, int porcentaje, int numEdificio) {
        this.numtropas = numtropas;
        this.porcentaje = porcentaje;
        this.numEdificio = numEdificio;
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
    
    
}
