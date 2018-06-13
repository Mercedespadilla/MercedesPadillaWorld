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
    
    String nomUser;
    String raza;
    boolean turno;
    static Scanner teclado;
    
    public static void main(String[] args) {
        
        teclado = new Scanner(System.in);
        
        System.out.println("*** BIENVENIDOS AL HIMALAYA ***");
        
        menuInicio();
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
                    menuJuego();
                    break;
                case 2:
                    System.exit(0);
        }
        }while(opc < 3 && opc > 0);
    }
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }

    private static void menuJuego() {
       
    }
    
}
