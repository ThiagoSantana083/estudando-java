package javatests.POO.Classes;

public class Filme {
    // Aqui vamos ver sobre construtores
    private String nome;
    private int tempoDuracaoHoras;
    private String genero;

    // Construtor padrão - em que a própria linguagem faz ao criar um objeto. Isso faz com que o objeto seja iniciado
   //public Filme() { }


    // Construtor com parâmetros - faz com que ao criar um objeto seja necessário colocar os parâmetros, ou seja, os
    // valores de argumentos para iniciar um objeto. Assim um objeto só é criado no momento em que você coloca os
    // argumentos para serem passados como parâmetros
    public Filme(String nome, int tempoDuracaoHoras, String genero) {
        this.nome = nome;
        this.tempoDuracaoHoras = tempoDuracaoHoras;
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tempoDuracaoHoras);
        System.out.println(this.genero);
    }
}
