package model;

/**
 *
 * @author felipesoares
 */
public class Pessoa {
    private String cpf, nome, endereco, telefone, email;
    private Concurso concurso;
    
    public Pessoa (String cpf, String nome, String endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }
    
    public Concurso getConcurso(){
        return concurso;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
