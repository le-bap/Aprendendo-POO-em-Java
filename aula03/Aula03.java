package aula03;
// objetivo da aula: configurar visibilidade de atributos e métodos (publico, privado ou protegido)
public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "bic";
        c1.cor = "vermelha";
        // c1.ponta = 0.5f; não pode acontecer uma vez que "ponta" esta privado
        c1.carga = 90; //é possível usar esse aatributo pq a classe Caneta esta sendo usada na Aula03
        // c1.tampada = true; privado

        c1.status();
       
    }
}
