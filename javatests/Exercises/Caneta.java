package javatests.Exercises;

public class Caneta {
    String modelo;
    String cor;
    int carga;
    float ponta;
    boolean isTampada;

    void status () {
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Carga da caneta: " + this.carga);
        System.out.println("Ponta da caneta: " + this.ponta);
        System.out.println("Está tampada? " + this.isTampada);
    }

    void rabiscar() {
        if(this.isTampada) {
            System.out.println("Erro, a caneta está tampada e não pode ser usada para rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }

    void tampar() {
        this.isTampada = true;
    }

    void destampar () {
        this.isTampada = false;
    }
}
