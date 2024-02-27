package javatests;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // Aqui estão as três estruturas de repetição = while, do while e for (a mais usada)
        // while
        int count = 1;
        while (count <= 10) {
            System.out.println("Contador while a: " + count);
            count++;
        }

        // do while
        int count2 = 0;
        do {
            System.out.println("Contador do while igual a: " + count2);
            count2++;
        } while (count2 <= 12);

        // for

        for (int i = 0; i <= 15; i++) {
            System.out.println("Contador do for igual a: " + i);
        }
    }
}
