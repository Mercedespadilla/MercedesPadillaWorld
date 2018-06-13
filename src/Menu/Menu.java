package Menu;
import java.util.Scanner;

/**
 *
 * @author padilla
 */
public class Menu {
    public static Menu menu;

    /**
     * @param args the command line arguments
     */
    
    static String nomUser;
    static String raza;
    static boolean turno;
    static Usuario u1;
    static Usuario u2;
    static Scanner teclado;
    
    public static void main(String[] args) {
        
        teclado = new Scanner(System.in);
        
        System.out.println("*** BIENVENIDOS AL HIMALAYA ***");
        
        menuInicio();
        menuJuego();
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
        System.out.print("Ingrese su nombre: ");
        nomUser = teclado.nextLine();
        System.out.println("Elige tu raza");
        raza = menuCriatura();   
    }

    private static String menuCriatura() {
        System.out.println("1. Criatura Magica");
        System.out.println("2. Elfo");
        System.out.println("3. Hechicero");
        
        int opc;
         do{
             System.out.print("Ingrese opcion: ");
            opc = teclado.nextInt();
            teclado.nextLine();
            teclado.nextLine();
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
    
}
