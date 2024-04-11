package javatests.Exercises.ExercisesGPT;

public class ContaCorrente extends ContaBancaria{
    // Exercício 22
    private int limiteChequeEspecial;

    public ContaCorrente(int numeroConta, int saldo, Cliente titular, int limiteChequeEspecial) {
        super(numeroConta, saldo, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    // Exercício 23
    @Override
    public void detalhesContaBancaria() {
        System.out.println("Número da conta: " + this.getNumeroConta() + ", saldo da conta: " + this.getSaldo() + " " +
                "e nome do titular da conta: " + this.getTitular().getNome() + " e limite do cheque especial: " + this.getLimiteChequeEspecial());
        System.out.println("Telefone do titular dessa conta: " + this.getTitular().getTelefone() + " e seu endereço: " + this.getTitular().getEndereco());
    }

    public int getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(int limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}

