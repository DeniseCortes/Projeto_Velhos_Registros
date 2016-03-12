package velhos_registos;
import velhos_registos.Dvd;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ConexaoJDBC {

    public static void main(String[] args) throws SQLException {
        Scanner leia = new Scanner(System.in);
        Connection conexao;
        Statement confirmacao;
        ResultSet conjResult;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/novo","root","");
            confirmacao = conexao.createStatement();
            //confirmacao.executeUpdate("insert into dvd values(5,'matrix',156,1998,'acao')");
            conjResult = confirmacao.executeQuery("select * from aluno");
            ArrayList<Dvd> resultado = new ArrayList();
            
            while(conjResult.next()){
                Dvd d = new Dvd(conjResult.getInt(1),conjResult.getString(2),conjResult.getInt(3),conjResult.getInt(4),conjResult.getString(5));
                resultado.add(d);
                System.out.println(resultado.size()+"  "+conjResult.getString(2)+"  "+conjResult.getInt(4));
                
            
            }
            //conexao.commit();
            confirmacao.close();
            conexao.close();
        }catch(ClassNotFoundException e){
             System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        
    }
    
}