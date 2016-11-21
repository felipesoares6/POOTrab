/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author caiquemitsuoka
 */
public class Questao {
    private int numero;
    private String enunciado, alternativa_A, alternativa_B, alternativa_C
            , alternativa_D;
    private char resposta, alternativaGabrito;
    
    public Questao(int numero){
        this.numero = numero;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setAlternativa_A(String alternativa_A) {
        this.alternativa_A = alternativa_A;
    }

    public void setAlternativa_B(String alternativa_B) {
        this.alternativa_B = alternativa_B;
    }

    public void setAlternativa_C(String alternativa_C) {
        this.alternativa_C = alternativa_C;
    }

    public void setAlternativa_D(String alternativa_D) {
        this.alternativa_D = alternativa_D;
    }

    public void setResposta(char resposta) {
        this.resposta = resposta;
    }

    public char getResposta() {
        return resposta;
    }
    
    public void setAlternativaGabrito(char alternativaGabrito) {
        this.alternativaGabrito = alternativaGabrito;
    }

    public char getAlternativaGabrito() {
        return alternativaGabrito;
    }
    
    public int getNumero(){
        return numero;
    }
    
}
