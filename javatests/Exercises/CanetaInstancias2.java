package javatests.Exercises;

public class CanetaInstancias2 {
    public static void main(String[] args) {
        Caneta2 caneta1 = new Caneta2();
        caneta1.modelo = "Bic";
        caneta1.cor = "Azul";
        caneta1.carga = 50;
        // Como definimos as propriedades (atributos) da caneta "Ponta" e "isTampada" como privada não podemos ter
        // acesso a elas para modificar porque quando colocamos como "private" fazemos com que apenas a Classe que
        // criou tenha acesso a esse atributo

        /* caneta1.ponta = 0.7F;
        caneta1.isTampada = false; */

        caneta1.tampar(); // Como esse método é público e faz parte da Classe podemos mexer no atributo que é privado
        // por meio de um método que seja público. Por que isso acontece? Porque o método que colocamos na classe é
        // público e podemos ter acesso a ela, já o atributo da classe que é privado não podemos ter acesso a ela.
        // Mas as duas coisas - método e atributo - são da classe. Então o método em si pode ter acesso ao atributo
        // da classe que é privado.
        caneta1.status();
        caneta1.rabiscar();
        System.out.println("---------------------------------");
        Caneta2 caneta2 = new Caneta2();
        caneta2.modelo = "Stabilo";
        caneta2.cor = "Preta";
        caneta2.carga = 100;
        //caneta2.ponta = 1.0F;

        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();
    }
}
