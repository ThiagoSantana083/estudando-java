package javatests.Exercises.ExercisesGPT;

public class Livro {
    // Exercício 08
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    // Exercício 09
    public void detalhesLivro() {
        System.out.println("Nome do livro: " + this.getTitulo() + ", autor do livro: " + this.getAutor() + " e ano de" +
                " publicação do livro: " + this.getAnoPublicacao());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
