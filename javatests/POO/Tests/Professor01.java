package javatests.POO.Tests;

import javatests.POO.Classes.Professor;

public class Professor01 {
    public static void main(String[] args) {
        // Instância e criação do objeto do tipo professor
        Professor professor = new Professor();

        professor.nome = "Matheus";
        professor.idade = 27;
        professor.sexo = 'M';
        professor.disciplina = "Geografia";

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo + " " + professor.disciplina);
    }
}
