package javatests.POO.Classes;

import java.sql.SQLOutput;

public class FuncionarioHeranca extends PessoaHeranca{
     // SubClasse Funcionario que está herdando os atributos e métodos da Pessoa (SuperClasse) porque um funcionário é
     // uma pessoa, assim podemos fazer algo específico para o funcionário
    protected int salario;

    public FuncionarioHeranca(String nome, int idade, int salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public FuncionarioHeranca(String nome, int salario) {
        super(nome);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    // Polimorfismo - ou seja, a ideia de sobrescrever algo para diferente que nesse caso é específico para funcionário
    @Override
    public void imprime() {
        System.out.println("Meu nome é: " + this.nome + ", minha idade é: " + this.idade + " e meu salário é: " + this.salario);
    }



}
