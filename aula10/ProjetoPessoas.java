public class ProjetoPessoas {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setSexo("Nao binaria");
        p4.setIdade(18);

        p2.setCurso("T.I.");
        p3.setSalario(2500.00f);
        p4.setSetor("Estoque");

        p3.setEspecialidade("Java");
        p4.setTrabalhando(true);
        p2.fazerAniver();

        // nâo se pode usar medotos exclusivos de uma classe em uma outra
        // todas so tem em comum os metodos da classe Pessoa

        p1.dados();
        p2.dados();
        p3.dados();
        p4.dados();

    }
}
