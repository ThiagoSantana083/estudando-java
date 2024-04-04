package javatests.Exercises;

public class ProjetoPessoa {
    public static void main(String[] args) {
        // Aqui onde vai fazer as instancias do projeto contendo as classes Pessoa, Livro e Publicacao

        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        // Pessoa no índice 0 - pessoa 1
        pessoa[0] = new Pessoa("Thiago", 18, "Masculino");
        // Pessoa no índice 1 - pessoa 2
        pessoa[1] = new Pessoa("Heloisa", 18, "Feminino");
        // Livro no índice 0 - livro 1
        livro[0] = new Livro("Aprendendo Java", "Gustavo Guanabara", 250, pessoa[0]);
        // Livro no índice 1 - livro 2
        livro[1] = new Livro("O pequeno príncipe", "Antoine de Saint Exupéry", 188, pessoa[1]);
        // Livro no índice 2 - livro 3
        livro[2] = new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava ", 264, pessoa[0]);

        // Imprimindo dados dos livros
        livro[0].abrir();
        livro[0].folhear(150);
        livro[0].avancarPag();
        System.out.println(livro[0].detalhes());
        // Livro 2 detalhes
        livro[1].abrir();
        livro[1].folhear(160);
        livro[1].voltarPag();
        System.out.println(livro[1].detalhes());
        // Livro 3 detalhes
        livro[2].abrir();
        livro[2].folhear(230);
        livro[2].avancarPag();
        System.out.println(livro[2].detalhes());
    }
}
