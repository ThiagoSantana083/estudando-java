package javatests.Exercises.ExercisesGPT;

public class Cliente {
    // Exercício 17
    private String nome;
    private String endereco;
    private long telefone;

    public Cliente(String nome, String endereco, long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Exercício 18
    public void detalhesCliente() {
        System.out.println("Nome do cliente: " + this.getNome() + ", seu endereço: " + this.getEndereco() + " e seu " +
                "telefone: " + this.getTelefone());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
