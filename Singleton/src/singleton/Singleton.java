package singleton;
/**
 *
 * @author Tadeu
 */
public class Singleton {
       
    private static Singleton instanciaPrincipal = new Singleton("TESTE");
    
    public String valor;
    
    private Singleton(String valor){
        this.valor = valor;
    }
    
    public static Singleton getInstance(){
        return instanciaPrincipal;
    }
    
}
