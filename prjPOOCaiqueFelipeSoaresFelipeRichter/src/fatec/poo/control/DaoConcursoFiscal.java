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
import java.util.ArrayList;
import model.Concurso;
import model.Fiscal;

/**
 *
 * @author oraclexe
 */
public class DaoConcursoFiscal {
    
    private Connection conn;
     
    public DaoConcursoFiscal(Connection conn) {
        this.conn = conn;
    }
      
    public void inserir(Concurso concurso, String cpfFiscal) {
       PreparedStatement ps = null;
       try {
           ps = conn.prepareStatement("INSERT INTO TBCONCURSO_FISCAL(id, fiscal, sigla) VALUES(?,?,?)");
           ps.setString(1, String.valueOf(proximo_id()));
           ps.setString(2, cpfFiscal);
           ps.setString(3, concurso.getSigla());

           ps.execute();
       } catch (SQLException ex) {
            System.out.println(ex.toString());   
       }
    }
    
    public int proximo_id () {
      int sigla = -1;
      PreparedStatement ps = null;
       try {
           ps = conn.prepareStatement("SELECT MAX(id) as id from tbConcurso_fiscal;");
           ResultSet rs = ps.executeQuery();

           if (rs.next() == true) {
               sigla = Integer.parseInt(rs.getString("id"));
               sigla++;
           }
       }
       catch (SQLException ex) { 
           System.out.println(ex.toString());   
       }
       return (sigla);
    }
    
    public void excluir(String sigla, String cpf) {
       PreparedStatement ps = null;
       try {
           ps = conn.prepareStatement("DELETE FROM tbConcurso_fiscal where sigla = ? and cpf = ?;");

           ps.setString(1, sigla);
           ps.setString(1, cpf);

           ps.execute();
       } catch (SQLException ex) {
            System.out.println(ex.toString());   
       }
    }
    
    public ArrayList<Fiscal> consultar (String sigla) {
        ArrayList<Fiscal> f = new ArrayList();

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbConcurso_fiscal where " +
                                       "sigla = ?");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            DaoFiscal daoFiscal = new DaoFiscal(this.conn);
            while (rs.next()) {
                f.add(daoFiscal.consultar(rs.getString("cpf")));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (f);
    }
}
