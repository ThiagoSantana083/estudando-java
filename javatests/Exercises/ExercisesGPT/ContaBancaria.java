package javatests.Exercises.ExercisesGPT;

public class ContaBancaria {
    // Exercício 19
    private int numeroConta;
    private int saldo;
    private Cliente titular;

    public ContaBancaria(int numeroConta, int saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Exercício 20
    public void detalhesContaBancaria() {
        System.out.println("Número da conta: " + this.getNumeroConta() + ", saldo da conta: " + this.getSaldo() + " " +
                "e nome do titular da conta: " + this.getTitular().getNome());
        System.out.println("Telefone do titular dessa conta: " + this.getTitular().getTelefone() + " e seu endereço: " + this.getTitular().getEndereco());
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
