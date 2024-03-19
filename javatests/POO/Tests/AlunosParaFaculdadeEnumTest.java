package javatests.POO.Tests;

import javatests.POO.Classes.AlunoFaculdadeUsandoEnum;
import javatests.POO.Classes.PeriodoFaculdadeEnum;

public class AlunosParaFaculdadeEnumTest {
    public static void main(String[] args) {
        // instância do objeto

        AlunoFaculdadeUsandoEnum aluno1 = new AlunoFaculdadeUsandoEnum("Thiago", 18, PeriodoFaculdadeEnum.MANHA);
        System.out.println(aluno1);
        System.out.println("Período da faculdade desse aluno: " + " " + aluno1.getPeriodoDaFaculdade().getPeriodo());
    }
}
