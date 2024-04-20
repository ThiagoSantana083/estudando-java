package javatests.Exercises.ExercisesGPT;

public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("MIAU!");
    }

    @Override
    public void mover() {
        System.out.println("Andou com 4 patas - gato");
    }
}
