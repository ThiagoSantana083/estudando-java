package javatests.POO.Tests;

import javatests.POO.Classes.Calculadora;

public class Calculadora01 {
    public static void main(String[] args) {
        // Aqui criamos o objeto e chamamos os métodos da classe
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();

        // Aqui teremos a chamada do método que possui argumentos que levam para os parâmetros do método para executar
        calculadora.subtrairDoisNumeros(5,2);
        // Criaremos uma variável do tipo int que vai armazenar o retorno da função para ser exibido no console
        int result = calculadora.multiplicarDoisNumeros(5, 10);
        System.out.println(result);
        // Outra variável que vai armazenar outro retorno de outro método
        int resultadoDivisao = calculadora.divideDoisNumeros(10, 5);
        System.out.println(resultadoDivisao);
    }
}
