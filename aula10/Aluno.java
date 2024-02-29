public class Aluno extends Pessoa { //a classe Aluno é "filha" da classe Pessoa 
    
    private int matricula;
    private String curso;

    public void cancelarMat(){
        System.out.println("Matricula cancelada.");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
