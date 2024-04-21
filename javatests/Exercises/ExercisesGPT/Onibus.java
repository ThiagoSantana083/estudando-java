package javatests.Exercises.ExercisesGPT;

public class Onibus extends Veiculo implements TransportePublico{
    public Onibus(String marca, int ano, String modelo) {
        super(marca, ano, modelo);
    }

    public void dirigir() {
        System.out.println("Uma pessoa está dirigindo um ônibus");
    }

    @Override
    public void cobrarTarifa() {
        System.out.println("Tarifa de R$ 4,90 cobrada");

    }
}
