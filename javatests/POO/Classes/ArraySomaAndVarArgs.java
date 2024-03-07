package javatests.POO.Classes;

public class ArraySomaAndVarArgs {
    // Podemos declarar array como parâmetros de um método de classe para fazer alguma coisa com ele. Por exemplo:
    // iremos somar todos os elementos de um array passada como argumento para o parâmetro do método abaixo

    public void somaArraySemVarArgs(int [] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        System.out.println("A soma do array sem usar VarArgs é: " + soma);
    }
    // E existe o conceito de VarArgs - lembra um pouco o rest operator do javascript. VarArgs nada mais é que
    // vai indicar que o que vai ser passado no parâmetro vai ser um array. Usado para quando não sabe quantos
    // parâmetros (elementos) de uma lista vai receber. VarArgs (...)

    // Regras de uso - Só pode usar um varargs em um método. Deve ser o último em uma ordem de parâmetros
    public void somaArrayComVarArgs(int... numeros) {
       int soma = 0;
       for (int num: numeros) {
           soma += num;
       }

        System.out.println("A soma do array usando VarArgs é: " + soma);
    }
}
