package javatests.POO.Classes;

public class Serie {
    // Aqui vamos ver sobre Sobrecarga de Construtores - que nada mais é que sobrescrever um construtor adicionando
    // mais um parâmetro usando o mesmo nome do primeiro. Assim faz com que facilite a quantidade de código escrito
    // e ainda facilita em produção em grande escala com muitos outros programadores

    // Explicação melhor - Eles permitem que você defina múltiplas versões de um
    // construtor com o mesmo nome, mas com diferentes listas de parâmetros. Isso oferece flexibilidade e
    // conveniência ao programar, permitindo que você utilize o mesmo nome para diferentes comportamentos ou
    // inicializações com base nos argumentos fornecidos.
    private String nome;
    private int episodios;
    private String genero;


    // Construtor normal
    public Serie (String nome, int episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }
    // Construtor usando sobrecarga de métodos para pegar o do anterior e mais um parâmetro sem prejudicar o
    // funcionamento de código
    public Serie (String nome, int episodios, String genero) {
        // Ao utilizar o this() - ele vai chamar o construtor que possui esses parâmetros e adicionar mais um.
        // Obrigatoriamente se for chamar um construtor tem que ser a primeira linha dentro de outro construtor
        this(nome, episodios);
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
}
