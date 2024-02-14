package aula04;

public class Aula04 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("Preta", "BIC", 0.7f);

        // c1.setModelo("BIC");
        // c1.setPonta(0.5f);

        c1.status();

        // ao inves de status():

        // System.out.println("Modelo: " + c1.getModelo());
        // System.out.println("Ponta: " + c1.getPonta());
    }
}
