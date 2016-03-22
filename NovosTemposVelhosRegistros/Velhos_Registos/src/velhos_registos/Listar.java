/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velhos_registos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author rodolfo
 */
public class Listar {
    Connection con;
    Statement comando;
    ResultSet resultado;
    
    public Listar(){
        con = new Conexao().Conectando();
        try {
            comando = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Problema na conexão!");
        }
    }
    public ArrayList<Aluno> listarAlunos(String login) throws SQLException{
        ArrayList<Aluno> listaAlunos = new ArrayList();
        try {            
            PreparedStatement comand_prepar = con.prepareStatement("SELECT * FROM aluno WHERE cod_aluno LIKE ? ;");
            comand_prepar.setString(1, login);
            
            resultado = comand_prepar.executeQuery();
            
             while (resultado.next()) {                
                Aluno aluno = new Aluno(
                    resultado.getInt(1),resultado.getInt(2),
                    resultado.getString(3),resultado.getInt(4),
                    resultado.getString(5),resultado.getString(6)
                );
                listaAlunos.add(aluno);
                for (int i = 0; i < listaAlunos.size(); i++) {
                    System.out.println(listaAlunos.get(i).getNome()+listaAlunos.get(i).getAtestas_medico());
                }
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
    public ArrayList<Professor> listarProf(String consulta) throws SQLException{
        ArrayList<Professor> listaProf = new ArrayList();
        try {            
            PreparedStatement comand_prepar = con.prepareStatement("select * from professor where cod_prof like ?");
            comand_prepar.setString(1, consulta);
            resultado = comand_prepar.executeQuery();
            
             while (resultado.next()) {                
                Professor prof = new Professor(
                    resultado.getInt(1),resultado.getInt(2),
                    resultado.getString(3),resultado.getString(4),
                    resultado.getInt(5)
                );
                listaProf.add(prof);
                for (int i = 0; i < listaProf.size(); i++) {
                    System.out.println(listaProf.get(i));
                }
            }                      
        }
        catch (SQLException ex) {
            System.out.println("Problema com o listar_alunos");
        }
        finally{
            con.close();
        }
        return listaProf;
    }
    
    
    
}
