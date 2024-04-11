package javatests.Exercises.ExercisesGPT;

public class ClienteEContaTest {
    public static void main(String[] args) {
        System.out.println("------------------Conta bancária normal-------------------");

        Cliente cliente = new Cliente("Thiago", "Rua Comerciante Terezinha Maria Alves", 83999537489L);
        ContaBancaria contaBancaria = new ContaBancaria(1234, 1200, cliente);
        contaBancaria.depositar(100);
        contaBancaria.sacar(50);
        contaBancaria.detalhesContaBancaria();

        System.out.println("-----------------Conta Corrente---------------------");

        Cliente cliente2 = new Cliente("Mirian", "Rua Comerciante", 83999537489L);
        ContaCorrente contaCorrente = new ContaCorrente(1254, 2000, cliente2, 500);
        contaCorrente.depositar(200);
        contaCorrente.sacar(50);
        contaCorrente.detalhesContaBancaria();

        System.out.println("-------------------Conta Poupança-------------------------");
        Cliente cliente3 = new Cliente("Daniel", "Rua comerciante", 988701402L);
        ContaPoupanca contaPoupanca = new ContaPoupanca(555, 4000, cliente3, 450);
        contaPoupanca.depositar(1000);
        contaPoupanca.sacar(100);
        contaPoupanca.detalhesContaBancaria();
    }
}
