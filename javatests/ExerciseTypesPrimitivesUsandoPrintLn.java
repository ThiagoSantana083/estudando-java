package javatests;
/*
 * Eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salário de <salario>, na data <data>
 *
 * */
public class ExerciseTypesPrimitivesUsandoPrintLn {
    public static void main(String[] args) {
        String nome = "Daniel Santana";
        String endereco = "Rua Comerciante Terezia Maria Alves";
        float salario = 1500;
        String data = "20/02/2024";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ",\n" + "confirmo que recebi o " +
                "salário " +
                "de " + salario + ", na data " + data);
    }
}
