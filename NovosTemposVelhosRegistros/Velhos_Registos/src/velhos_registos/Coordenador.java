/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velhos_registos;

/**
 *
 * @author rodolfo
 */
public class Coordenador {
    private String nome;
    private int cod_coordenador;
    private int cod_turma;
    private int senha_coord;

    public Coordenador(String nome, int cod_coordenador, int cod_turma, int senha_coord) {
        this.nome = nome;
        this.cod_coordenador = cod_coordenador;
        this.cod_turma = cod_turma;
        this.senha_coord = senha_coord;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod_coordenador() {
        return cod_coordenador;
    }

    public void setCod_coordenador(int cod_coordenador) {
        this.cod_coordenador = cod_coordenador;
    }

    public int getCod_turma() {
        return cod_turma;
    }

    public void setCod_turma(int cod_turma) {
        this.cod_turma = cod_turma;
    }

    public int getSenha_coord() {
        return senha_coord;
    }

    public void setSenha_coord(int senha_coord) {
        this.senha_coord = senha_coord;
    }
    
    
}
