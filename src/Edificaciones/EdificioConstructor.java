package Edificaciones;

public class EdificioConstructor {
    private int numConstructor;
    private int numEdificaciones;
    private int porcentaje;
    

    public EdificioConstructor(int numConstructor, int numEdificaciones,int porcentaje) {
        this.numConstructor = numConstructor;
        this.numEdificaciones = numEdificaciones;
        this.porcentaje= porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    

    public int getNumConstructor() {
        return numConstructor;
    }

    public void setNumConstructor(int numConstructor) {
        this.numConstructor = numConstructor;
    }

    public int getNumEdificaciones() {
        return numEdificaciones;
    }

    public void setNumEdificaciones(int numEdificaciones) {
        this.numEdificaciones = numEdificaciones;
    }
    
}
