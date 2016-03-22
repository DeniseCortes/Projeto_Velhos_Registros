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

/**
 *
 * @author rodolfo
 */
public class Cadastro {
    Connection con;
    Statement comando;
    ResultSet resultado;
    
    public Cadastro(){
        con = new Conexao().Conectando();
        try {
            comando = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Problema na conexão!");
        }
    }
    public void Cadastrar_Aluno(int cod_aluno, int senha, String nome, int num_faltas, String atestado, String fixa_med ) throws SQLException{
            Aluno aluno = new Aluno(cod_aluno,
                senha,
                nome,
                num_faltas,
                atestado,
                fixa_med
        );
            PreparedStatement comand_prepar = con.prepareStatement("INSERT INTO aluno VALUES(?,?,?,?,?,?);");
            comand_prepar.setString(1,Integer.toString(aluno.getCod_aluno()));
            comand_prepar.setString(2,Integer.toString(aluno.getSenha()));
            comand_prepar.setString(3,aluno.getNome());
            comand_prepar.setString(4,Integer.toString(aluno.getNum_faltas()));
            comand_prepar.setString(5,aluno.getAtestas_medico());
            comand_prepar.setString(6,aluno.getFixa_medica());
            comand_prepar.execute();
            con.close();
        }
} 