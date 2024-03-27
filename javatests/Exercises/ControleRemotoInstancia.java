package javatests.Exercises;

public class ControleRemotoInstancia {
    public static void main(String[] args) {
        // Instâncias de controle remoto
        ControleRemoto controle01 = new ControleRemoto();
        // Tentando aumentar e desligar sem estar ligado
        controle01.aumentarVolume();
        controle01.diminuirVolume();
        // Tentando abrir menu sem estar ligado
        controle01.abrirMenu();
        // Agora ligando
        controle01.ligar();
        // Aumentando volume e diminuindo após ter ligado
        controle01.aumentarVolume(); // Aumentou para 51
        controle01.aumentarVolume(); // Aumentou para 52
        controle01.diminuirVolume(); // Diminuiu para 51
        // Dando play para tocar
        controle01.play();
        // Abrindo e fechando menu
        controle01.abrirMenu();
        controle01.fecharMenu();
    }
}
