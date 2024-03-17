package javatests.POO.Classes;

public class Animal {

    // Super classe que vai ser pai da classe cachorro.
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprime () {
        System.out.println("Nome: " + this.nome + ", idade: " + this.idade);
    }
}
