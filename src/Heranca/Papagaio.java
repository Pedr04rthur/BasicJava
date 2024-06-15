package Heranca;

public class Papagaio extends Animal {

    public Papagaio(String tipo, String nome, String estadoDeEspirito) {
        //Construtor referência, O CONSTRUTOR FILHO TEM QUE SER IGUAL O DO PAI.
        super(tipo, nome, estadoDeEspirito);


        //Mudando resultado do métodp para uma classe específica

    }

    @Override
    void soar(){
        System.out.println("Papagaio soando");
    }
}
