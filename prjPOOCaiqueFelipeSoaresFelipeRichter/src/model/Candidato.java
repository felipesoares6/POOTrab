package model;

import java.util.ArrayList;

/**
 *
 * @author felipesoares
 */
public class Candidato extends Pessoa {
    private String inscricao;
    private double media;
    private ArrayList<Prova> provas;
    
    public Candidato(String cpf, String nome, String endereco, String inscricao) {
        super(cpf, nome, endereco);
        this.inscricao = inscricao;
        provas = new ArrayList<Prova>();
    }

    public void calcularMedia() {
        double notas=0, pesos=0;
        
        for(Prova p: provas){
             notas += p.getPeso() * p.getNota();
             pesos += p.getPeso();
        }
        
        media = notas/pesos;
    }
    
    public double getMedia (){
        return media;
    }
    
    public String getInscricao() {
        return inscricao;
    }
    
    public void setMedia (double media) {
        this.media = media;
    }
    
    public ArrayList<Prova> getProvas () {
        return provas;
    }
    
   
}
