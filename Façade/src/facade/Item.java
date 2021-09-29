package facade;

public class Item {
    
    private final int codigo;
    private final String descricao;
    private final double preco;
    
    Item(int codigo, String descricao, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public int getCodigo(){
        return this.codigo; 
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
}
