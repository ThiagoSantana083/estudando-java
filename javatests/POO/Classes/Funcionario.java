package javatests.POO.Classes;

public class Funcionario {
    // Exercicio de POO
    public String nome;
    public int idade;
    public int [] salario = new int[3];

    public void imprimirDados () {
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Idade do funcionário: " + this.idade);
        if (this.salario == null) return;
        for (int salary : this.salario) {
            System.out.println(salary + " ");
        }
        mediaSalario(this.salario);
    }

    public void mediaSalario (int[] numeros) {
        if (this.salario == null) return;
        int soma = 0;
        for (int num: numeros) {
            soma+=num;
        }
        soma /= numeros.length;
        System.out.println("Média do salário do funcionário é: " + soma);
    }

}
