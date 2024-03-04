package javatests;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // Aqui estão outras formas de inicializar arrays multidimensionais

        // int [][] arrayMultidimensional = new int[3][3];
        // No exemplo acima é um método em que inicializa o array de arrays e coloca a quantidade de elementos que um
        // array dentro dele vai ter e a quantidade que colocamos vai em todos os array dentro dele

        // Mas podemos fazer com que cada array dentro do multidimensional tenha sua quantidade de elementos específica

        int [][] arrayMultidimensional = new int[3][];
        // Aqui dizemos a quantidade de elementos que cada (índice de array - array) vai ter


//        arrayMultidimensional[0] = new int[4];
//        arrayMultidimensional[1] = new int[5];
//        arrayMultidimensional[2] = new int[8];

        // Então nesse caso estamos dizendo que o array no índice 0 vai ter 4 elementos; Array no índice 1 vai ter 5
        // elementos e Array no índice 2 vai ter 8 elementos

        // Ele vai trazer apenas a quantidade de elementos em forma de zero porque ainda n&atilde;o colocamos um valor para
        // cada um deles

        // para colocar um valor precisamos mudar esse código ficando assim
        arrayMultidimensional[0] = new int[] {1, 2, 3, 4};
        arrayMultidimensional[1] = new int[] {1, 2, 3, 4, 5, 6};
        arrayMultidimensional[2] = new int[] {1, 2, 3, 4, 5, 6, 7, 8};


        for (int[] arrayBase : arrayMultidimensional ) {
            // Esse é o traço para saber onde vai cada array e a quantidade de seus elementos
            System.out.println("\n-----");
            for (int valor : arrayBase) {
                System.out.println(valor + " ");
            }
        }
    }
}
