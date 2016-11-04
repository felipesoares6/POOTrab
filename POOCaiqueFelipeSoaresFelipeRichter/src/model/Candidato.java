package model;

/**
 *
 * @author felipesoares
 */
public class Candidato extends Pessoa {
    private String inscricao;
    private double media;
    private Prova[] provas;
    private Concurso concurso;
    
    public Candidato(String cpf, String nome, String endereco, String inscricao) {
        super(cpf, nome, endereco);
        this.inscricao = inscricao;
        provas = new Prova[3];
    }

    public Concurso getConcurso() {
        return concurso;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }
    
    public void calcularMedia() {
        double notas=0, pesos=0;
        
        for(int i=0, qtdProvas = provas.length; i < qtdProvas; i++){
             notas += provas[i].peso * provas[i].nota;
             pesos += provas[i].peso;
        }
        
        media = notas/pesos;
    }
    
    public double getMedia (){
        return media;
    }
    
   
}
