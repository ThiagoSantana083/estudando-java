package javatests.Exercises.ExercisesGPT;

public class Passaro extends Animal implements Voador{

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }
}
