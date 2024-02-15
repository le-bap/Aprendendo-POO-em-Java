package aula06_controle;

public interface Controlador { // interface que irá interagir com o usuário
    // ações que podem ser feitas
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void pause();
    public abstract void play();
}
