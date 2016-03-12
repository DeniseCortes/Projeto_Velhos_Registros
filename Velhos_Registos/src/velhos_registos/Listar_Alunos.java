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
                //Cliente cliente = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                Aluno aluno = new Aluno();
                aluno.setCod_aluno(resultado.getInt("Codigo_aluno"));
                aluno.setNome(resultado.getString("Nome"));
                aluno.setCpf(resultado.getString("CPF"));
                aluno.setNum_faltas(resultado.getInt("Num_faltas"));
                aluno.setAtestas_medico(resultado.getString("Atestado"));
                aluno.setFixa_medica(resultado.getString("fixa_medica"));                
            }           
            
        } catch (SQLException ex) {
            System.out.println("Problema com SQL");
        }
        
        return listaAlunos;
    
    }
}
