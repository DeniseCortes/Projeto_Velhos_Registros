package velhos_registos;

public class Aluno {
    private int cod_aluno;
    private String nome;
    private String cpf;
    private int num_faltas;
    private String atestas_medico;
    private String fixa_medica;

    public Aluno(int cod_aluno, String nome, String cpf, int num_faltas,
            String atestas_medico, String fixa_medica) {
        this.cod_aluno = cod_aluno;
        this.nome = nome;
        this.cpf = cpf;
        this.num_faltas = num_faltas;
        this.atestas_medico = atestas_medico;
        this.fixa_medica = fixa_medica;
    }   

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getCod_aluno() {
        return cod_aluno;
    }

    public void setCod_aluno(int cod_aluno) {
        this.cod_aluno = cod_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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