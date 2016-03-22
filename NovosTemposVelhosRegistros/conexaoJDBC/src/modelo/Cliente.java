/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SuperMouse
 */
public class Cliente {
    
    int cCodigo;
    String nome;
    String endereco;
    int fone;

    public Cliente(int cCodigo, String nome, String endereco, int fone) {
        this.cCodigo = cCodigo;
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
    }

    public Cliente() {
    }

    public String getEndereco() {
        return endereco;
    }

    public int getFone() {
        return fone;
    }

    public String getNome() {
        return nome;
    }

    public int getcCodigo() {
        return cCodigo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setcCodigo(int cCodigo) {
        this.cCodigo = cCodigo;
    }
}
