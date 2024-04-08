package javatests.Exercises.ExercisesGPT;
// Exercicio 03
public class Aluno extends Pessoa implements Imprimivel{
    private long matricula;

    public Aluno(String nome, int idade, long matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    // Exercicio 04
    @Override
    public void detalhes() {
        System.out.println("Nome do aluno é: " + this.getNome());
        System.out.println("Idade do aluno é: " + this.getIdade());
        System.out.println("Matrícula do aluno é: " + this.getMatricula());
    }

    // Exercicio 07
    @Override
    public void imprimir() {
        System.out.println("Imprimindo na folha: nome - " + this.getNome() + ", idade - " + this.getIdade() + " e " +
                "matrícula - " + this.getMatricula());
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
