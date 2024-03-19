package javatests.POO.Classes;

public enum PeriodoFaculdadeEnum {

    // Cada atributo de Enum é imutável, ou seja, não muda

    // cada um desses atributos é uma instância única do objeto do tipo ENUM

    // Então quando criamos um enum vai haver uma lista de opções de atributos que vc vai escolher quando for usar,
    // e na escolha desse atributo o valor do enum vai ser passado no momento em que criamos ele. Assim vai usar
    // apenas uma das opções que colocamos
    MANHA("Manhã"),
    TARDE("Tarde"),
    NOITE("Noite");

    private String periodo;
    PeriodoFaculdadeEnum(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }
}
