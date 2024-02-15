package aula05_banco;

// Pratica de tudo que foi aprendido nas aulas anteriores
public class Banco {
    public static void main(String[] args) {
        
        // criando a primeira conta
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(1);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        // criando a segunda conta
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        // ações realizadas pelos clientes

        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(100);

        p1.fecharConta();

        p1.mostrarConta();
        p2.mostrarConta();

    }

}
