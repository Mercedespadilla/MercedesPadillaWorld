package Edificaciones;

public class EdificioConstructor {
    private int numEdificaciones;
    private int porcentaje;
    private int precioMadera;
    private int precioOro;
    private int numConstrutores;

    public EdificioConstructor() {
        numConstrutores = 1;
        porcentaje = 500;
        precioMadera = 1500;
        precioOro = 1500;
    
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

    public int getNumConstrutores() {
        return numConstrutores;
    }

    public void setNumConstrutores(int numConstrutores) {
        this.numConstrutores = numConstrutores;
    }
    
}
