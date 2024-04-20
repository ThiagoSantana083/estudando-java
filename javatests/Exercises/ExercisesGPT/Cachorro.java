package javatests.Exercises.ExercisesGPT;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU-AU!");
    }

    @Override
    public void mover() {
        System.out.println("Andou usando 4 patas - cachorro");
    }
}
