package javatests.POO.Tests;

import javatests.POO.Classes.Estudante;

public class Estudante01 {
    public static void main(String[] args) {

        // Aqui estamos fazendo a instância do objeto, ou seja, a criação de um objeto
        // Vemos aqui um tipo (Estudante) que tem o tipo da Classe Principal que contém suas características, ou
        // seja, seus atributos ou métodos. Assim isso seria o tipo do objeto que está sendo criado, que nesse caso é
        // do tipo estudante que esse tipo veio a partir da classe molde que construímos.

        // Também temos o nome do objeto (estudante) que seria o nome da variável que vai conter o objeto

        // Também temos a instância (criação) do objeto em si, que é com essa afirmação que dizemos que estamos
        // criando um objeto (new tipoDoObjeto();)
        Estudante estudante = new Estudante();
        // Para colocar ou atribuir algum valor para os atributos ou propriedades que o objeto utilizamos a sintaxe
        // de atribuição usando o (.nomeDoAtributo = valor) assim atribuímos os valores para os atributos
        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';
        // Após a atribuição dos valores para as propriedades podemos acessar tais valores apenas usando a mesma
        // sintaxe usada antes sem a atribuição de valor (.nomeDoAtributo)
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
