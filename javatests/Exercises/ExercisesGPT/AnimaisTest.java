package javatests.Exercises.ExercisesGPT;

public class AnimaisTest {
    public static void main(String[] args) {
        // Classe de teste para os exercícios
        // Não colocarei a instancia de Animal porque não é necessário já que ela é utilizada para as outras classes
        // do tipo animal

        // Instância de cachorro e seus métodos
        Cachorro cachorro = new Cachorro("Bob", 2);
        System.out.println("Cachorro");
        cachorro.emitirSom();
        cachorro.mover();

        System.out.println("------------------------------");

        // Instância de gato e seus métodos
        Gato gato = new Gato("Cacau", 4);
        System.out.println("Gato");
        gato.emitirSom();
        gato.mover();

        System.out.println("---------------------------------");

        // Instância de passaro e seus métodos
        Passaro passaro = new Passaro("Loro José", 3);
        System.out.println("Pássaro");
        passaro.emitirSom();
        passaro.voar();

        System.out.println("---------------------------------");

        // Instância de peixe e seus métodos
        Peixe peixe = new Peixe("Nemo", 3);
        System.out.println("Peixe");
        peixe.emitirSom();
        peixe.nadar();
    }
}
