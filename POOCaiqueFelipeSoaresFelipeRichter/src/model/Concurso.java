package model;

import java.util.ArrayList;

/**
 * @author FelipeRichter
 */
public class Concurso {
    private String sigla, descricao, dtrealizacao;
    private double taxaInscricao;
    private ArrayList<Concurso> concursos;  
    
    public Concurso(String sigla, String descricao, String dtrealizacao) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.dtrealizacao = dtrealizacao;
        concursos = new ArrayList<Concurso>();
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
