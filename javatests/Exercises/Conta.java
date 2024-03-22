package javatests.Exercises;

import java.util.Objects;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public Conta() {
        this.status = false;
        this.saldo = 0;
    }
    public void abrirConta(String tipo, String nomeDono) {
        setTipo(tipo);
        setStatus(true);
        setDono(nomeDono);
        if (tipo.equals("CC")) {
            this.saldo = 50;
        } else if (tipo.equals("CP")) {
            this.saldo = 150;
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Erro, conta não pode ser fechada, porque está com dinheiro então saque para fechar a " +
                    "conta");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar (float valor) {
        if (this.status) {
            this.saldo += valor;
        } else {
            System.out.println("Erro, conta não está aberta para poder depositar");
        }

    }
    public void sacar(float valor) {
        if (this.status) {
            if (this.saldo < valor) {
                System.out.println("Saque indisponível, dinheiro para saque maior que tem na conta");
            } else {
                this.saldo -= valor;
            }
        } else {
            System.out.println("Erro, conta não está aberta para poder sacar");
        }
    }

    public void pagarMensalidade(String tipo) {
        if (this.status) {
            if (tipo.equals("CC")) {
                this.saldo -= 12;
            } else if (tipo.equals("CP")) {
                this.saldo -= 20;
            }
        } else {
            System.out.println("Erro, conta não está aberta em nenhum tipo para pagar mensalidade");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
