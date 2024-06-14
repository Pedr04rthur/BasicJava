package ClassesNaoExecutaveis;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public String estadoDeEspirito;


    //definindo métodos(ações do nosso objeto cachorro)
    //esse método não retorna a nada;
    public void comer(){

    }

    public void latir(){
        System.out.println("AU! AU!");
    }

    //Estou definindo que ele esta retornando alguma coisa
    public String pegar(){
        //Obrigatoriamente o retorno tem que ser string pq eu defini String como retorno
        return "bolinha";
    }

    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            //este atributo esta recebendo feliz
            this.estadoDeEspirito = "feliz";
        } else {
            this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;
    }
}
