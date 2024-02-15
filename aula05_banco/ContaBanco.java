package aula05_banco;

public class ContaBanco {
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // método construtor
    public ContaBanco(){ 
        this.setSaldo(0);
        this.setStatus(false);
    }

    // métodos getters e setters
    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int num){
        this.numConta = num;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }
        
    public void setSaldo(float sald){
        this.saldo = sald;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    // funções do banco
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);

        setStatus(true);
        if (tipo == "CC"){
            setSaldo(50);
        }
        else if (tipo == "CP"){
            setSaldo(150);
        }
        else{
            System.out.println("Tipo não válido.");
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Ainda há dinheiro na conta.");
        }
        else if (this.getSaldo() < 0){
            System.out.println("A conta está em débito.");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void mostrarConta(){
        System.out.println("Nome: " + this.getDono());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("");
    }

    public void depositar(float valor){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso, " + this.getDono());
        }
        else{
            System.out.println("Não é possível depositar pois a conta não foi aberta.");
        }
    }

    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso, " + this.getDono());
            }
            else{
                System.out.println("Saldo insuficiente.");
            }
        }
        else{
            System.out.println("Não é possível sacar dinheiro pois a conta não foi aberta.");
        }
    }

    public void pagarMensal(){
        int val = 0;
        
        if (this.getTipo() == "CC"){
            val = 12;
        }
        else if (this.getTipo() == "CP"){
            val = 20;
        }

        if (getStatus()){
            this.setSaldo(this.getSaldo() - val);
            System.out.println("Mensalidade paga com sucesso, " + this.getDono());
        }
        else{
            System.out.println("Não é possível pagar a mensalidade pois a conta não foi aberta.");
        }

    }
}
