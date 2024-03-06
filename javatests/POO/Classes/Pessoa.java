package javatests.POO.Classes;

public class Pessoa {
    public String nome;
    public int idade;
    public char sexo;

    // Referência this. "this" é uma palavra-chave que se refere à instância atual de uma classe. Ela pode ser usada
    // dentro de métodos para se referir à instância atual da classe na qual o método está sendo chamado. Ou seja, é
    // "isso" que está sendo chamado.

    public void imprimirDados () {
        // o this se refere ao objeto criado pela classe que está sendo exibido, ou seja, a classe em que o objeto se
        // encontra.
        // Isso significa que "this" se refere ao objeto específico (instância) da classe em que o método está sendo
        // chamado.
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
