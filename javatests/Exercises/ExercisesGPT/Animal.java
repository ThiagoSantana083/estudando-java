package javatests.Exercises.ExercisesGPT;

public class Animal {
    // Exercício 26
    private String nome;
    private int idade;

    public void emitirSom() {
        System.out.println("Emitiu som!");
    }

    public void mover() {
        System.out.println("Se moveu!");
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
