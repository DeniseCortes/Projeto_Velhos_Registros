/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos_Conexao;

import Objetos_Entidades.Aluno;
import Objetos_Entidades.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author denise
 */
public class Coordenador_Funcionalidades {
    Connection con;
    ResultSet resultado;
    public Coordenador_Funcionalidades(){
        con = new Conexao().Conectando();
    }    
     public ArrayList<Aluno> listarAlunos() throws SQLException {
        ArrayList<Aluno> listaAlunos = new ArrayList();
        PreparedStatement comand_prepar = con.prepareStatement("SELECT nome,atestas_medico,num_faltas FROM aluno;");
        resultado = comand_prepar.executeQuery();
        while (resultado.next()) {
            Aluno aluno = new Aluno(
                    resultado.getInt(1), resultado.getInt(2),
                    resultado.getString(3), resultado.getInt(4),
                    resultado.getString(5), resultado.getString(6)
            );
            listaAlunos.add(aluno);
            for (int i = 0; i < listaAlunos.size(); i++) {
                System.out.println(listaAlunos.get(i).getAtestas_medico()+" :"+ listaAlunos.get(i).getNome());
            }
        }
        return listaAlunos;
    }
    
     public ArrayList<Professor> listarProf() throws SQLException {
        ArrayList<Professor> listaProf = new ArrayList();
        PreparedStatement comand_prepar = con.prepareStatement("SELECT nome,ativ_ministrada FROM professor;");
        resultado = comand_prepar.executeQuery();

        while (resultado.next()) {
            Professor prof = new Professor(
                    resultado.getInt(1), resultado.getInt(2),
                    resultado.getString(3), resultado.getString(4),
                    resultado.getInt(5)
            );
            listaProf.add(prof);
            for (int i = 0; i < listaProf.size(); i++) {
                System.out.print(" " + listaProf.get(i).getNome()+" :"+listaProf.get(i).getAtiv_ministrada());
            }
        }
        return listaProf;
    }
    public void Frequencia(int cod_aluno, int novas_faltas) throws SQLException{
        PreparedStatement pst = con.prepareStatement("UPDATE aluno SET num_faltas = num_faltas + ? WHERE cod_aluno = ?;");
        pst.setString(1, Integer.toString(novas_faltas));
        pst.setString(2, Integer.toString(cod_aluno));
        pst.executeUpdate();
    }
    
}
