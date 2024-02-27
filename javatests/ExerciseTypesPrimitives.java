package javatests;

/*
* Eu <nome>, morando no endereço <endereço>,
* confirmo que recebi o salário de <salario>, na data <data>
*
* */

public class ExerciseTypesPrimitives {
    public static void main(String[] args) {
        String nome = "Thiago Santana";
        String endereco = "Rua Comerciante Terezinha Maria Alves";
        float salario = 2500;
        String data = "21/01/2023";

        System.out.printf("Eu %s, morando no endereço %s,%nconfirmo que recebi o salário de %f, na data %s",nome,
                endereco, salario, data);
    }
}
