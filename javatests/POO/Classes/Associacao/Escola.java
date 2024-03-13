package javatests.POO.Classes.Associacao;

public class Escola {

    // // Associação - um para muitos. A associação unilateral "muitos para um" em Java é um tipo de relacionamento
    // entre duas classes onde uma instância da classe "um" pode estar associada a várias instâncias da classe
    private String nome;
    private Professor[] professores;
    // Método que imprime os dados - nome da escola e nomes dos professores que tem na escola
    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }

    }
    // Construtor principal
    public Escola(String nome) {
        this.nome = nome;
    }
    // Sobrecarga de Construtor
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Get do professor - a partir da classe Professor
    public Professor[] getProfessores() {
        return professores;
    }
    // Set do professor - a partir da classe Professor
    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
