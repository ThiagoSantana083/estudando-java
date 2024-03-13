package javatests.POO.Tests.AssociacaoTests;

import javatests.POO.Classes.Associacao.Jogador;

public class Jogador01 {
    public static void main(String[] args) {
        // Instância do objeto
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Cristiano Ronaldo");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
