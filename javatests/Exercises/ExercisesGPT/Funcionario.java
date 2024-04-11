package javatests.Exercises.ExercisesGPT;

public class Funcionario {
    // Exercicio 13
    private String nome;
    private int salario;


    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Exercício 14
    public void detalhes() {
        System.out.println("Nome do funcionário: " + this.getNome() + " e seu salário: " + this.getSalario());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
