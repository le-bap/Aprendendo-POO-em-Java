package aula07_08;

public class Lutador {
    public static Object status;
    // atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // getters end setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(){
        if (this.getPeso() < 52.2){
            this.categoria = "Invalido";
        }

        else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }

        else if (this.getPeso() <= 83.9){
            this.categoria = "Medio";
        }

        else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }
    
    // método construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }

    // métodos publicos
    public void apresentar(){
        System.out.println("");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println(this.idade + " anos");
        System.out.println(this.altura + "m de altura");
        System.out.println(this.peso + "kg");
        System.out.println("Vitorias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
        System.out.println("");
    }

    public void status(){
        System.out.println(this.getNome() + " faz parte da categoria " + this.getCategoria() + " e tem " + this.getVitorias() + " vitorias, " 
        + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
