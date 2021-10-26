package strategy;

public class CalcMediaB implements ICalcMedia {

    public float media;
    
    @Override
    public void CalculaMedia(Disciplina d) {
        this.media = (d.getP1() + d.getP2())/2;
        
        if(this.media > 5){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    
    
    
    
}
