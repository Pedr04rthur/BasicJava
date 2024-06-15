package Heranca;

public class Principal {
    public static void main(String[] args) {

        Leao alex = new Leao("Felino","Alex","Saudável");
        Papagaio loro = new  Papagaio("Papagaio","Loro","Saudável");

        loro.soar();
        alex.soar();
    }
}
