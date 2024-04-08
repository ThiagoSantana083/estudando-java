package javatests.Exercises.ExercisesGPT;

public class PessoaEAlunoTest {
    public static void main(String[] args) {
        // Testando o que fiz de exercício
        Pessoa pessoa01 = new Pessoa("Mirian", 47);
        pessoa01.detalhes();
        pessoa01.imprimir();
        System.out.println("-------------------------------");
        Aluno aluno01 = new Aluno("Thiago", 18, 2024111590109L);
        aluno01.detalhes();
        aluno01.imprimir();
    }
}
