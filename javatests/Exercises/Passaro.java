package javatests.Exercises;

public class Passaro extends Animal{


    public Passaro(String nome, int idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public String getDieta() {
        return "Onívoro";
    }

    public void voar () {
        System.out.println(this.nome + " está voando");
    }
}
