package encapsulamento;

public class CriadorDeGato {
    public static void main(String[] args) {
        Gato miau1 = new Gato(); //valores null

        Gato miau2 = new Gato("Alfredo","Cinza",30,"padrão");
        Gato miau3 = new Gato("Pixano","Preto",30,"padrão");

        System.out.println(miau1.getNome());
        System.out.println(miau2.getNome());

        System.out.println(miau3.getNumeroDeGatos()); //OBSERVANDO QUANTOS ONJETOS JÁ TEM
    }
}
