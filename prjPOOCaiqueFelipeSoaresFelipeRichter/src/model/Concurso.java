package model;

import java.util.ArrayList;

/**
 * @author FelipeRichter
 */
public class Concurso {
    private String sigla, descricao, dtrealizacao;
    private double taxaInscricao;
    private ArrayList<Prova> provas;
    private ArrayList<Pessoa> pessoas;

    public ArrayList<Prova> getProvas() {
        return provas;
    }

    public void setProvas(ArrayList<Prova> provas) {
        this.provas = provas;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    public void addPessoa(Pessoa p){
        this.pessoas.add(p);
    }
    
    public void addProva(Prova p){
        provas.add(p);
        p.setConcurso(this);
    }
    
    public Concurso(String sigla, String descricao, String dtrealizacao) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.dtrealizacao = dtrealizacao;
    }
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDtrealizacao() {
        return dtrealizacao;
    }

    public void setDtrealizacao(String dtrealizacao) {
        this.dtrealizacao = dtrealizacao;
    }

    public double getTaxaInscricao() {
        return taxaInscricao;
    }

    public void setTaxaInscricao(double taxaInscricao) {
        this.taxaInscricao = taxaInscricao;
    }
    
    
}
