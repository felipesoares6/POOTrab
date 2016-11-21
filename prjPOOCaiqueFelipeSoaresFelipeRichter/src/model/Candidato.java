package model;

/**
 *
 * @author felipesoares
 */
public class Candidato extends Pessoa {
    private String inscricao;
    private double media;
    private Prova[] provas;
    
    public Candidato(String cpf, String nome, String endereco, String inscricao) {
        super(cpf, nome, endereco);
        this.inscricao = inscricao;
        provas = new Prova[1];
    }

    public void calcularMedia() {
        double notas=0, pesos=0;
        
        for(int i=0, qtdProvas = provas.length; i < qtdProvas; i++){
             notas += provas[i].getPeso() * provas[i].getNota();
             pesos += provas[i].getPeso();
        }
        
        media = notas/pesos;
    }
    
    public double getMedia (){
        return media;
    }
    
   
}
