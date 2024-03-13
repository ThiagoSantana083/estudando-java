package javatests.POO.Classes.Associacao;

public class Time2 {
    // Um time pode conter mais de um jogador - bidirecional
    private String nome;
    private Jogador2[] jogadores;

    // Construtor do time contendo os jogadores
    public Time2(String nome, Jogador2[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }
    // Get jogadores
    public Jogador2[] getJogadores() {
        return jogadores;
    }
    // Set jogadores
    public void setJogadores(Jogador2[] jogadores) {
        this.jogadores = jogadores;
    }

    // Construtor do time com nome
    public Time2(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método imprimir os jogadores que fazem parte do time
    public void imprimir() {
        System.out.println("----" + this.nome + "----");
        if (jogadores == null) return;
        for (Jogador2 jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }
}

