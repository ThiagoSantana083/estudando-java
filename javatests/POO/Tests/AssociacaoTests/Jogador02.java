package javatests.POO.Tests.AssociacaoTests;

import javatests.POO.Classes.Associacao.Jogador;
import javatests.POO.Classes.Associacao.Time;

public class Jogador02 {
    public static void main(String[] args) {
        // Instância do objeto com associação - Um para muitos

        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Al-Hilal");
        // A relação de associação dessas duas classes se dá pelo método set para setar um time para o jogador
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
