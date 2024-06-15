package Heranca;
//CONCEITO DE HERANÇA: aTRAVÉS DA HERANÇA PODEMOS CONTRUIR UMA CLASSE COM CARACTERÍSTICAS E ESTENDER DESSA CLASSE OUTRAS CLASSES
// NO CASO, CLASSE ANIMAIS, SUAS CARACTERÍSTICAS POSSO UTILIZAR  PARA QUALQUER ANIMAL EU CRIAR;

public class Animal {
    //qualquer classe filha em outro pacote pode acessar a classe pai

    protected String tipo;
    protected String nome;
    protected String estadoDeEspirito;

    public Animal(String tipo, String nome, String estadoDeEspirito) {
        this.tipo = tipo;
        this.nome = nome;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    void comer(){
        System.out.println("COMENDO ...");
    }

    void dormir(){
        System.out.println("ZzzZZz");
    }

    void soar(){
        System.out.println("Barulho");
    }


}
