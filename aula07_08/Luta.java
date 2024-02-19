package aula07_08;

import java.util.Random;

public class Luta {
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;

    // metodos publicos
    public void marcarLuta(Lutador desafiante, Lutador desafiado){
        if (desafiante.getCategoria() == desafiado.getCategoria() && desafiante != desafiado){
            this.setAprovada(true);
            this.setDesafiante(desafiante);
            this.setDesafiado(desafiado);
        }
        else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }

    public void lutar(){
        if (this.getAprovada()){
            System.out.println("DESAFIANTE");
            this.getDesafiante().apresentar();
            System.out.println("DESAFIADO");
            this.getDesafiado().apresentar();
            
            Random random = new Random();
            int vencedor = random.nextInt(3); // 0, 1 ou 2

            switch (vencedor) {
                case 0:
                    System.out.println("");
                    System.out.println("Resultado da luta:");
                    System.out.println("EMPATEE");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
            
                case 1:
                    System.out.println("");
                    System.out.println("Resultado da luta:");
                    System.out.println(this.getDesafiado().getNome() + " VENCEUU!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Resultado da luta:");
                    System.out.println(this.getDesafiante().getNome() + " VENCEUU!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }
        else{
            System.out.println("Luta nao pode acontecer");
        }
    }

    // getters e setters
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

    public boolean getAprovada(){
        return aprovada;
    }
}
