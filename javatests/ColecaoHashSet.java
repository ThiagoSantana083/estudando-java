package javatests;

import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        // Coleção - Hash Set - diferente do Hash Map não possui chave e valor, mas apenas um valor. Vai exibir 1 único valor caso tiver dois com número igual
    
        Set<Integer> numero = new HashSet<>();

        // Podemos adicionar
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        // Podemos remover
        numero.remove(4);

        System.out.println(numero);

        for(Integer elemento : numero) {
            System.out.println(elemento);
        }

        // Podemos verificar se possui um elemento específico nele e vai ser um valor booleano

        boolean isContain = numero.contains(3);
        System.out.println(isContain);
    }
}
