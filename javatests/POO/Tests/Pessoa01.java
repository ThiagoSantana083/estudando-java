package javatests.POO.Tests;

import javatests.POO.Classes.Pessoa;

public class Pessoa01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.nome = "Heloísa";
        pessoa01.idade = 18;
        pessoa01.sexo = 'F';
        // Como o this se referencia ao objeto criado a partir da classe pai. Ele vai dizer "esse objeto" formado
        // pelos atributos da classe molde. Assim nesse caso o this faz referência ao objeto pessoa01 criado a partir
        // da classe Pessoa com seus atributos

        // Isso significa que "this" se refere ao objeto específico (instância) da classe em que o método está sendo
        // chamado.
        pessoa01.imprimirDados();
    }
}
