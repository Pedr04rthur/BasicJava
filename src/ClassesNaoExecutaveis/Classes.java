package ClassesNaoExecutaveis;

//A classe irá definir como as coisas irão ser.
//Essas coisas, podemos chamar de objetos que parte da definição(classe)
//A classe cachorro irá definir Oque meu animal irá fazer
public class Classes {

    public static void main(String[] args) {
        //para criar meu objeto, crio a classe, o nome na memória e depois digo que essa variável é um novo cachorro
        Cachorro cachorro = new Cachorro();

        //declarando as variáveis que usamos na classe cachorro
        cachorro.cor = "Caramelo";
        cachorro.altura = 60;
        cachorro.peso = 20.5;
        cachorro.nome = "Peteca";

        //se dermos um print, aparecerá para nós o espaço dele definido na memória
        //System.out.println(cachorro);
        //result --> ClassesNaoExecutaveis.Cachorro@5f184fc6

        //executando o método no nosso objeto
        cachorro.latir();

        //Ele me mostra o que o método está me retornando
        System.out.println(cachorro.pegar());

        //chamando a variável e fazendo o carinho no cachorro
        System.out.println(cachorro.interagir("carinho"));
        System.out.println("PRONTO");

    }
}
