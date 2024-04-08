package javatests.Exercises.ExercisesGPT;

public class Pessoa implements Imprimivel{

    // Exercício 01
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Exercício 02
    public void detalhes () {
        System.out.println("Nome da pessoa é: " + this.getNome());
        System.out.println("Idade da pessoa é: " + this.getIdade());
    }

    // Exercicio 06
    @Override
    public void imprimir() {
        System.out.println("Imprimindo na folha: nome: " + this.getNome() + " e idade: " + this.getIdade());
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
}
