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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rodolfo
 */
public class Atualizar {
    Connection con;    
    public Atualizar(){
        con = new Conexao().Conectando();
    }    
    
    public void Atualizar_Aluno(int login, int nova_senha, String nome, String atestas_medico, String ficha_medica) throws SQLException{
        PreparedStatement comand_prepar = con.prepareStatement("UPDATE aluno SET senha_aluno = ?, nome = ?, atestas_medico = ?, ficha_medica = ? WHERE cod_aluno = ?;");
        comand_prepar.setString(1,Integer.toString(nova_senha));
        comand_prepar.setString(2,nome);
        comand_prepar.setString(3, atestas_medico);
        comand_prepar.setString(4, ficha_medica);
        comand_prepar.setString(5, Integer.toString(login));
        
        comand_prepar.executeUpdate();
        con.close();
    }
    
    public void Atualizar_Professor(int login, int senha, String nome, String ativ_ministrada) throws SQLException{ 
        PreparedStatement comand_prepar = con.prepareStatement("UPDATE professor SET senha_prof = ?, nome = ?,ativ_ministrada = ? WHERE cod_prof = ?;");
        comand_prepar.setString(1, Integer.toString(senha));
        comand_prepar.setString(2, nome);
        comand_prepar.setString(3, ativ_ministrada);
        comand_prepar.setString(4, Integer.toString(login));
        comand_prepar.executeUpdate();
        con.close();
    }
    public void Atualizar_Coordenador(int cod_coordenador, int senha_coord) throws SQLException{
        PreparedStatement comand_prepar = con.prepareStatement("UPDATE coordenador SET senha_coord = ? WHERE cod_coordenador = ?;");
        comand_prepar.setString(1, Integer.toString(senha_coord));
        comand_prepar.setString(2, Integer.toString(cod_coordenador));
        
        comand_prepar.executeUpdate();
        con.close();
    }

    
    
}
