package encapsulamento;

public class Gato {

    //atributos
    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int tamanho;
    private String estadoDeEspirito;


    //construtores

    public  Gato(){}
    public Gato(String nome, String cor, int tamanho, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeGatos ++;
    }


    //MÉTODOS

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }

    public static void setNumeroDeGatos(int numeroDeGatos) {
        Gato.numeroDeGatos = numeroDeGatos;
    }

    //este método ta chamando a variável nome
    //privando o nome e mostrando um nome padrão para quem tiver acessando
    // mas, nesse caso eu irei mostrar


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getEstadoDeEspirito() {
        return this.estadoDeEspirito;
    }

  }

