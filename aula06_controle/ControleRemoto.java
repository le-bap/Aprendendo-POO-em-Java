package aula06_controle;

public class ControleRemoto implements Controlador{ // definira o funcionamento interno do controlador
    
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // metodo construtor
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    // getters e setters
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    private boolean getLigado(){
        return ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getVolume() {
        return volume;
    }

    // metodos abstratos
    public void ligar(){
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
    }

    public void abrirMenu(){
        System.out.println("");
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());

        for (int i = 0; i<this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("");
    }

    public void fecharMenu(){
        System.out.println("Fechando Menu...");   
    }

    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("Nao eh possivel aumentar volume pois o aparelho esta desligado");
        }
    }

    public void menosVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println("Nao eh possivel diminuir volume pois o aparelho esta desligado");
        }
    }

    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(50);
        }
    }

    public void play(){
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    public void pause(){
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
