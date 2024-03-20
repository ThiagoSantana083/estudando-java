package javatests.Exercises;

public class CanetasInstancias {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Bic";
        caneta1.cor = "Azul";
        caneta1.carga = 50;
        caneta1.ponta = 0.7F;

        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();
        System.out.println("---------------------------------");
        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Stabilo";
        caneta2.cor = "Preta";
        caneta2.carga = 100;
        caneta2.ponta = 1.0F;

        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();
    }
}
