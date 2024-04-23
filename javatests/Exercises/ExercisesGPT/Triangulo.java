package javatests.Exercises.ExercisesGPT;

public class Triangulo {
    // Exercício 37
    private int ladoDireito;
    private int ladoEsquerdo;
    private int ladoBase;
    private int altura;
    private boolean isValid;

    public Triangulo(int ladoDireito, int ladoEsquerdo, int ladoBase, int altura, boolean isValid) {
        this.ladoDireito = ladoDireito;
        this.ladoEsquerdo = ladoEsquerdo;
        this.ladoBase = ladoBase;
        this.altura = altura;
        this.isValid = isValid;
    }

    // Exercício 38
    public void isValido() {
        if (isValid) {
            System.out.println("É válido o triangulo");
        } else {
            System.out.println("Não é válido o triangulo");
        }
    }

    // Exercício 39
    public void calcularArea() {
        System.out.println("Área do triangulo: " + (this.getLadoBase() * altura) / 2);
    }

    public void calcularPerimetro() {
        System.out.println("Perímetro do triangulo: " + (this.getLadoDireito() + this.getLadoEsquerdo() + this.getLadoBase()));
    }

    // Métodos especiais - get e set


    public int getLadoDireito() {
        return ladoDireito;
    }

    public void setLadoDireito(int ladoDireito) {
        this.ladoDireito = ladoDireito;
    }

    public int getLadoEsquerdo() {
        return ladoEsquerdo;
    }

    public void setLadoEsquerdo(int ladoEsquerdo) {
        this.ladoEsquerdo = ladoEsquerdo;
    }

    public int getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(int ladoBase) {
        this.ladoBase = ladoBase;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
