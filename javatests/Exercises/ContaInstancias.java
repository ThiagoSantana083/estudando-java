package javatests.Exercises;

public class ContaInstancias {
    public static void main(String[] args) {
        // Abrindo conta do tipo conta corrente
        Conta conta1 = new Conta();
        System.out.println("Assim que inicializei status: "+ conta1.getStatus());
        System.out.println("Assim que inicializei saldo: " + conta1.getSaldo());
        // Testando sacar sem status abrir
        conta1.sacar(5.2f);
        conta1.abrirConta("CC","Thiago Santana");
        System.out.println("Assim que abri a conta do tipo Conta Corrente status: " + conta1.getStatus());
        System.out.println("Assim que abri a conta do tipo Conta Corrente saldo: " + conta1.getSaldo());
        System.out.println("Assim que abri a conta do tipo Conta Corrente tipo: " + conta1.getTipo());
        System.out.println("Nome do dono quem abriu a conta: " + conta1.getDono());
        // Testando sacar sem ter dinheiro suficiente
        conta1.sacar(60f);
        // Testando depositar valor na conta
        conta1.depositar(60f);
        System.out.println("Valor do saldo depois que eu depositei um valor: " + conta1.getSaldo());
        // Testando sacar valor na conta após ter depositado algum valor
        conta1.sacar(20f);
        System.out.println("Valor do saldo depois que eu saquei um valor: " + conta1.getSaldo());
        // Teste de pagar mensalidade de conta (nesse caso conta-corrente - 12)
        conta1.pagarMensalidade("CC");
        System.out.println("Valor do saldo depois de pagar mensalidade: " + conta1.getSaldo());
        // Testando fechar conta com algum valor dentro
        conta1.fecharConta();
        // Testando fechar conta após ter sacado o dinheiro que tinha
        conta1.sacar(78f);
        conta1.fecharConta();
        System.out.println(conta1.getStatus());

        System.out.println("------------------------------------------------------------------");

        // Abrindo conta do tipo conta poupança
        Conta conta2 = new Conta();
        System.out.println("Assim que inicializei status: "+ conta2.getStatus());
        System.out.println("Assim que inicializei saldo: " + conta2.getSaldo());
        // Testando sacar sem status abrir
        conta2.sacar(5.2f);
        conta2.abrirConta("CP","Heloisa Maria");
        System.out.println("Assim que abri a conta do tipo Conta Corrente status: " + conta2.getStatus());
        System.out.println("Assim que abri a conta do tipo Conta Corrente saldo: " + conta2.getSaldo());
        System.out.println("Assim que abri a conta do tipo Conta Corrente tipo: " + conta2.getTipo());
        System.out.println("Nome do dono quem abriu a conta: " + conta2.getDono());
        // Testando sacar sem ter dinheiro suficiente
        conta2.sacar(160f);
        // Testando depositar valor na conta
        conta2.depositar(60f);
        System.out.println("Valor do saldo depois que eu depositei um valor: " + conta2.getSaldo());
        // Testando sacar valor na conta após ter depositado algum valor
        conta2.sacar(20f);
        System.out.println("Valor do saldo depois que eu saquei um valor: " + conta2.getSaldo());
        // Teste de pagar mensalidade de conta (nesse caso conta-corrente - 12)
        conta2.pagarMensalidade("CP");
        System.out.println("Valor do saldo depois de pagar mensalidade: " + conta2.getSaldo());
        // Testando fechar conta com algum valor dentro
        conta2.fecharConta();
        // Testando fechar conta após ter sacado o dinheiro que tinha
        conta2.sacar(170f);
        conta2.fecharConta();
        System.out.println(conta2.getStatus());
    }
}
