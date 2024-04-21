package javatests.Exercises.ExercisesGPT;

public class Moto extends Veiculo{

    public Moto(String marca, int ano, String modelo) {
        super(marca, ano, modelo);
    }

    public void pilotar() {
        System.out.println("A pessoa está pilotando uma moto");
    }
}
