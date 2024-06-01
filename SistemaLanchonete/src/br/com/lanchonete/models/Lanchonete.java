package br.com.lanchonete.models;

public class Lanchonete {
    private String nome;
    private String descricao;

    public Lanchonete(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Lanchonete() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
