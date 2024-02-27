package javatests;

public class ExercicioFor {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 a 100.000

        for (int i = 0; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println("Número: " + i + " é par.");
            }
        }
    }
}
