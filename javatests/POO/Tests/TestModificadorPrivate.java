package javatests.POO.Tests;

import javatests.POO.Classes.ModificadorPrivateEmPessoa;

public class TestModificadorPrivate {
    public static void main(String[] args) {
        ModificadorPrivateEmPessoa pessoa = new ModificadorPrivateEmPessoa();

        // Colocar um nome para pessoa
        pessoa.setNome("Deborah");
        // Colocar uma idade para pessoa
        pessoa.setIdade(18);
        // Colocar anos trabalhando para pessoa
        pessoa.setAnosTrabalhando(2);

        // Pegando nome, idade e anos trabalhando da pessoa com variáveis

        String nome = pessoa.getNome();
        int idade = pessoa.getIdade();
        int anosTrabalhando = pessoa.getAnosTrabalhando();

        System.out.println(nome + " " + idade + " " + anosTrabalhando);
    }
}
