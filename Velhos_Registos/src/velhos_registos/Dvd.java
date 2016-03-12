package velhos_registos;

public class Dvd {
    private int idDvd;
    private String titulo;
    private int duracao;
    private int ano;
    private String genero;

    public Dvd(int idDvd, String titulo, int duracao,int ano, String genero) {
        this.idDvd = idDvd;
        this.titulo = titulo;
        this.duracao = duracao;
        this.ano = ano;
        this.genero = genero;

    }
    
    public int getIdDvd() {
        return idDvd;
    }

    public void setIdDvd(int idDvd) {
        this.idDvd = idDvd;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
