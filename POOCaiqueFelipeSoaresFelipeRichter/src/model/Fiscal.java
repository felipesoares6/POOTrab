package model;

/**
 *
 * @author felipesoares
 */
public class Fiscal extends Pessoa {
    private String codigo;
    private String local;
    
    public Fiscal(String cpf, String nome, String endereco, String codigo) {
        super(cpf, nome, endereco);
        this.codigo = codigo;
    }
    
    public void setLocal(String local){
        this.local = local;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLocal() {
        return local;
    }   
    
}
