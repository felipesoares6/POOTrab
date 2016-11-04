package model;
/**
 * @author FelipeRichter, CaiqueMitsuoka
 */
public class Prova {
    private String materia;
    private int peso, qtdeQuestoes;
    private double nota;
    private Candidato candidato;
    private Concurso concurso;
    private Questao[] questoes;
    
    public Prova(String materia, int qtdeQuestoes) {
        this.materia = materia;
        this.qtdeQuestoes = qtdeQuestoes;
        this.questoes = new Questao[qtdeQuestoes];
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
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

    public int getQtdeQuestoes() {
        return qtdeQuestoes;
    }

    public double getNota() {
        return nota;
    }
    
    public void efetuarCorrecao(){
        for (int a = 0; a < qtdeQuestoes; a++){
            if (questoes[a].getAlternativaGabrito() == questoes[a].getResposta()){
                nota++;
            }
        }
    }

    public Concurso getConcurso() {
        return concurso;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }
    
    public void addQuestao(Questao questao){
        questoes[questao.getNumero() - 1] = questao;
    }
    
    public Questao[] getQuestoes(){
        return questoes;
    }
}
