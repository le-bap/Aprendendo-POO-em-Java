package aula03;

// public: acesso a todos
// private: só quem pode mexer é a própria classe (por ex o atributo "tampada", que consegue ser usado nos métodos tampar e destampar mas não pode ser definida em Aula03)
// protected: é possível ser definida em Aula03, assim como o public

public class Caneta {
    // atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    // métodos
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO: a caneta esta tampada");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
