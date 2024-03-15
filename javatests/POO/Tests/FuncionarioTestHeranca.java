package javatests.POO.Tests;

import javatests.POO.Classes.FuncionarioHeranca;
import javatests.POO.Classes.PessoaHeranca;

public class FuncionarioTestHeranca {
    public static void main(String[] args) {
        // Instância do objeto do tipo pessoa
        PessoaHeranca pessoa1 = new PessoaHeranca("Thiago", 18);
        // Instância do objeto funcionário que é do tipo Pessoa também herdando suas características e métodos
        PessoaHeranca pessoa2 = new FuncionarioHeranca("Daniel", 15, 2000);
        pessoa1.imprime();
        pessoa2.imprime();
    }
}
