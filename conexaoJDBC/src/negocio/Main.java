package negocio;

import conexao.ClienteBanco;
import conexao.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author Baesse
 */
public class Main {
    
    
    public static void main(String [] args){
        //ClienteBanco clienteBanco = new ClienteBanco();
        //System.out.println(clienteBanco.listarClientes().size());        
        
        Connection con  = new ConnectionFactory().createConnection();
        System.out.println(con);
    }            
}
