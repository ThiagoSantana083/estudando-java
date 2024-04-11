package javatests.Exercises.ExercisesGPT;

public class FuncionarioEGerenteTest {
    public static void main(String[] args) {
        // Testes do exercício 13-16
        Funcionario funcionario = new Funcionario("Jonatha", 600);
        funcionario.detalhes();

        Gerente gerente = new Gerente("Daniel", 4000, "Marketing");
        gerente.detalhes();
    }
}
