package javatests.POO.Classes;

public class AlunoFaculdadeUsandoEnum {
    private String nome;
    private int idade;

    private PeriodoFaculdadeEnum periodoDaFaculdade;

    public AlunoFaculdadeUsandoEnum(String nome, int idade, PeriodoFaculdadeEnum periodoDaFaculdade) {
        this.nome = nome;
        this.idade = idade;
        this.periodoDaFaculdade = periodoDaFaculdade;
    }

    public PeriodoFaculdadeEnum getPeriodoDaFaculdade() {
        return periodoDaFaculdade;
    }

    @Override
    public String toString() {
        return "AlunoFaculdadeUsandoEnum{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", periodoDaFaculdade=" + periodoDaFaculdade +
                '}';
    }

    public AlunoFaculdadeUsandoEnum(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
