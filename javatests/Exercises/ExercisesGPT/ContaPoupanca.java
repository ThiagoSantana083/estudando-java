package javatests.Exercises.ExercisesGPT;

public class ContaPoupanca extends ContaBancaria {
    // Exercício 24
    private int taxaRendimento;

    public ContaPoupanca(int numeroConta, int saldo, Cliente titular, int taxaRendimento) {
        super(numeroConta, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    // Exercício 25
    @Override
    public void detalhesContaBancaria() {
        System.out.println("Número da conta: " + this.getNumeroConta() + ", saldo da conta: " + this.getSaldo() + " " +
                "e nome do titular da conta: " + this.getTitular().getNome() + " e a taxa de rendimento da conta " +
                "poupança: " + this.getTaxaRendimento());
        System.out.println("Telefone do titular dessa conta: " + this.getTitular().getTelefone() + " e seu endereço: " + this.getTitular().getEndereco());
    }

    public int getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(int taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
