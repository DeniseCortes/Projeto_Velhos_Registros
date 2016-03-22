package velho_registros_base_dvd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import velhos_registos.Aluno;
import velhos_registos.Conexao;

public class Listar_Alunos {
    Connection con;
    Statement comando;
    ResultSet resultado;
    
    public Listar_Alunos(){
        con = new Conexao().Conectando();
        try {
            comando = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Problema na conexão!");
        }
    }
    public ArrayList<Aluno> listarAlunos(String consulta) throws SQLException{
        ArrayList<Aluno> listaAlunos = new ArrayList();
        try {            
            PreparedStatement comand_prepar = con.prepareStatement("select * from aluno where cod_aluno like ?");
            comand_prepar.setString(1, consulta);
            resultado = comand_prepar.executeQuery();
             while (resultado.next()) {                
                Aluno aluno = new Aluno(
                    resultado.getInt(1),resultado.getInt(2),
                    resultado.getString(3),resultado.getInt(4),
                    resultado.getString(5),resultado.getString(6)
                );
                listaAlunos.add(aluno);
            }                      
        }
        catch (SQLException ex) {
            System.out.println("Problema com o listar_alunos");
        }
        finally{
            con.close();
        }
        return listaAlunos;
    }
}