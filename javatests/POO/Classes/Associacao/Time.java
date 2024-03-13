package javatests.POO.Classes.Associacao;

public class Time {
    // Classe que vai ser usada para relação de associação com outra classe
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
