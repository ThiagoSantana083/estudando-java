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
            this.setSaldo(50);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Erro, conta não pode ser fechada, porque está com dinheiro então saque para fechar a " +
                    "conta");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar (float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Erro, conta não está aberta para poder depositar");
        }

    }
    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() < valor) {
                System.out.println("Saque indisponível, dinheiro para saque maior que tem na conta");
            } else {
                this.setSaldo(this.getSaldo() - valor);
            }
        } else {
            System.out.println("Erro, conta não está aberta para poder sacar");
        }
    }

    public void pagarMensalidade(String tipo) {
        if (this.getStatus()) {
            if (tipo.equals("CC")) {
                this.setSaldo(this.getSaldo() - 12);
            } else if (tipo.equals("CP")) {
                this.setSaldo(this.getSaldo() - 20);
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
