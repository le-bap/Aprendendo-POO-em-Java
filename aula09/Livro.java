package aula09;

public class Livro implements Publicacao {
    // atributos
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // metodos abstratos
    public void detalhes(){
        System.out.println("Detalhes do livro:");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Paginas no total: " + this.getTotalPag());
        System.out.println("Pagina atual: " + this.getPagAtual());
        System.out.println("Esta aberto? " + this.getAberto());
        System.out.println("Leitor: " + this.getLeitor().getNome());
        System.out.println("");
    }

    // construtor
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor){
        this.setAberto(false);
        this.setAutor(autor);
        this.setLeitor(leitor);
        this.setTitulo(titulo);
        this.setPagAtual(0);
        this.setTotalPag(totalPag);
    }

    // getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag){
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    public boolean getAberto(){
        return aberto;
    }

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }


    // metodos da interface
    public void abrir() {
        this.setAberto(true);
    }

    public void fechar() {
        this.setAberto(false);
    }

    public void folhear(int p) {
        if (this.getAberto() && p < this.getTotalPag()){
            System.out.println("FOlheando...");
            this.setPagAtual(p);    
        }
        else{
            System.out.println("O livro esta fechado ou o numero escolhido excede o total de paginas");
        }
    }

    public void avancarPag() {
        if (this.getAberto()){
          this.setPagAtual(this.getPagAtual() + 1);  
        }
    }

    public void voltarPag() {
        if (this.getAberto()){
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
}
