package javatests;

import java.util.ArrayList;
import java.util.List;

public class TiposDeDadosLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Thiago");
        nomes.add("Heloisa");
        nomes.add("Chico");
        nomes.add("Xavier");
        nomes.add("Xavier");

        for (String nome : nomes) {
            System.out.println("O nome exibido é "  + nome);
        }

        nomes.forEach(nome -> System.out.println("O nome que apareceu usando for each de maneira lambda ou parecido com arrow function do js é " + nome));
    }
}
