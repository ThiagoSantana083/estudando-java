package javatests.POO.Tests;

import javatests.POO.Classes.Animal;
import javatests.POO.Classes.Cachorro;

public class Cachorro01 {
    public static void main(String[] args) {
        // Instância do objeto do tipo Animal sendo da classe Cachorro que usa polimorfismo
        Animal cachorro = new Cachorro("Bob", 3, "Jonatha");
        cachorro.imprime();
    }
}
