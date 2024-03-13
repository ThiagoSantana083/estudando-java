package javatests.POO.Classes.Associacao;

public class Jogador2 {
    private String nome;
    private Time2 time;

    // Construtor com nome e time
    public Jogador2(String nome, Time2 time) {
        this.nome = nome;
        this.time = time;
    }
    // Construtor com nome
    public Jogador2(String nome) {
        this.nome = nome;
    }

    // Método imprimir
    public void imprime () {
        System.out.print(this.nome + " - ");
        if (time == null) return;
        System.out.println(time.getNome());
    }
    // Get time
    public Time2 getTime() {
        return time;
    }
    // Set time
    public void setTime(Time2 time) {
        this.time = time;
    }

    // Get nome
    public String getNome() {
        return nome;
    }
    // Set nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}
