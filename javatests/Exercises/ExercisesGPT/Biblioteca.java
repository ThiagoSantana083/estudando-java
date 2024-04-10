package javatests.Exercises.ExercisesGPT;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Exercicio 10
    List<Livro> livros = new ArrayList<>();
    // Exercício 11
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    // Exercício 12
    public void exibirLivros () {
        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getTitulo() + ", autor " + livro.getAutor() + " e ano de publicação:" +
                    " " + livro.getAnoPublicacao());
            System.out.println("-----------------------------");
        }
    }


}
