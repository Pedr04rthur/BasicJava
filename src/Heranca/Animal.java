package Heranca;
//CONCEITO DE HERANÇA: aTRAVÉS DA HERANÇA PODEMOS CONTRUIR UMA CLASSE COM CARACTERÍSTICAS E ESTENDER DESSA CLASSE OUTRAS CLASSES
// NO CASO, CLASSE ANIMAIS, SUAS CARACTERÍSTICAS POSSO UTILIZAR  PARA QUALQUER ANIMAL EU CRIAR;

//nao pode criar objets a partir dela, ela é abstrata pq só podemos extender oque tem nela para outras classes
public abstract class Animal {
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

    //todos os animais tem o método soar, mas cada um tem seu próprio som definido.

    public abstract void soar();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
}
