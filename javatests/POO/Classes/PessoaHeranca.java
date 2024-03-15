package javatests.POO.Classes;

public class PessoaHeranca {

    // SuperClasse que será utilizada para uma subclasse herdar atributos e métodos dela
    protected String nome;
    protected int idade;

    public PessoaHeranca(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaHeranca(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Meu nome é: " + this.nome + " e minha idade é: " + this.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
