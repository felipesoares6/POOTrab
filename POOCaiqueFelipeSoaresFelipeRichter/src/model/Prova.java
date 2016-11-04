package model;
/**
 * @author FelipeRichter
 */
public class Prova {
    private String materia;
    private int peso, qtdequestoes;
    private double nota;
    private Concurso concurso;
    private 
    
    public Prova(String materia, int qtdequestoes) {
        this.materia = materia;
        this.qtdequestoes = qtdequestoes;
        //A multiplicidade 1..* com Questão deve ser implementada utilizando uma matriz de 
        //objetos cuja a quantidade de elementos deve ser definida a partir do atributo qtdeQuestoes.
        //O método efetuarCorrecao calcula a nota obtida na prova a partir da somatória das questões
        //corretas.
    }

    
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getQtdequestoes() {
        return qtdequestoes;
    }

    public void setQtdequestoes(int qtdequestoes) {
        this.qtdequestoes = qtdequestoes;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void efetuarCorrecao(){
        
    }

    public Concurso getConcurso() {
        return concurso;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }
    
}
