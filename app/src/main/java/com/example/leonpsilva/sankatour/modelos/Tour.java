package com.example.leonpsilva.sankatour.modelos;

public class Tour {

    private String id;
    private String nome;
    private Double descricao;
    private Integer Imagem;


    public Tour(String id, String nome, Double descricao , Integer imagem) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.Imagem = imagem;
    }

    public Integer getImagem() {
        return Imagem;
    }

    public void setImagem(Integer imagem) {
        Imagem = imagem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDescricao() {
        return descricao;
    }

    public void setDescricao(Double descricao) {
        this.descricao = descricao;
    }
}
