package Heranca;

//classe filha de ANIMAL
public class Leao extends Animal{
    public Leao(String tipo, String nome, String estadoDeEspirito) {
        super(tipo, nome, estadoDeEspirito);
    }

    @Override
    public void soar(){
        System.out.println("Leão Rugindo");
    }
}
