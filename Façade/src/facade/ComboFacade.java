package facade;

public class ComboFacade {
    
    private PratoPrincipal prato = new PratoPrincipal();
    
    ComboFacade(int escolha){
        
        //Prato Principal
        prato.adicionar(1, "Sanduba", 20);
        prato.adicionar(2, "Macarrão", 15);
        prato.adicionar(3, "Sopa", 5);
        
        //Sobremesas
        prato.adicionar(4, "Gelatina", 2);
        prato.adicionar(5, "Sorvete", 5);
        prato.adicionar(6, "Milkshake", 15);
        
        //Bebidas
        prato.adicionar(7, "Coca Zero", 6);
        prato.adicionar(8, "51", 5);
        prato.adicionar(9, "Pitú", 7);
        
        switch(escolha){
            
            case 1:
                System.out.println("Você recebeu o combo 1\n");
                break;
            
            case 2:
                System.out.println("Você recebeu o combo 2\n");
                break;
             
            case 3:
                System.out.println("Você recebeu o combo 3\n");
                break;
                
            default:
                System.out.println("Esse combo não existe\n");
                
        }
    }
    
    public void mostrarCombos(){
        System.out.println("Combo 1:");
        System.out.println(prato.itens.get(0).getDescricao());
        System.out.println(prato.itens.get(5).getDescricao());
        System.out.println(prato.itens.get(6).getDescricao() + "\n");
        
        System.out.println("Combo 2:");
        System.out.println(prato.itens.get(1).getDescricao());
        System.out.println(prato.itens.get(4).getDescricao());
        System.out.println(prato.itens.get(8).getDescricao() + "\n");
        
        System.out.println("Combo 3:");
        System.out.println(prato.itens.get(2).getDescricao());
        System.out.println(prato.itens.get(3).getDescricao());
        System.out.println(prato.itens.get(7).getDescricao() + "\n");
    }
    
}
