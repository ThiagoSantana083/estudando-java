package javatests.POO.Tests;

import javatests.POO.Classes.CarroClass02;

public class Carro02 {
    public static void main(String[] args) {
        // Instância do objeto

        CarroClass02 carro = new CarroClass02("Camaro", 250 );
        // Colocando um valor ao atributo da classe
        CarroClass02.setVelocidadeLimite(100);
        carro.imprime();
    }
}
