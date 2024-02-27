package aula09;

public class Biblioteca {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Letizia", 19, "Feminino");
        Livro l1 = new Livro("Senhor dos aneis", "J R R Tolkien", 500, p1);

        
        l1.detalhes();
        l1.abrir();
        l1.avancarPag();
        l1.detalhes();
        l1.folhear(90);
        l1.fechar();
        l1.detalhes();
    }
}
