package javatests.POO.Classes;

public class CarroClass02 {

    // Modificador static faz com que os atributos ou métodos sejam apenas da classe sem necessariamente pertencer a
    // instância do objeto.

    // Explicação melhor - são aqueles que pertencem à classe em vez de pertencerem a instâncias individuais dessa classe.
    // Isso significa que você pode acessá-los sem precisar criar uma instância da classe.
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(CarroClass02.velocidadeLimite);
    }

    // Método get static
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
    // Método set static
    public static void setVelocidadeLimite(double velocidadeLimite) {
        CarroClass02.velocidadeLimite = velocidadeLimite;
    }

    public CarroClass02(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
