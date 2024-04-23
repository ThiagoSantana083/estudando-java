package javatests.Exercises.ExercisesGPT;

public class TrianguloTest {
    public static void main(String[] args) {
        // Instancia do triangulo
        Triangulo triangulo = new Triangulo(2, 4, 4, 5, true);
        triangulo.isValido();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
    }
}
