package Edificaciones;

public class EdificioTaller {
    
    private int numEdificaciones;
    private int porcentaje;
    private int numVehiculo;
    private int precioMadera;

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
    private int precioOro;

    public EdificioTaller() {
        precioMadera= 400;
        precioOro=300;
        porcentaje = 500;
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
