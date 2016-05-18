package Objetos_Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    Connection con;
    
    public Connection Conectando(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ultimo_bd","root","");
            
        }
        catch(SQLException e){
            System.out.print("erro no SQL da conexão");
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
