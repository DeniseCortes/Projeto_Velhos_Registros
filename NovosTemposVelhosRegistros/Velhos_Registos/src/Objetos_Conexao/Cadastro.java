/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos_Conexao;

import Objetos_Entidades.Aluno;
import Objetos_Entidades.Coordenador;
import Objetos_Entidades.Professor;
import Objetos_Entidades.Turma;
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
    public Cadastro(){
        con = new Conexao().Conectando();
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
    public void Cadastrar_Prof(int cod_prof, int senha_prof, String nome, String ativ_ministrada, int carga_horaria) throws SQLException{
        Professor prof = new Professor(
                cod_prof,
                senha_prof,
                nome,
                ativ_ministrada,
                carga_horaria
        );
        
        PreparedStatement comand_prepar = con.prepareStatement("INSERT INTO professor VALUES(?,?,?,?,?);");
        comand_prepar.setString(1, Integer.toString(prof.getCod_prof()));
        comand_prepar.setString(2, Integer.toString(prof.getSenha_prof()));
        comand_prepar.setString(3, prof.getNome());
        comand_prepar.setString(4, prof.getAtiv_ministrada());
        comand_prepar.setString(5,Integer.toString(prof.getCarga_horaria()));
        comand_prepar.execute();
        con.close();
    }
    public void Cadastrar_Coordenador(String nome,int senha_coord, int cod_coordenador, int turma) throws SQLException{
        Coordenador coord = new Coordenador(
                nome,
                senha_coord,
                cod_coordenador,
                turma
        );
        
        PreparedStatement comand_prepar = con.prepareStatement("INSERT INTO coordenador VALUES(?,?,?,?);");
        comand_prepar.setString(1,coord.getNome());
        comand_prepar.setString(2,Integer.toString(coord.getSenha_coord()));
        comand_prepar.setString(3,Integer.toString(coord.getCod_coordenador()));
        comand_prepar.setString(4,Integer.toString(coord.getCod_turma()));
        comand_prepar.execute();
        con.close();
    
    }
    public void Cadastrar_turma(int cod_turma, int quant_alunos, int horario, int aluno, int prof) throws SQLException{
        Turma turma = new Turma(
                cod_turma,
                quant_alunos,
                horario,
                aluno,
                prof
        );
        PreparedStatement comand_prepar = con.prepareStatement("INSERT INTO turma VALUES (?,?,?,?,?);");
        comand_prepar.setString(1, Integer.toString(turma.getCod_turma()));
        comand_prepar.setString(2, Integer.toString(turma.getQuant_alunos()));
        comand_prepar.setString(3, Integer.toString(turma.getHorario()));
        comand_prepar.setString(4, Integer.toString(turma.getAluno()));
        comand_prepar.setString(5, Integer.toString(turma.getProf()));
        comand_prepar.execute();
        con.close();    
    }
} 