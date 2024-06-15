//O CONCEITO DE POLIMORFISMO CAPACIDADE DE UM OBJETO PODER SER REFERENCIADO DE VÁRIAS FORMAS
package Poliformismo;

import Heranca.Animal;

public class Zoo {

    public void tratamento(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void alimentar(Animal animal){
        animal.setEstadoDeEspirito("Alimentado");
    }
}
