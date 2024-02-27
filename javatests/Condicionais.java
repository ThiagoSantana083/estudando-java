package javatests;

public class Condicionais {
    public static void main(String[] args) {
        int idade = 18;
        String person = "Matheus";

        if(person.equals("Matheus") && idade >= 18) {
            System.out.println("O usuário se chama Matheus e possui idade maior ou igual a 18");
        } else if(!(person.equals("Matheus")) && idade >= 18) {
            System.out.println("O usuário não se chama Matheus e possui idade maior ou igual a 18");
        } else if(person.equals("Matheus") && idade < 18) {
            System.out.println("O usuário se chama Matheus mas possui idade menor que 18");
        } else {
            System.out.println("O usuário não se chama Matheus e não tem idade maior ou igual a 18");
        }
    }
}
