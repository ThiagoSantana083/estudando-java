package javatests;

public class ExercicioForTwo {
    public static void main(String[] args) {
        // Imprima os números pares de 0 a 200.000
        for (int i = 0; i <+ 200000; i++) {
            if (i % 2 == 0) {
                System.out.println("Número: " + i + " é par!");
            }
        }
    }
}
