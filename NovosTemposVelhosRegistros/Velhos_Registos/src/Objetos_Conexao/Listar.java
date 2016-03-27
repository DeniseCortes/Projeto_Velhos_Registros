/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos_Conexao;

import Objetos_Entidades.Professor;
import Objetos_Entidades.Aluno;
import Objetos_Entidades.Coordenador;
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
    ResultSet resultado;

    public Listar() {
        con = new Conexao().Conectando();
    }

    public ArrayList<Aluno> listarAlunos() throws SQLException {
        ArrayList<Aluno> listaAlunos = new ArrayList();
        PreparedStatement comand_prepar = con.prepareStatement("SELECT * FROM aluno;");
        resultado = comand_prepar.executeQuery();
        while (resultado.next()) {
            Aluno aluno = new Aluno(
                    resultado.getInt(1), resultado.getInt(2),
                    resultado.getString(3), resultado.getInt(4),
                    resultado.getString(5), resultado.getString(6)
            );
            listaAlunos.add(aluno);
            for (int i = 0; i < listaAlunos.size(); i++) {
                System.out.println(" " + listaAlunos.get(i));
            }
        }
        return listaAlunos;
    }

    public ArrayList<Professor> listarProf() throws SQLException {
        ArrayList<Professor> listaProf = new ArrayList();
        PreparedStatement comand_prepar = con.prepareStatement("SELECT * FROM professor;");
        resultado = comand_prepar.executeQuery();

        while (resultado.next()) {
            Professor prof = new Professor(
                    resultado.getInt(1), resultado.getInt(2),
                    resultado.getString(3), resultado.getString(4),
                    resultado.getInt(5)
            );
            listaProf.add(prof);
            for (int i = 0; i < listaProf.size(); i++) {
                System.out.print(" " + listaProf.get(i));
            }
        }
        return listaProf;
    }

    public ArrayList<Coordenador> listaCoord() throws SQLException {
        ArrayList<Coordenador> lista = new ArrayList();

        PreparedStatement comand_prepar = con.prepareStatement("SELECT * FROM coordenador;");
        resultado = comand_prepar.executeQuery();

        while (resultado.next()) {
            Coordenador coord = new Coordenador(
                    resultado.getString(1),
                    resultado.getInt(2),
                    resultado.getInt(3),
                    resultado.getInt(4)
            );
            lista.add(coord);
        }

        return lista;
    }
}
