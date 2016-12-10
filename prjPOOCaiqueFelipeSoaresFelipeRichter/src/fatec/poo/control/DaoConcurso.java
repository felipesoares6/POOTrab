/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Concurso;

/**
 *
 * @author oraclexe
 */
public class DaoConcurso {
     
    private Connection conn;
    
    public DaoConcurso(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir (Concurso concurso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbConcurso(sigla, descricao, data, taxa_inscricao) VALUES(?,?,?,?)");
            ps.setString(1, concurso.getSigla());
            ps.setString(2, concurso.getDescricao());
            ps.setString(3, concurso.getDtrealizacao());
            ps.setString(4, String.valueOf(concurso.getTaxaInscricao()));
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Concurso concurso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbConcurso DESCRICAO = ?, DATA = ?, TAXA_INSCRICAO = ?" +
                                                 "where SIGLA = ?");
            
            ps.setString(1, concurso.getDescricao());
            ps.setString(2, concurso.getDtrealizacao());
            ps.setString(3, String.valueOf(concurso.getTaxaInscricao()));
            ps.setString(4, concurso.getSigla());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public Concurso consultar (String sigla) {
       Concurso c = null;

       PreparedStatement ps = null;
       try {
           ps = conn.prepareStatement("SELECT * from tbConcurso where " +
                                                "sigla = ?");

           ps.setString(1, sigla);
           ResultSet rs = ps.executeQuery();

           if (rs.next() == true) {
               c = new Concurso(rs.getString("sigla"), rs.getString("descricao"), rs.getString("data"));
               c.setTaxaInscricao(Double.parseDouble(rs.getString("taxa_inscricao")));
           }
       }
       catch (SQLException ex) { 
            System.out.println(ex.toString());   
       }
       return (c);
    }    
     
    public void excluir(Concurso concurso) {
       PreparedStatement ps = null;
       try {
           ps = conn.prepareStatement("DELETE FROM tbConcurso where sigla = ?");

           ps.setString(1, concurso.getSigla());

           ps.execute();
       } catch (SQLException ex) {
            System.out.println(ex.toString());   
       }
    }
}
