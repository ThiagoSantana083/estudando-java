package javatests.POO.Tests;

import javatests.POO.Classes.Filme;

public class Filme01 {
    public static void main(String[] args) {
        // Criação de um objeto com os parâmetros necessários por meio do construtor
        Filme filme = new Filme("Transformers", 2, "Ação" );
        filme.imprimir();
    }
}
