package aula09;

public class Pessoa {
    // atributos
    private String nome;
    private int idade;
    private String genero;

    //metodo contrutor
    public Pessoa(String nome, int idade, String genero){
        this.setGenero(genero);
        this.setIdade(idade);
        this.setNome(nome);
    }

    // metodos publicos
    public void fazerNiver(){
        this.setIdade(this.getIdade() + 1);
    }

    // getters e setters
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
