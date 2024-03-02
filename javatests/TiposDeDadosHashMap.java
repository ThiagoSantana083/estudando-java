package javatests;

import java.util.HashMap;
import java.util.Map;

public class TiposDeDadosHashMap {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        // Colocando chave e valor - Nota pessoal: parece um objeto do Javascript KKKKKKKKKKKK

        notas.put("Daniel", 7);
        notas.put("Thiago", 10);
        notas.put("Danielle", 8);

        // Vale lembrar que no HashMap caso tiver uma chave (key) com o mesmo nome e o valor diferente. Ele vai pegar o último valor para ser exibido nessa chave, sendo assim substituindo o valor anterior.

        for(Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("A chave é: " + key + " e o valor é: " + value);
        }
    }
}
