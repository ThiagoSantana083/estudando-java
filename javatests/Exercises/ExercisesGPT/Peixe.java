package javatests.Exercises.ExercisesGPT;

public class Peixe extends Animal implements Aquatico{

    public Peixe(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gluuu");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando");
    }
}
