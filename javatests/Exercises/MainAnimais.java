package javatests.Exercises;

public class MainAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob", 2, "auau");
        cachorro.comer();
        cachorro.dormir();
        cachorro.emitirSom();
        cachorro.brincar();
        System.out.println("Dieta do cachorro: " + cachorro.getDieta());
        Gato gato = new Gato("Lia", 3, "miau");
        gato.comer();
        gato.dormir();
        gato.emitirSom();
        gato.afiarUnhas();
        System.out.println("Dieta do gato: " + gato.getDieta());
        Passaro passaro = new Passaro("Jorge", 1, "piu");
        passaro.comer();
        passaro.dormir();
        passaro.emitirSom();
        passaro.voar();
        System.out.println("Dieta do passaro: " + passaro.getDieta());
    }
}
