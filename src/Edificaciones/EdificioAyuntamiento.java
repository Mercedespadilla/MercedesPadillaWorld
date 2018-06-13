
package Edificaciones;

public class EdificioAyuntamiento {
    
    private int madera;
    private int oro;
    private int porcentaje;
    private int numConstructores;
    private int numVehiculos;
    private int numGuerreros;

    public EdificioAyuntamiento() {
        madera = 1000;
        oro = 1000;
        porcentaje = 1500;
        numConstructores = 1;
        numVehiculos = 0;
        numGuerreros = 0;
    }

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getNumConstructores() {
        return numConstructores;
    }

    public void setNumConstructores(int numConstructores) {
        this.numConstructores = numConstructores;
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    public int getNumGuerreros() {
        return numGuerreros;
    }

    public void setNumGuerreros(int numGuerreros) {
        this.numGuerreros = numGuerreros;
    }
    
    
}
