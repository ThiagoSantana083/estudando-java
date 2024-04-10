package javatests.Exercises.ExercisesGPT;

public class LivroEBibliotecaTest {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Introdução a computação", "Alan Thuring", 1960);
        Livro livro2 = new Livro("Harry Potter e a pedra filosofal", "J.K Rowling", 1997);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.exibirLivros();
    }
}
