package Objetos_Entidades;

public class Aluno {
    private int cod_aluno;
    private int senha;
    private String nome;
    private int num_faltas;
    private String atestas_medico;
    private String fixa_medica;

    public Aluno(int cod_aluno, int senha, String nome, int num_faltas, String atestas_medico, String fixa_medica) {
        this.cod_aluno = cod_aluno;
        this.senha = senha;
        this.nome = nome;
        this.num_faltas = num_faltas;
        this.atestas_medico = atestas_medico;
        this.fixa_medica = fixa_medica;
    }

    public int getCod_aluno() {
        return cod_aluno;
    }

    public void setCod_aluno(int cod_aluno) {
        this.cod_aluno = cod_aluno;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum_faltas() {
        return num_faltas;
    }

    public void setNum_faltas(int num_faltas) {
        this.num_faltas = num_faltas;
    }

    public String getAtestas_medico() {
        return atestas_medico;
    }

    public void setAtestas_medico(String atestas_medico) {
        this.atestas_medico = atestas_medico;
    }

    public String getFixa_medica() {
        return fixa_medica;
    }

    public void setFixa_medica(String fixa_medica) {
        this.fixa_medica = fixa_medica;
    }

    
    
}