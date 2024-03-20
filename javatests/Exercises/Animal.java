package javatests.Exercises;

public class Animal {

    protected String nome;
    protected int idade;
    protected String som;

    public Animal(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(this.nome + " está dormindo.");
    }

    public void emitirSom() {
        System.out.println(this.nome + " faz " + this.som + ".");
    }

    // Método abstrato para retornar a dieta do animal
    public String getDieta() {
        return null;
    }

}