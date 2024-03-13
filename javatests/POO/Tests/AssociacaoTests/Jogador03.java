package javatests.POO.Tests.AssociacaoTests;

import javatests.POO.Classes.Associacao.Jogador2;
import javatests.POO.Classes.Associacao.Time2;

public class Jogador03 {
    public static void main(String[] args) {
        // Instância dos objetos dos jogadores
        Jogador2 jogador1 = new Jogador2("Neymar");
        Jogador2 jogador2 = new Jogador2("Gabriel Jesus");
        Jogador2 jogador3 = new Jogador2("Richarlison");
        Jogador2 jogador4 = new Jogador2("Tony Kroos");
        Jogador2 jogador5 = new Jogador2("Bellingham");
        Jogador2 jogador6 = new Jogador2("Vinícius Jr");
        // Instância dos objetos dos times
        Time2 time = new Time2("Brasil");
        Time2 time2 = new Time2("Real Madrid");
        // Instância dos objetos do time com vários jogadores
        Jogador2[] jogadoresSelecao = {jogador1, jogador2, jogador3};
        Jogador2[] jogadoresReal = {jogador4, jogador5, jogador6};

        System.out.println("Jogadores e seus times: ");
        System.out.println();

        // Jogador 1
        jogador1.setTime(time);
        jogador1.imprime();
        // Jogador 2
        jogador2.setTime(time);
        jogador2.imprime();
        // Jogador 3
        jogador3.setTime(time);
        jogador3.imprime();
        // Jogador 4
        jogador4.setTime(time2);
        jogador4.imprime();
        // Jogador 5
        jogador5.setTime(time2);
        jogador5.imprime();
        // Jogador 6
        jogador6.setTime(time2);
        jogador6.imprime();

        // Dados dos times
        System.out.println();
        System.out.println("Times e seus jogadores: ");
        System.out.println();
        // Time 1
        time.setJogadores(jogadoresSelecao);
        time.imprimir();
        // Time 2
        time2.setJogadores(jogadoresReal);
        time2.imprimir();
    }
}
