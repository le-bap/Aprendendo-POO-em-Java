public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver(){
        this.idade ++;
    }

    public void dados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: "+ this.sexo);
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
