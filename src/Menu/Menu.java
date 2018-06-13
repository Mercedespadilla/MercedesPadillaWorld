package Menu;

/**
 *
 * @author padilla
 */
public class Menu {
    public static Menu menu;
    Usuario u = new Usuario();

    public Menu() {
    }
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
