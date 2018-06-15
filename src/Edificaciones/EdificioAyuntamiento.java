package Edificaciones;

import java.util.ArrayList;

public class EdificioAyuntamiento {
    
    private int madera;
    private int oro;
    private int porcentaje;
    private int numConstructores;

    private int numBarracas;
    private int numTaller;
    private int numRecOro;
    private int numRecMadera;
    private int numVehiculos;
    private int numGuerreros;
    private int superSoldado;
    private int ballesta;
    private int tanque;
    private String raza;

    public EdificioAyuntamiento() {
        madera = 2000;
        numTaller= 0;
        oro = 2000;
        porcentaje = 1500;
        numConstructores = 1;
        numVehiculos = 0;
        numGuerreros = 0;
        numBarracas = 0;
        numRecMadera = 0;
        numRecOro = 0;
        superSoldado = 0;
        ballesta = 0;
        tanque = 0;
        this.raza= raza;
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

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    public int getNumGuerreros() {
        return numGuerreros;
    }

    public int getNumBarracas() {
        return numBarracas;
    }

    public int getNumRecOro() {
        return numRecOro;
    }

    public void setNumRecOro(int numRecOro) {
        this.numRecOro = numRecOro;
    }

    public int getNumRecMadera() {
        return numRecMadera;
    }

    public void setNumRecMadera(int numRecMadera) {
        this.numRecMadera = numRecMadera;
    }
  
    public int getNumTaller() {
        return numTaller;
    }

    public int getSuperSoldado() {
        return superSoldado;
    }

    public int getBallesta() {
        return ballesta;
    }

    public int getTanque() {
        return tanque;
    }

    public String getRaza() {
        return raza;
    }
     
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //Sumando recursos
    
    public void sumarOro(int recolectorOro){
        oro = oro + 100*(recolectorOro+1);
    }
    
    public void sumarMadera(int recolectorMadera){
        madera = madera + 100*(recolectorMadera+1);
    }
     

    public void masUnNumTaller() {
        numTaller = numTaller + 1;
    }
    //Fin de sumar recursos
    
    //Fin sumando recursos
    
    //Poniendo tropas
    
    public void setNumGuerreros(){
        numGuerreros = numGuerreros+5;
    }
    
    public void setSuperSoldado() {
        superSoldado = superSoldado+1;
    }
    
    public void setTanque() {
        tanque = tanque+1;
    }
    
    public void setBallesta() {
        ballesta = ballesta + 1;
    }
    
    //Fin poniendo tropas
    
    
    //Quitando tropas
    public void quitarSuperSoldado() {
        superSoldado = superSoldado-1;
    }
    
    public void quitarGuerrerosEH() {
        numGuerreros = numGuerreros-5;
    }
    
    public void quitarGuerrerosC() {
        numGuerreros = numGuerreros-10;
    }
    //fin de quitar tropas
    
    //sumando a construcciones
    
    public void masUnConstructor() {
        numConstructores = numConstructores+1;
    }
    
    public void masUnaBarraca() {
        numBarracas = numBarracas+1;
    }
    
     public void masUnNumTaller(int numTaller) {
        numTaller = numTaller + 1;
    }
    
    public void masUnRecMadera(){
        numRecMadera = numRecMadera + 1;
    }
    
    public void masUnRecOro(){
        numRecOro = numRecOro + 1;
    }
    //fin sumando construcciones

    //Quitar Construcciones
    public void menosRecMadera(){
        numRecMadera = numRecMadera-1;
    }
    
    public void menosRecOro(){
        numRecOro = numRecOro-1;
    }
    
    public void menosBarraca(){
        numBarracas = numBarracas-1;
    }
    public void menosConstructor(){
        numConstructores = numConstructores-1;
    }
    public void menosTaller(){
        numTaller = numTaller-1;
    }
    //Fin quitar construcciones
}
