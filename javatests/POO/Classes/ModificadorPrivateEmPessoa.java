package javatests.POO.Classes;

public class ModificadorPrivateEmPessoa {
    private String nome;
    private int idade;
    private int anosTrabalhando;

    // O modificador private faz com que os atributos de uma classe para instanciar um objeto seja privado. Assim não
    // faz com que não seja acessado diretamente a propriedade e atributo da classe. Isso ajuda para que não ocorra
    // uma mudança direta do valor da propriedade por algo externo

    // Assim quando criamos um setNomeAtributo - colocamos (setamos) um valor para ao atributo escolhido podendo
    // fazer verificação e assim com o this.NomeAtributo atribuímos o valor para a propriedade sem retornar nada

    // Assim quando queremos exibir o valor, usamos o getNomeAtributo para retornar apenas o valor. Assim não ocorre
    // problemas de subscrita do valor passado

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
        if (idade < 0) {
            return;
        }
        this.idade = idade;
    }

    public int getAnosTrabalhando() {
        return anosTrabalhando;
    }

    public void setAnosTrabalhando(int anosTrabalhando) {
        this.anosTrabalhando = anosTrabalhando;
    }
}
