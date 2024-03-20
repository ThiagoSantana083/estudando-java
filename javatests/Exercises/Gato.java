package javatests.Exercises;

public class Gato extends Animal{


    public Gato(String nome, int idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public String getDieta() {
        return "Carnívoro";
    }

    public void afiarUnhas () {
        System.out.println(this.nome + " está afiando as unhas");
    }
}
