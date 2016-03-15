package velhos_registos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Listar_Alunos {
    Connection con;
    Statement comando;
    ResultSet resultado;
    
    public Listar_Alunos(){
        con = new Conexao().Conectando();
        try {
            comando = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Problema no SQL, Burro !");
        }
    }
    public ArrayList<Aluno> listarAlunos(){
        ArrayList<Aluno> listaAlunos = new ArrayList();
        try {            
            resultado = comando.executeQuery("select * from aluno");
             while (resultado.next()) {                
                Aluno aluno = new Aluno(
                    resultado.getInt(1),resultado.getString(2),
                    resultado.getString(3),resultado.getInt(4),
                    resultado.getString(5),resultado.getString(6)
                );
                listaAlunos.add(aluno);
            }           
            
        } catch (SQLException ex) {
            System.out.println("Problema com SQL");
        }
        return listaAlunos;
    }
    public static void main(String[] Args){
        Listar_Alunos lista = new Listar_Alunos();
        lista.listarAlunos();
        System.out.println(lista.toString());
    
    }
}