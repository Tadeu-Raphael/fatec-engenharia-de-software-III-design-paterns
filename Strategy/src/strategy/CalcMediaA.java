package strategy;

public class CalcMediaA implements ICalcMedia {

    public float media;
    
    @Override
    public void CalculaMedia(Disciplina d) {
        this.media = (d.getP1() + d.getP2())/2;
        
        if(this.media > 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
