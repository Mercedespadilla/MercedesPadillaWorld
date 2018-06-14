package Menu;
import Edificaciones.EdificioAyuntamiento;
import Edificaciones.EdificioBarraca;
import Edificaciones.EdificioConstructor;
import Edificaciones.EdificioTaller;
import java.util.Scanner;
import java.util.Set;

public class Menu {
    public static Menu menu;

    static String nomUser;
    static String raza;
    static Usuario u1;
    static Usuario u2;
    static boolean validarGanador = false;
    static boolean turno = true;
    static boolean atacar = false;
    static int nBarrU1 = 0;
    static int nBarrU2 = 0;
    static EdificioBarraca barraca = new EdificioBarraca();
    static EdificioConstructor constructor = new EdificioConstructor();
    static EdificioTaller taller = new EdificioTaller();
    
    static Scanner teclado;
    
    public static void main(String[] args) {
        
        teclado = new Scanner(System.in);
        
        System.out.println("*** BIENVENIDOS AL HIMALAYA ***");
        System.out.println("***UN LUGAR ACOGEDOR***");
        menuInicio();
        menuJuego();
        iniciaJuego();
    }
    
    public static void menuInicio(){
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        int opc;
        do{
            opc = teclado.nextInt();
            teclado.nextLine();
            switch(opc){
                case 1:
                    break;
                case 2:
                    System.exit(0);
                    break;
        }
        }while(opc < 1 && opc > 3);
    }
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }

    private static void menuJuego() {
        for (int i = 0; i < 2; i++){ 
            int p = i+1;
            System.out.println("Player " + p);
            System.out.print("Ingrese su nombre: ");
            nomUser = teclado.nextLine();
            System.out.println("Elige tu raza");
            raza = menuCriatura();
            teclado.nextLine();
            
            if(i == 0){
                u1 = new Usuario(nomUser, raza);
                System.out.println(u1.getJugador() + ", " + u1.getRaza());
            }
            else{
                u2 = new Usuario(nomUser, raza);
                System.out.println(u2.getJugador() + ", " + u2.getRaza());
            }
        } 
    }

    private static String menuCriatura() {
        System.out.println("1. Criatura Magica");
        System.out.println("2. Elfo");
        System.out.println("3. Hechicero");
        
        int opc;
         do{
             System.out.print("Ingrese opcion: ");
            opc = teclado.nextInt();
            teclado.next();
            switch(opc){
                case 1:
                    return "Criatura Magica";
                case 2:
                    return "Elfos";
                case 3:
                    return "Hechiceros";
                default:
                    System.out.println("Raza invalida");
        }
        }while(opc > 0 && opc < 4);
         
         return "0";
    }

    private static void iniciaJuego() {
        
        EdificioAyuntamiento ayuntaU1 = new EdificioAyuntamiento();
        EdificioAyuntamiento ayuntaU2 = new EdificioAyuntamiento();
        
        System.out.println("\nINICIA EL JUEGO");
        
        while(validarGanador == false){
            if (turno){
                System.out.println(u1.getJugador() + " tienes: \n" +
                        ayuntaU1.getMadera() + " madera\n" +
                        ayuntaU1.getOro() + " oro\n" + 
                        ayuntaU1.getNumConstructores() + " constructores\n" +
                        ayuntaU1.getNumGuerreros() + " guerreros\n" + 
                        ayuntaU1.getNumVehiculos() + " vehiculos\n");
                
                accionesJuego(ayuntaU1);
                
                turno = false;
                
                ayuntaU1.sumarMadera(ayuntaU1.getNumRecMadera());
                ayuntaU1.sumarOro(ayuntaU1.getNumRecOro());
                
                
            }
            else{
                
                System.out.println(u2.getJugador() + " tienes: \n" +
                        ayuntaU2.getMadera() + " madera\n" +
                        ayuntaU2.getOro() + " oro\n" + 
                        ayuntaU2.getNumConstructores() + " constructores\n" +
                        ayuntaU2.getNumGuerreros() + " guerreros\n" + 
                        ayuntaU2.getNumVehiculos() + " vehiculos\n");
                
                accionesJuego(ayuntaU2);
                
                turno = true;
                
                ayuntaU2.sumarMadera(ayuntaU2.getNumRecMadera());
                ayuntaU2.sumarOro(ayuntaU2.getNumRecOro());
            }
        }
        
    }

    private static void accionesJuego(EdificioAyuntamiento ayunta) {
        System.out.println("1. Construir");
        System.out.println("2. Atacar");
        
        int opc;
        do{
            opc = teclado.nextInt();
            teclado.nextLine();
            switch(opc){
                case 1:
                    construirEdificio(ayunta);
                    break;
                case 2:
                    
                    break;
            }
       
        }while(opc < 1 && opc > 3);
    }

    private static void construirEdificio(EdificioAyuntamiento ayunta) {
        System.out.println("1. Construir barraca (200 oro, 300 madera)");
        System.out.println("2. Construir casa de constructor (1500 oro, 1500 madera)");
        System.out.println("3. Construir recolector de oro (200 madera)");
        System.out.println("4. Construir taller (300 oro, 400 madera)");
        System.out.println("5. Construir recolector de madera (200 oro)1)");
        int opc;
        do{
            opc = teclado.nextInt();
            teclado.nextLine();
            switch(opc){
                case 1:
                    if(ayunta.getMadera() > barraca.getPrecioMadera() && ayunta.getOro() > barraca.getPrecioOro()){
                        ayunta.setMadera(ayunta.getMadera()-barraca.getPrecioMadera());
                        ayunta.setOro(ayunta.getOro()-barraca.getPrecioOro());
                        ayunta.masUnaBarraca();
                        System.out.println("Madera: /n" + ayunta.getMadera() + "Oro: /n" + ayunta.getOro());
                    }
                    else{
                        System.out.println("No tiene suficientes recursos");
                        opc = 6;
                    }
                     break;
                case 2:
                    if(ayunta.getMadera() > constructor.getPrecioMadera() && ayunta.getOro() > constructor.getPrecioOro()){
                        ayunta.setMadera(ayunta.getMadera()-constructor.getPrecioMadera());
                        ayunta.setOro(ayunta.getOro()-constructor.getPrecioOro());
                        ayunta.masUnaBarraca();
                        System.out.println("Madera: /n" + ayunta.getMadera() + "Oro: /n" + ayunta.getOro());
                    }
                    else{
                        System.out.println("No tiene suficientes recursos");
                        opc = 6;
                    }
                     break;
                case 3:
                    return;
                case 4:
                    if(ayunta.getMadera() > taller.getPrecioMadera() && ayunta.getOro() > taller.getPrecioOro()){
                        ayunta.setMadera(ayunta.getMadera()-taller.getPrecioMadera());
                        ayunta.setOro(ayunta.getOro()-taller.getPrecioOro());
                        ayunta.masUnaBarraca();
                        System.out.println("Madera: /n" + ayunta.getMadera() + "Oro: /n" + ayunta.getOro());
                    }
                    else{
                        System.out.println("No tiene suficientes recursos");
                        opc = 6;
                    }
                     break;
                case 5:
                    return;
                default:
                    break;
        }
        }while(opc < 1 && opc > 7);
        
    }
    
}
