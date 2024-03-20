package javatests.Exercises;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public String getDieta() {
        return "Onívoro";
    }


    public void brincar() {
        System.out.println(this.nome + " está brincando");
    }
}
