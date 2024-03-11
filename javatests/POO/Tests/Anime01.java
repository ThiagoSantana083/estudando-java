package javatests.POO.Tests;

import javatests.POO.Classes.Anime;

public class Anime01 {
    public static void main(String[] args) {
        // Criação do objeto do tipo anime para demonstrar a sobrecarga de métodos
        Anime anime = new Anime();
        anime.init("One Piece", 1070, "Shonen");
        // Aqui vai adicionar o gênero do anime usando a sobrescrita provinda da sobrecarga do método
        anime.init("One Piece", 1070, "Shonen", "Ação");
        anime.imprime();
    }
}
