package javatests.POO.Classes;

public class Calculadora {
    // Podemos criar métodos que façam algo por meio das classes molde. Ou seja, são ações que a classe pode realizar
    // os métodos de uma classe são blocos de código que definem comportamentos específicos associados a essa classe.
    // Eles representam ações que um objeto dessa classe pode realizar ou manipulações que podem ser feitas nos
    // atributos do objeto.


    // Aqui vemos um método que não possui parâmetros e nem retorno.
    // Parâmetros são Parâmetros são variáveis
    // declaradas em uma assinatura de método para receber valores que serão usados dentro do corpo do método.
    // Eles representam as informações que o método precisa para executar sua função.
    // Argumentos são quando os parâmetros são passados na chamada do método. que correspondem aos parâmetros declarados
    // no método
    public void somarDoisNumeros() {
        System.out.println(10 + 20);
    }
    // Aqui vemos um método que possui parâmetros mas sem retorno
    public void subtrairDoisNumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    // Aqui vemos um método que possui parâmetros e com retorno. O retorno não exibe nada no console, apenas vai
    // retorna o valor
    public int multiplicarDoisNumeros (int num1, int num2) {
        return num1 * num2;
    }
    // Mais um método que possui parâmetro e retorno
    public int divideDoisNumeros (int num1, int num2) {
        return num1/num2;
    }

}
