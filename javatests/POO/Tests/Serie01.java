package javatests.POO.Tests;

import javatests.POO.Classes.Serie;

public class Serie01 {
    public static void main(String[] args) {
        // Criação de um objeto para mostrar a sobrecarga de construtores - tanto se eu passar o último parâmetro ou
        // deixar de passar vai funcionar porque existe uma sobrecarga de construtores
        Serie serie = new Serie("The office", 201, "Comédia");
        serie.imprimir();
    }
}
