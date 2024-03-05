package javatests.POO.Tests;

import javatests.POO.Classes.Carro;

public class Carro01 {
    public static void main(String[] args) {
        // Instância do objeto do tipo Carro
        Carro carro = new Carro();

        carro.nome = "Camaro";
        carro.modelo = "Chevrolet Camaro";
        carro.ano = 2024;

        System.out.println("Esse é o nome do carro: " + carro.nome + " esse é o modelo: " + carro.modelo + " e esse é" +
                " o ano dele " + carro.ano);
    }
}
