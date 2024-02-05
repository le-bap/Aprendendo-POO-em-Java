package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 30;

        c1.status();
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "fei";
        c2.cor = "preta";
        c2.ponta = 0.8f;
        c2.tampada = true;
        c2.carga = 90;

        c2.status();
        c2.destampar();
        c2.rabiscar();
        c2.tampar();
        c2.status();
    }
}
