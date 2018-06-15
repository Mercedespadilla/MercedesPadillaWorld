package Menu;
import Edificaciones.EdificioAyuntamiento;
import Edificaciones.EdificioBarraca;
import Edificaciones.EdificioConstructor;
import Edificaciones.EdificioRecolectorMadera;
import Edificaciones.EdificioRecolectorOro;
import Edificaciones.EdificioTaller;
import java.util.Scanner;
import java.util.Set;
import reinos.CriaturasMagicas.Criaturaguerrera;
import reinos.CriaturasMagicas.SuperSoldadoCriatura;
import reinos.Hechizeros.BallestaHechizero;
import reinos.Hechizeros.TanqueHechizero;
import sun.rmi.runtime.RuntimeUtil;

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
    static EdificioRecolectorMadera recMadera = new EdificioRecolectorMadera();
    static EdificioRecolectorOro recOro = new EdificioRecolectorOro();
    static Criaturaguerrera guerrero = new Criaturaguerrera();
    static SuperSoldadoCriatura superSoldado = new SuperSoldadoCriatura();
    static BallestaHechizero ballesta = new BallestaHechizero();
    static TanqueHechizero tanque = new TanqueHechizero();
    
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
        }while((opc < 1 && opc > 3));
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
        System.out.println("Presione 0 cuando termine turno");
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
         
         return "return";
    }

    private static void iniciaJuego() {
        
        EdificioAyuntamiento ayuntaU1 = new EdificioAyuntamiento();
        EdificioAyuntamiento ayuntaU2 = new EdificioAyuntamiento();
        ayuntaU1.setRaza(u1.getRaza());
        ayuntaU2.setRaza(u2.getRaza());
        
        System.out.println("\n***INICIA EL JUEGO***\n");
        
        while(validarGanador == false){
            if (turno){
                System.out.println(u1.getJugador() + " tienes: \n" +
                        ayuntaU1.getMadera() + " madera\n" +
                        ayuntaU1.getOro() + " oro\n" + 
                        ayuntaU1.getNumConstructores() + " constructores\n" +
                        ayuntaU1.getNumBarracas() + " barracas\n" +
                        ayuntaU1.getNumTaller() + " talleres\n" +
                        ayuntaU1.getNumGuerreros() + " guerreros\n" + 
                        ayuntaU1.getNumVehiculos() + " vehiculos\n" +
                        ayuntaU1.getSuperSoldado() + " super soldado\n" +
                        ayuntaU1.getBallesta() + " ballesta\n" + 
                        ayuntaU1.getTanque() + " tanque\n");
                
                accionesJuego(ayuntaU1, ayuntaU2);
                
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
                
                accionesJuego(ayuntaU2, ayuntaU1);
                
                turno = true;
                
                ayuntaU2.sumarMadera(ayuntaU2.getNumRecMadera());
                ayuntaU2.sumarOro(ayuntaU2.getNumRecOro());
            }
        }
        
    }

    private static void accionesJuego(EdificioAyuntamiento ayunta, EdificioAyuntamiento def) {
        System.out.println("1. Construir");
        System.out.println("2. Atacar");
        System.out.println("3. Crear Soldados");
        System.out.println("4. Crear Milicia");
        
        int opc;
        do{
            opc = teclado.nextInt();
            teclado.nextLine();
            switch(opc){
                case 1:
                    construirEdificio(ayunta);
                    break;
                case 2:
                    atacar(ayunta, def);
                    break;
                case 3:
                    crearSoldados(ayunta, def);
                    break;
                case 4:
                    crearMilicia(ayunta, def);
            }
       
        }while(opc < 1 && opc > 3);
    }

    private static void construirEdificio(EdificioAyuntamiento ayunta) {
        System.out.println("1. Construir barraca (200 oro, 300 madera)");
        System.out.println("2. Construir casa de constructor (1500 oro, 1500 madera)");
        System.out.println("3. Construir recolector de oro (200 madera)");
        System.out.println("4. Construir taller (300 oro, 400 madera)");
        System.out.println("5. Construir recolector de madera (200 oro))");
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
                        System.out.println("Madera: " + ayunta.getMadera() + "Oro: " + ayunta.getOro());
                    }
                    else{
                        System.out.println("No tiene suficientes recursos");
                        opc = 6;
                    }
                     break;
                case 2:
                    if(ayunta.getMadera() > constructor.getPrecioMadera() && 
                       ayunta.getOro() > constructor.getPrecioOro()){
                        ayunta.setMadera(ayunta.getMadera()-constructor.getPrecioMadera());
                        ayunta.setOro(ayunta.getOro()-constructor.getPrecioOro());
                        ayunta.masUnConstructor();
                        System.out.println("Madera: " + ayunta.getMadera() + "Oro: " + ayunta.getOro());
                    }
                    else{
                        System.out.println("No tiene suficientes recursos");
                        opc = 6;
                    }
                     break;
                case 3:
                    if(ayunta.getMadera() > recOro.getPrecioMadera()){
                        ayunta.setMadera(ayunta.getMadera()-recOro.getPrecioMadera());
                        ayunta.masUnRecOro();
                        System.out.println("Madera: " + ayunta.getMadera() + "Oro: " + ayunta.getOro());
                    }
                    else{
                        System.out.println("No tiene suficientes recursos");
                        opc = 6;
                    }
                    break;
                case 4:
                    if(ayunta.getMadera() > taller.getPrecioMadera() && ayunta.getOro() > taller.getPrecioOro()){
                        ayunta.setMadera(ayunta.getMadera()-taller.getPrecioMadera());
                        ayunta.setOro(ayunta.getOro()-taller.getPrecioOro());
                        ayunta.masUnaBarraca();
                        System.out.println("Madera: " + ayunta.getMadera() + "Oro: " + ayunta.getOro());
                    }
                    else{
                        System.out.println("No tiene suficientes recursos");
                        opc = 6;
                    }
                     break;
                case 5:
                    if(ayunta.getOro()> recMadera.getPrecioOro()){
                        ayunta.setOro(ayunta.getOro()-recMadera.getPrecioOro());
                        ayunta.masUnRecMadera();
                        System.out.println("Madera: " + ayunta.getMadera() + "Oro: " + ayunta.getOro());
                    }
                    else{
                        System.out.println("No tiene suficientes recursos");
                        opc = 6;
                    }
                    break;
                default:
                    break;
        }
        }while(opc < 1 && opc > 6);
        
    }

    private static void atacar(EdificioAyuntamiento atacante, EdificioAyuntamiento defensor) {
        
        if(atacante.getNumGuerreros() > 0 || atacante.getNumVehiculos() > 0){
            
        }
        else{
            System.out.println("No tienes tropas o vehiculos de ataque");
            accionesJuego(atacante, defensor);
        }
    }

    private static void crearSoldados(EdificioAyuntamiento ayunta, EdificioAyuntamiento def) {
        if(ayunta.getNumBarracas() != 0){
        System.out.println("Que soldado quieres crear?");
        System.out.println("1. Escuadron");
        System.out.println("2. SuperSoldado");
        System.out.println("Presione 0 cuando termine turno");
        }else{
                    System.out.println("No tienes taller");
            }
        int opc;
        do{
            // raza if(ayunta.getRaza == "ciratura){
        // 
        //}
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    if(ayunta.getOro() > guerrero.getCosto()){
                    ayunta.setOro(ayunta.getOro() - guerrero.getCosto());
                    ayunta.setNumGuerreros();
                    }
                    else{
                        System.out.println("Oro insuficiente para crear soldados");
                    }
                    
                    break;
                case 2:
                    if(ayunta.getSuperSoldado() == 1){
                        System.out.println("Ya tienes un super soldado");
                        opc = 3;
                    }
                    else{
                        if(ayunta.getOro() > superSoldado.getCosto()){
                            ayunta.setOro(ayunta.getOro() - superSoldado.getCosto());
                            ayunta.setSuperSoldado();
                        }
                        else{
                            System.out.println("Oro insuficiente para crear soldados");
                        }
                    break;
                    }
                    default:
                    break;
            }
        }while(opc > 0 && opc < 4);
    }

    private static void crearMilicia(EdificioAyuntamiento ayunta, EdificioAyuntamiento def) {
        if(ayunta.getNumTaller()!= 0){
        System.out.println("Que Vehiculo quieres crear?");
        System.out.println("1. Ballesta");
        System.out.println("2. Tanque");
        System.out.println("Presione 0 cuando termine turno");  
        }else{
                    System.out.println("No tienes taller");
            }
        int opc;
        do{
            opc = teclado.nextInt();
                switch(opc){
                    case 1:
                        if(ayunta.getMadera() > ballesta.getCosto()){
                            ayunta.setOro(ayunta.getMadera()- ballesta.getCosto());
                            ayunta.setBallesta();
                        }
                        else{
                            System.out.println("Madera insuficiente para crear ballesta");
                        }
                        
                        break;
                    case 2:
                        
                        if(ayunta.getMadera()> tanque.getCosto()){
                            ayunta.setOro(ayunta.getMadera()- tanque.getCosto());
                            ayunta.setTanque();
                        }
                        else{
                            System.out.println("Madera insuficiente para crear tanque");
                            opc = 3;
                        }
                        break;
                    default:
                        System.out.println("es incorrecto");
                        break;
                }
            }
            while(opc > 0 && opc < 4);
        
    }
    //preguntar que raza es soldados 
}
