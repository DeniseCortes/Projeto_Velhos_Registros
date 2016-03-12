package velhos_registos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {
    
    private Connection con;
    
    public Connection Conectando(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/novo","root","");
            
        }
        catch(SQLException e){
            e.getMessage();
        }
        catch(ClassNotFoundException e){
            e.getMessage();
        }
        return con;
        
    }
    public void Desconectando(){
        try{
            con.close();
        }
        catch(SQLException e){
            e.getMessage();
        }
    
    }
}
