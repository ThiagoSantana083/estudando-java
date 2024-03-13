package javatests.POO.Classes.Associacao;

public class Jogador {

    // Associação - um para muitos. A associação unilateral "um para muitos" em Java é um tipo de relacionamento entre
    // duas classes
    // onde uma instância da classe "um" pode estar associada a várias instâncias da classe
    private String nome;
    private Time time;


    // Get do time - a partir da classe Time
    public Time getTime() {
        return time;
    }
    // Set do time - a partir da classe Time
    public void setTime(Time time) {
        this.time = time;
    }

    // Estudo sobre associação - arrays em objetos
    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }
}
