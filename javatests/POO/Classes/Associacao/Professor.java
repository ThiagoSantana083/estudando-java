package javatests.POO.Classes.Associacao;

public class Professor {

    // Classe que vai ser usada para relação de associação com outra classe
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor(String nome) {
        this.nome = nome;
    }
}
