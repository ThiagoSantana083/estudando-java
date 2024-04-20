package javatests.Exercises.ExercisesGPT;

public class Veiculo {
    // Exercício 32

    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    // Exercício 33
    public void detalhes() {
        System.out.println("Marca do veículo: " + this.getMarca());
        System.out.println("Modelo do veículo: " + this.getModelo());
        System.out.println("Ano do veículo: " + this.getAno());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
