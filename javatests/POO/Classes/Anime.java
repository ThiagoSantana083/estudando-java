package javatests.POO.Classes;

public class Anime {
    // Aqui vamos ver sobrecarga de métodos - que nada mais é que sobrescrever um método adicionando mais um
    // parâmetro usando o mesmo nome do primeiro método. Assim faz com que facilite a quantidade de código escrito e
    // ainda facilita em produção em grande escala com muitos outros programadores

    // Explicação melhor - Eles permitem que você defina múltiplas versões de um método ou construtor com o mesmo nome,
    // mas com diferentes listas de parâmetros. Isso oferece flexibilidade e conveniência ao programar, permitindo que
    // você utilize o mesmo nome para diferentes comportamentos ou inicializações com base nos argumentos fornecidos.

    private String nome;
    private int episodios;
    private String tipo;
    private String genero;


    public void init (String nome, int episodios, String tipo) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
    }
    // Exemplo de uma sobrecarga de métodos adicionando mais um parâmetro
    public void  init (String nome, int episodios, String tipo, String genero) {
        this.init(nome, episodios, tipo);
        this.genero = genero;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.tipo);
        System.out.println(this.genero);
    }


}
