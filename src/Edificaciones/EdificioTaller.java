package Edificaciones;

public class EdificioTaller {
    
    private int numEdificaciones;
    private int porcentaje;
    private int numVehiculo;

    public EdificioTaller(int numEdificaciones, int porcentaje, int numVehiculo) {
        this.numEdificaciones = numEdificaciones;
        porcentaje = 500;
        this.numVehiculo = numVehiculo;
    }

    public int getNumEdificaciones() {
        return numEdificaciones;
    }

    public void setNumEdificaciones(int numEdificaciones) {
        this.numEdificaciones = numEdificaciones;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getNumVehiculo() {
        return numVehiculo;
    }

    public void setNumVehiculo(int numVehiculo) {
        this.numVehiculo = numVehiculo;
    }
    
    
    
}
