/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos_Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rodolfo
 */
public class Remover {
     Connection con;    
    public Remover(){
     con = new Conexao().Conectando();
    }
    public void Remover_Aluno(int cod_aluno) throws SQLException{
        PreparedStatement comand_prepar = con.prepareStatement("DELETE FROM aluno WHERE cod_aluno = ?;");
        comand_prepar.setString(1, Integer.toString(cod_aluno));
        comand_prepar.execute();
    }
    public void Remover_Professor(int cod_prof) throws SQLException{
        PreparedStatement comand_prepar = con.prepareStatement("DELETE FROM professor WHERE cod_prof = ?;");
        comand_prepar.setString(1, Integer.toString(cod_prof));
        comand_prepar.execute();
    }
    public void Remover_Coordenador(int cod_coordenador) throws SQLException{
        PreparedStatement comand_prepar = con.prepareStatement("DELETE FROM coordenador WHERE cod_coordenador = ?;");
        comand_prepar.setString(1,Integer.toString(cod_coordenador));
        comand_prepar.execute();
    }
    public void Remover_Turma(int cod_turma) throws SQLException{
        PreparedStatement comand_prepar = con.prepareStatement("DELETE FROM turma WHERE cod_turma = ?;");
        comand_prepar.setString(1, Integer.toString(cod_turma));
        comand_prepar.execute();
    
    }
}
