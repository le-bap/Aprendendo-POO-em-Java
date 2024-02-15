package aula06_controle;

public class Aula6 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.play();
        c.menosVolume();
        c.abrirMenu();
        c.fecharMenu();
        c.pause();
        c.abrirMenu();
        c.fecharMenu();
        c.desligar();
        c.abrirMenu();
        c.fecharMenu();
        c.maisVolume();
    }
}
