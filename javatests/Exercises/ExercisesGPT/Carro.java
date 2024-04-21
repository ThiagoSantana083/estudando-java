package javatests.Exercises.ExercisesGPT;

public class Carro extends Veiculo {

    public Carro(String marca, int ano, String modelo) {
        super(marca, ano, modelo);
    }

    public void dirigir() {
        System.out.println("Uma pessoa está dirigindo um carro");
    }
}
