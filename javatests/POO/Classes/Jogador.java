package javatests.POO.Classes;

public class Jogador {
    private String nome;

    // Estudo sobre associação - arrays em objetos
    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
    }
}
