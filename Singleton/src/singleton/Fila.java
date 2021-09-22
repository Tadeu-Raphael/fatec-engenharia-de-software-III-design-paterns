package singleton;
/**
 *
 * @author Tadeu
 */
public class Fila {

    public static void main(String[] args) {

        Singleton instanciaPrincipal = Singleton.getInstance();
        
        System.out.println(instanciaPrincipal.valor);

    }
    
}
