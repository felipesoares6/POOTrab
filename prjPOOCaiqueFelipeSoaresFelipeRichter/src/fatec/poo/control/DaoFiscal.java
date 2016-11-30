package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Fiscal;

/**
 *
 * @author felipesoares
 */
public class DaoFiscal {
    
    private Connection conn;
    
    public DaoFiscal(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbFiscal(cpf, nome, endereco, telefone, email, codigo, local) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, fiscal.getCpf());
            ps.setString(2, fiscal.getNome());
            ps.setString(3, fiscal.getEndereco());
            ps.setString(4, fiscal.getTelefone());
            ps.setString(5, fiscal.getEmail());
            ps.setString(6, fiscal.getCodigo());
            ps.setString(7, fiscal.getLocal());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbFiscal set cpf = ?, nome = ?, endereco = ?, telefone = ?, email = ? , local = ? " +
                                                 "where codigo = ?");
            
            ps.setString(1, fiscal.getCpf());
            ps.setString(2, fiscal.getNome());
            ps.setString(3, fiscal.getEndereco());
            ps.setString(4, fiscal.getTelefone());
            ps.setString(5, fiscal.getEmail());
            ps.setString(6, fiscal.getLocal());
            ps.setString(7, fiscal.getCodigo());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Fiscal consultar (String codigo) {
        Fiscal f = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbFiscal where " +
                                                 "codigo = ?");
            
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                f = new Fiscal (rs.getString("cpf"), rs.getString("nome"), rs.getString("endereco"), codigo);
                f.setEmail(rs.getString("email"));
                f.setTelefone(rs.getString("telefone"));
                f.setLocal(rs.getString("local"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (f);
    }    
     
     public void excluir(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbFiscal where codigo = ?");
            
            ps.setString(1, fiscal.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
