package strategy;

public class Main {

    public static void main(String[] args) {
	System.out.println("Implemente aqui o código para demonstrar o design Patter Strategy");

        Disciplina nota = new Disciplina();
        
        nota.setP1(6);
        nota.setP2(6);
        
        CalcMediaA mediaA = new CalcMediaA();
        
        mediaA.CalculaMedia(nota);
        
        CalcMediaB mediaB = new CalcMediaB();
        
        mediaB.CalculaMedia(nota);
        
    }
}
