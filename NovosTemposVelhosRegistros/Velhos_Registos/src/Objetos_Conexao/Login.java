/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos_Conexao;

import Objetos_Entidades.Aluno;
import Objetos_Entidades.Coordenador;
import Objetos_Entidades.Professor;
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
public class Login {
    Connection con;
    ResultSet resultado;
    
    public Login(){
         con = new Conexao().Conectando();
    }
    public ArrayList<Aluno> loginAlunos(String login, String senha) throws SQLException{
        ArrayList<Aluno> listaLogin = new ArrayList();
        try {            
            PreparedStatement comand_prepar = con.prepareStatement("SELECT * FROM aluno WHERE cod_aluno = ? AND senha_aluno = ?;");
            comand_prepar.setString(1, login);
            comand_prepar.setString(2, senha);
            resultado = comand_prepar.executeQuery();
            
             while (resultado.next()) {                
                Aluno aluno = new Aluno(
                    resultado.getInt(1),resultado.getInt(2),
                    resultado.getString(3),resultado.getInt(4),
                    resultado.getString(5),resultado.getString(6)
                );
                listaLogin.add(aluno);
                for (int i = 0; i < listaLogin.size(); i++) {
                    System.out.println(" "+listaLogin.size());
                }
            }                      
        }
        catch (SQLException ex) {
            System.out.println("Problema com o login_alunos");
        }
        finally{
            con.close();
        }
        return listaLogin;
    }
    
     public ArrayList<Professor> loginProfessores(String login, String senha) throws SQLException{
        ArrayList<Professor> listaLogin = new ArrayList();
        try {            
            PreparedStatement comand_prepar = con.prepareStatement("SELECT * FROM professor WHERE cod_prof = ? AND senha_prof = ?;");
            comand_prepar.setString(1, login);
            comand_prepar.setString(2, senha);
            resultado = comand_prepar.executeQuery();
            
             while (resultado.next()) {                
                Professor prof = new Professor(
                    resultado.getInt(1),resultado.getInt(2),
                    resultado.getString(3),resultado.getString(4),
                    resultado.getInt(5)
                );
                listaLogin.add(prof);
                for (int i = 0; i < listaLogin.size(); i++) {
                    System.out.println(" "+listaLogin.size());
                }
            }                      
        }
        catch (SQLException ex) {
            System.out.println("Problema com o login_prof");
        }
        finally{
            con.close();
        }
        return listaLogin;
    }
      public ArrayList<Coordenador> loginCoordenadores(String login, String senha) throws SQLException{
        ArrayList<Coordenador> listaLogin = new ArrayList();
        try {            
            PreparedStatement comand_prepar = con.prepareStatement("SELECT * FROM coordenador WHERE cod_coordenador = ? AND senha_coord = ?;");
            comand_prepar.setString(1, login);
            comand_prepar.setString(2, senha);
            resultado = comand_prepar.executeQuery();
            
             while (resultado.next()) {                
                Coordenador coord = new Coordenador(
                    resultado.getString(1),resultado.getInt(2),
                    resultado.getInt(3),resultado.getInt(4)
                );
                listaLogin.add(coord);
                for (int i = 0; i < listaLogin.size(); i++) {
                    System.out.println(" "+listaLogin.size());
                }
            }                      
        }
        catch (SQLException ex) {
            System.out.println("Problema com o login_coordenador");
        }
        finally{
            con.close();
        }
        return listaLogin;
    }
}
