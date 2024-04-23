package javatests.Exercises.ExercisesGPT;

public class VeiculosTest {
    public static void main(String[] args) {
        // Instâncias dos objetos para serem testados - exercício 34-36
        Carro carro = new Carro("Chevrolet", 2015, "Prisma");
        carro.detalhes();
        carro.dirigir();

        System.out.println("------------------------------");

        Moto moto = new Moto("Yamaha", 2024, "Suzuki");
        moto.detalhes();
        moto.pilotar();

        System.out.println("------------------------------");

        Onibus onibus = new Onibus("Marcopolo", 2014, "Paradiso G8");
        onibus.detalhes();
        onibus.dirigir();
        onibus.cobrarTarifa();
    }
}
