package javatests.POO.Tests;

import javatests.POO.Classes.Funcionario;

public class Funcionario01 {
    public static void main(String[] args) {
        // Resposta do exercício do funcionario
        Funcionario funcionario01 = new Funcionario();
        // Aqui colocamos os dados do objeto
        funcionario01.nome = "Carlos";
        funcionario01.idade = 28;
        funcionario01.salario = new int[]{1200, 1300, 1400};
        // Imprimimos os dados do objeto
        funcionario01.imprimirDados();
    }
}
