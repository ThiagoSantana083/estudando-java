package javatests.POO.Tests;

import javatests.POO.Classes.ArraySomaAndVarArgs;

public class ArraySoma {
    public static void main(String[] args) {
        // Criar objeto do tipo da classe
        ArraySomaAndVarArgs calcularSoma = new ArraySomaAndVarArgs();
        // Chamando método e passando os arrays como argumentos
        // Nesse caso vamos inicializar um array em uma variável primeiro
        int [] numerosDaSoma = {1, 2, 3, 4, 5};
        calcularSoma.somaArraySemVarArgs(numerosDaSoma);
        // Também podemos colocar direto no método sem usar VarArgs
        calcularSoma.somaArraySemVarArgs(new int []{1,2,3,4,5,6,7,8,9,10});

        // Chamada do método usando varargs
        calcularSoma.somaArrayComVarArgs(10,20,30,40,50,60);
    }
}
