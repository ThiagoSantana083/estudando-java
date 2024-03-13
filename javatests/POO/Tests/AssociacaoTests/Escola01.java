package javatests.POO.Tests.AssociacaoTests;

import javatests.POO.Classes.Associacao.Escola;
import javatests.POO.Classes.Associacao.Professor;

public class Escola01 {
    public static void main(String[] args) {
        // Instância do objeto escola que vai ser utilizada para a relação
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
