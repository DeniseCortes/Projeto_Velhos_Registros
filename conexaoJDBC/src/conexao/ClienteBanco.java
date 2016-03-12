package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;

/**
 *
 * @author Baesse
 */
public class ClienteBanco {
    
    Connection con;
    Statement comando;
    ResultSet resultado;
    
    public ClienteBanco(){        
        con = new ConnectionFactory().createConnection();
        try {
            comando = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Problema no SQL");
        }
    }
    
    public ArrayList<Cliente> listarClientes(){
        ArrayList<Cliente> listaCliente = new ArrayList();
        
        try {            
                       
            resultado = comando.executeQuery("select * from cliente");
            
             while (resultado.next()) {                
                //Cliente cliente = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                Cliente cliente = new Cliente();
                cliente.setEndereco(resultado.getString("endereco"));
                cliente.setFone(resultado.getInt("fone"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setcCodigo(resultado.getInt("cCodigo"));
                listaCliente.add(cliente);                
            }           
            
        } catch (SQLException ex) {
            System.out.println("Problema com SQL");
        }
        
        return listaCliente;
    }
    
}
