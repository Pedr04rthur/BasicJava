package Heranca;

import Poliformismo.Zoo;

public class Principal {
    public static void main(String[] args) {

        Leao alex = new Leao("Felino","Alex","Saudável");
        Papagaio loro = new  Papagaio("Papagaio","Loro","Saudável");

        loro.soar();
        alex.soar();

        //Pegando o zoológico e colocando ele para  acessar os animais
        Zoo parque1 = new Zoo();
        parque1.tratamento(alex);
        System.out.println(alex.getEstadoDeEspirito());

        parque1.alimentar(loro);
        System.out.println(loro.getEstadoDeEspirito());

    }
}
