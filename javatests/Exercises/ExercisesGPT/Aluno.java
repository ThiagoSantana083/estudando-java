package javatests.Exercises.ExercisesGPT;
// Exercicio 03
public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    // Exercicio 04
    @Override
    public void detalhes() {
        System.out.println("Nome do aluno é " + this.getNome());
        System.out.println("Idade do aluno é " + this.getIdade());
        System.out.println("Matrícula do aluno é " + this.getMatricula());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
