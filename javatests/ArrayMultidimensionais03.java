package javatests;

public class ArrayMultidimensionais03 {
    public static void main(String[] args) {
        // Existe uma forma mais fácil de escrever criando um array multidimensional passando a quantidade de arrays que
        // vai ter e a quantidade de elementos que cada array vai possuir
        int[][] arrayMultidimensional = {{1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        // Aqui você está dizendo que tem 3 arrays dentro de um multidimensional com o primeiro com 8 elementos, o 2
        // com 4 elementos e o 3 com 10 elementos

        for (int[] arrayBase : arrayMultidimensional) {
            // Esse é o traço para saber onde vai cada array e a quantidade de seus elementos
            System.out.println("\n-----");
            for (int elementosDeCadaArray : arrayBase) {
                // Esse é o que vai trazer os elementos de cada array e dará um espaço para o print do próximo array
                System.out.println(elementosDeCadaArray + " ");
            }
        }
    }
}
