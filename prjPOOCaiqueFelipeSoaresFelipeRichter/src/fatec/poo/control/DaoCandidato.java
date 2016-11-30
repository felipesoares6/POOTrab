package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Candidato;

/**
 *
 * @author felipesoares
 */
public class DaoCandidato {
    private Connection conn;
    
    public DaoCandidato(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Candidato candidato) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbFiscal(cpf, nome, endereco, telefone, email, inscricao, media) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, candidato.getCpf());
            ps.setString(2, candidato.getNome());
            ps.setString(3, candidato.getEndereco());
            ps.setString(4, candidato.getTelefone());
            ps.setString(5, candidato.getEmail());
            ps.setString(6, candidato.getInscricao());
            ps.setDouble(7, candidato.getMedia());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Candidato candidato) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbFiscal set cpf = ?, nome = ?, endereco = ?, telefone = ?, email = ?, media = ? " +
                                                 "where inscricao = ?");
            
            ps.setString(1, candidato.getCpf());
            ps.setString(2, candidato.getNome());
            ps.setString(3, candidato.getEndereco());
            ps.setString(4, candidato.getTelefone());
            ps.setString(5, candidato.getEmail());
            ps.setDouble(6, candidato.getMedia());
            ps.setString(7, candidato.getInscricao());            
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Candidato consultar (String inscricao) {
        Candidato c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbCandidato where " +
                                                 "inscricao = ?");
            
            ps.setString(1, inscricao);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                c = new Candidato (rs.getString("cpf"), rs.getString("nome"), rs.getString("endereco"), inscricao);
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));                
                c.setMedia(rs.getDouble("media"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }    
     
     public void excluir(Candidato candidato) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbCandidato where inscricao = ?");
            
            ps.setString(1, candidato.getInscricao());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
