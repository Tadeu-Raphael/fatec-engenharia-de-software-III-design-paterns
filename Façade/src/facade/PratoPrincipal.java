package facade;
import java.util.ArrayList;

public class PratoPrincipal {
    
    public ArrayList<Item> itens = new ArrayList();

    PratoPrincipal(){
        
    }
    
    public void adicionar(int codigo, String descricao, double preco){
        Item novoItem = new Item(codigo, descricao, preco);
        itens.add(novoItem);
    }
    
    public void remover(int codigo){
        itens.remove(codigo);
    }
    
    public void mostraItens(){
        int total = itens.size();
        int cont;
        for(cont=0; cont<total; cont++){
            System.out.println("Código: " + itens.get(cont).getCodigo());
            System.out.println("Descrição: " + itens.get(cont).getDescricao());
            System.out.println("Preço: " + itens.get(cont).getPreco() + "\n");
        }
    }
    
}
