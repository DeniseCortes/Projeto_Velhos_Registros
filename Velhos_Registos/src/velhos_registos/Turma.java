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
public class Turma {
    private int cod_turma;
    private int quant_alunos;
    private int horario;
    private Aluno aluno;
    private Professor prof;

    public Turma(int cod_turma, int quant_alunos, int horario, Aluno aluno, Professor prof) {
        this.cod_turma = cod_turma;
        this.quant_alunos = quant_alunos;
        this.horario = horario;
        this.aluno = aluno;
        this.prof = prof;
    }

    public int getCod_turma() {
        return cod_turma;
    }

    public void setCod_turma(int cod_turma) {
        this.cod_turma = cod_turma;
    }

    public int getQuant_alunos() {
        return quant_alunos;
    }

    public void setQuant_alunos(int quant_alunos) {
        this.quant_alunos = quant_alunos;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }   
}