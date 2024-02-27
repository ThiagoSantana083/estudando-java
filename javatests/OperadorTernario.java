package javatests;

public class OperadorTernario {
    public static void main(String[] args) {
        // (condição) ? true : false
        int idade = 45;
        String mensagemDeMaior = "É maior de Idade";
        String mensagemDeMenor = "É menor de Idade";
        String resultado = idade >= 18 ? mensagemDeMaior : mensagemDeMenor;
        System.out.println(resultado);
    }
}
