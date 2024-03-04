package javatests;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // Veremos aqui um array multidimensional, ou seja, um array contendo outros arrays nele.

        // Nessa linha de código veremos que estamos colocando um array multidimensional possuindo 3 arrays nele
        int [][] arrayMultidimensional = new int[3][3];

        // Aqui vemos o índice ZERO do array (primeiro índice - posição 0) e seus valores em cada posição respectiva
        arrayMultidimensional[0][0] = 1;
        arrayMultidimensional[0][1] = 2;
        arrayMultidimensional[0][2] = 3;

        // Aqui vemos o índice UM do array (segundo índice - posição 1) e seus valores em cada posição respectiva
        arrayMultidimensional[1][0] = 4;
        arrayMultidimensional[1][1] = 5;
        arrayMultidimensional[1][2] = 6;

        // Aqui vemos o índice DOIS do array multidimensional (terceiro índice - posição 2) e seus valores em cada
        // posição
        // respectiva
        arrayMultidimensional[2][0] = 7;
        arrayMultidimensional[2][1] = 7;
        arrayMultidimensional[2][2] = 9;

        System.out.println(arrayMultidimensional[2][2]);
        System.out.println("-------------------------------");

        // Podemos usar o for normal para percorrer o array multidimensional para printar os valores
        for (int i = 0; i < arrayMultidimensional.length; i++) {
            for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                System.out.println("Valores usando o for normal: " + arrayMultidimensional[i][j]);
            }
        }

        System.out.println("-------------------------------");
        // Podemos usar o forEach para percorrer o array multidimensional para printar os valores
        for (int [] arrayBase : arrayMultidimensional) {
            for (int valor : arrayBase) {
                System.out.println("Valores usando o forEach: " + valor);
            }
        }

    }
}
