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
public class Professor {
    private int cod_prof;
    private int senha_prof;
    private String nome;
    private String ativ_ministrada;
    private int carga_horaria;

    public Professor(int cod_prof, int senha_prof, String nome, String ativ_ministrada, int carga_horaria) {
        this.cod_prof = cod_prof;
        this.senha_prof = senha_prof;
        this.nome = nome;
        this.ativ_ministrada = ativ_ministrada;
        this.carga_horaria = carga_horaria;
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    public int getSenha_prof() {
        return senha_prof;
    }

    public void setSenha_prof(int senha_prof) {
        this.senha_prof = senha_prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtiv_ministrada() {
        return ativ_ministrada;
    }

    public void setAtiv_ministrada(String ativ_ministrada) {
        this.ativ_ministrada = ativ_ministrada;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
    
    
}
