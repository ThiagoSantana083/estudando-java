package javatests.POO.Classes;

public class Cachorro extends Animal{
    // Sub classe que vai herdar e sobrescrever método da classe pai - Animal
    protected String nomeDoDono;
    public Cachorro(String nome, int idade, String nomeDoDono) {
        super(nome, idade);
        this.nomeDoDono = nomeDoDono;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public Cachorro(String nome, String nomeDoDono) {
        super(nome);
        this.nomeDoDono = nomeDoDono;
    }

    @Override
    public void imprime() {
        System.out.println("Nome do Cachorro: " + this.nome + ", idade: " + this.idade + ", nome do dono: " + this.nomeDoDono);
    }
}
