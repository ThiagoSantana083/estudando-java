package javatests.Exercises.ExercisesGPT;

public class Gerente extends Funcionario{

    // Exercício 15
    private String departamento;

    public Gerente(String nome, int salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    // Exercicio 16

    @Override
    public void detalhes() {
        System.out.println("Nome do funcionário: " + this.getNome() + ", seu salário: " + this.getSalario() + " e seu" +
                " departamento: " + this.getDepartamento());
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
