package Edificaciones;

public class EdificioRecolectorMadera {
    private int numMadera;
    private int numEdificaciones;
    private int porcentaje;

    public EdificioRecolectorMadera(int numMadera, int numEdificaciones, int porcentaje) {
        this.numMadera = numMadera;
        this.numEdificaciones = numEdificaciones;
        this.porcentaje= porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public int getNumMadera() {
        return numMadera;
    }

    public void setNumMadera(int numMadera) {
        this.numMadera = numMadera;
    }

    public int getNumEdificaciones() {
        return numEdificaciones;
    }

    public void setNumEdificaciones(int numEdificaciones) {
        this.numEdificaciones = numEdificaciones;
    }
    
}
