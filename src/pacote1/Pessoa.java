package pacote1;

public class Pessoa {
    public static int contador = 1;
    
    private String nome, cpf, email, tipo;
    private int NumerodeConta;
    private Boolean status;
    
    public Pessoa(){
        this.status = true;
    }
   
    public Pessoa(String nome, String cpf, String email, String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tipo = tipo;
        contador += 1;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String toString() {
        return "\n Nome: + this.getNome()" +
                "\nCPF: + this.getCpf()" + 
                "\nEmail: + this.getEmail()";
    }
}
